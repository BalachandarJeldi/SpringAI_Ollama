package com.springAI.SpringAIDemo.model;

import java.util.List;

public record EnterpriseResponse (String answer, String Category, int confidenceScore, List<String> suggestedNextSteps) {
}
