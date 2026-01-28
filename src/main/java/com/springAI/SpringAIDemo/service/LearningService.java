package com.springAI.SpringAIDemo.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

import com.springAI.SpringAIDemo.model.EnterpriseResponse;

@Service
public class LearningService {

    private final ChatClient chatClient;

    public LearningService(ChatClient.Builder builder) {
        // The builder is automatically configured by the Ollama starter
        this.chatClient = builder.build();
    }

    public String getAiResponse(String userInput) {
        return chatClient.prompt()
                .user(userInput)
                .call()
                .content();
    }

    public EnterpriseResponse getStructuredResponse(String userInput) {
        return chatClient.prompt()
                .user(userInput)
                .call()
                .entity(EnterpriseResponse.class); // This maps the JSON directly to your Record
    }
}