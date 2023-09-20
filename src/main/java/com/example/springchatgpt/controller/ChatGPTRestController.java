package com.example.springchatgpt.controller;

import com.example.springchatgpt.model.SearchRequest;
import com.example.springchatgpt.service.ChatGPTService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/api")
public class ChatGPTRestController {


    private ChatGPTService chatGPTService;

    public ChatGPTRestController(ChatGPTService chatGPTService) {
        this.chatGPTService = chatGPTService;
    }

    @PostMapping("/gpt")
    public String search(@RequestBody SearchRequest searchRequest) {
        log.info("Started Query : " + searchRequest.getQuery());



        return chatGPTService.processSearch(searchRequest.getQuery());
    }
}


