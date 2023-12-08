package com.c2j.baidoufuc2j.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * @Author Baidoufu
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class FunctionCallResult {

    String name;

    String arguments;
}
