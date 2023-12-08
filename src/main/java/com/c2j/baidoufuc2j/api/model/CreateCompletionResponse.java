package com.c2j.baidoufuc2j.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @Author Baidoufu
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateCompletionResponse {
    private String id;
    private String object;
    private long created;
    private String model;
    @JsonProperty("system_fingerprint")
    private String systemFingerprint;
    private List<ChatChoice> choices;
    private Usage usage;
}

