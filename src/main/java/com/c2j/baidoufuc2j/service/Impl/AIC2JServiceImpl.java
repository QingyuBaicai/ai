package com.c2j.baidoufuc2j.service.Impl;

import com.c2j.baidoufuc2j.answerer.AiAnswerer;
import com.c2j.baidoufuc2j.service.AIC2JService;
import org.springframework.stereotype.Service;


/**
 * @Author Baidoufu
 */
@Service
public class AIC2JServiceImpl implements AIC2JService {
    @Override
    public String translate(String prompt) {
        AiAnswerer aiAnswerer = new AiAnswerer();
        return aiAnswerer.doAnswer(prompt);
    }
}
