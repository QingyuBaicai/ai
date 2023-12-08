package com.c2j.baidoufuc2j.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * OpenAi 配置
 *
 */
@Configuration
//@ConfigurationProperties(prefix = "openai")
@Data
public class OpenAiConfig {

    /**
     * 模型
     */
    private String model = ModelConstant.GPT_3_5_TURBO;

    /**
     * apiKey
     */
    private String apiKey = "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";
}
