package com.example.springchatgpt.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class ChatGPTRequest {

    private String model = "text-davinci-003";
//    private String model = "gpt-3.5-turbo";
    private String prompt;
    private int temperature = 1;

//    @JsonProperty(value = "max_tokens")
    @SerializedName(value = "max_tokens")
    private int maxTokens = 100;

}
