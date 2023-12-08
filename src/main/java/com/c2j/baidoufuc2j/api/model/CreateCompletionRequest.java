package com.c2j.baidoufuc2j.api.model;

import lombok.Data;

import java.util.List;

/**
 * @Author Baidoufu
 */
@Data
public class CreateCompletionRequest {
    private String model;
    private String prompt;
    private List<Message> messages;
    private Integer maxTokens;
    private Integer temperature;
    private Integer topP;
    private Integer n;
    private Boolean stream;
    private Integer logprobs;
    private String stop;
}
