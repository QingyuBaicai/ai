package com.c2j.baidoufuc2j.controller;

import com.c2j.baidoufuc2j.service.AIC2JService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Baidoufu
 */
@RestController
public class AIC2JController {

    private final AIC2JService aic2JService;

    public AIC2JController(AIC2JService aic2JService) {
        this.aic2JService = aic2JService;
    }

    @PostMapping("/ai/translate/")
    public String translate() {
        String prompt = "中国四大名著有哪些？";
        return aic2JService.translate(prompt);
    }
}
