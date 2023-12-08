package com.c2j.baidoufuc2j.api;

import cn.hutool.http.HttpRequest;
import cn.hutool.json.JSONUtil;
import com.c2j.baidoufuc2j.api.model.CreateCompletionRequest;
import com.c2j.baidoufuc2j.api.model.CreateCompletionResponse;
import com.c2j.baidoufuc2j.common.ErrorCode;
import com.c2j.baidoufuc2j.exception.BusinessException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
 * @Author Baidoufu
 */
@Service
public class OpenAiApi {

    public CreateCompletionResponse createCompletion(CreateCompletionRequest request, String openAiApiKey) {
        if (StringUtils.isBlank(openAiApiKey)) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "未传 openAiApiKey");
        }
        String url = "https://api.openai.com/v1/completions";
        String json = JSONUtil.toJsonStr(request);
        String result = HttpRequest.post(url)
                .header("Authorization", "Bearer " + openAiApiKey)
                .body(json)
                .execute()
                .body();
        return JSONUtil.toBean(result, CreateCompletionResponse.class);
    }
}
