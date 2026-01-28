package com.springAI.SpringAIDemo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springAI.SpringAIDemo.model.EnterpriseResponse;
import com.springAI.SpringAIDemo.service.LearningService;

@RestController
public class AiController {

    private final LearningService learningService;

    // Use Constructor Injection instead of @Autowired
    public AiController(LearningService learningService) {
        this.learningService = learningService;
    }

    @PostMapping("/ai/generate")
    public String generate(@RequestParam(name = "message", defaultValue = "Tell me a joke") String query) {
        return learningService.getAiResponse(query);
    }

    @PostMapping("/ai/structured")
    public EnterpriseResponse generateStructured(@RequestParam(name = "message") String query) {
        return learningService.getStructuredResponse(query);
    }
}