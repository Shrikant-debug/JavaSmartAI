package com.AI.Jarvis.service;

import lombok.Data;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.ollama.OllamaChatModel;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Data
@Service
public class AiService {

    @Autowired
   private final OllamaChatModel ollamaChatModel;

    public String getAIResponse(String prompt){
        Prompt aiPrompt = new Prompt(prompt);
        var response = ollamaChatModel.call(aiPrompt);

        return response.getResult().getOutput().getText();
    }

}
