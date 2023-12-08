package com.c2j.baidoufuc2j.answerer;
import com.c2j.baidoufuc2j.api.OpenAiApi;
import com.c2j.baidoufuc2j.api.model.CreateCompletionRequest;
import com.c2j.baidoufuc2j.api.model.CreateCompletionResponse;
import com.c2j.baidoufuc2j.api.model.Message;
import com.c2j.baidoufuc2j.config.OpenAiConfig;
import com.c2j.baidoufuc2j.utils.SpringContextUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author Baidoufu
 */
@Slf4j
public class AiAnswerer implements Answerer {

    private final OpenAiApi openAiApi = SpringContextUtils.getBean(OpenAiApi.class);
    private final OpenAiConfig openAiConfig = SpringContextUtils.getBean(OpenAiConfig.class);
    Message system = Message.ofSystem("你现在是一个诗人，专门写七言绝句");
    Message message = Message.of("写一段七言绝句诗，题目是：火锅！");
    @Override
    public String doAnswer(String prompt) {
        CreateCompletionRequest request = new CreateCompletionRequest();
//        request.setPrompt(prompt);
        request.setMessages(Arrays.asList(system, message));
        request.setModel(openAiConfig.getModel());
        request.setTemperature(0);
        request.setMaxTokens(1024);
        CreateCompletionResponse response = openAiApi.createCompletion(request, openAiConfig.getApiKey());
        String answer = response.getChoices().get(0).getMessage().getContent();
//        List<CreateCompletionResponse> choicesItemList = response.getChoices();
//        String answer = choicesItemList.stream()
//                .map(CreateCompletionResponse.ChoicesItem::getText)
//                .collect(Collectors.joining());
        log.info("AiAnswerer 回答成功 \n 答案：{}", answer);
        return answer;
    }
}
