package com.c2j.baidoufuc2j;

import com.c2j.baidoufuc2j.service.AIC2JService;
import com.plexpt.chatgpt.ChatGPT;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class BaidoufuC2JApplicationTests {
    @Test
    void aiTest() {
        ChatGPT chatGPT = ChatGPT.builder()
                .apiKey("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")
                .build()
                .init();

        String res = chatGPT.chat("写一段七言绝句诗，题目是：火锅！");
        System.out.println(res);
    }

}
