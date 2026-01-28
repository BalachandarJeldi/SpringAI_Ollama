# SpringAIDemo

This project is a Spring Boot application demonstrating integration with Spring AI and (optionally) Ollama for AI-powered chat features.

## Description
A Spring Boot 3.5.9 demo app integrating Spring AI (Java 21). Ready for Ollama support when available. Includes REST endpoints for AI chat and a minimal service layer. Easily extendable for advanced AI features or custom integrations.

## Features
- Spring Boot 3.5.9
- Java 21
- Spring AI integration (version depends on your configuration)
- Ready for extension to support Ollama (if/when the starter is available)

## Folder Structure
```
SpringAIDemo/
├── build.gradle
├── src/
│   ├── main/
│   │   ├── java/com/springAI/SpringAIDemo/
│   │   │   ├── SpringAiDemoApplication.java
│   │   │   ├── controller/
│   │   │   │   └── AiController.java
│   │   │   ├── model/
│   │   │   │   └── EnterpriseResponse.java
│   │   │   └── service/
│   │   │       └── LearningService.java
│   │   └── resources/
│   │       ├── application.properties
│   │       ├── static/
│   │       └── templates/
│   └── test/
│       └── java/com/springAI/SpringAIDemo/
│           └── SpringAiDemoApplicationTests.java
├── README.md
├── HELP.md
├── gradlew
├── gradlew.bat
├── settings.gradle
└── ...
```

## How to Build and Run
1. **Build the project:**
   ```sh
   ./gradlew clean build
   ```
2. **Run the application:**
   ```sh
   ./gradlew bootRun
   ```
3. **Access the API:**
   - Main endpoint: `POST /ai/generate` (see `AiController.java`)

## Ollama Integration
- To enable Ollama support, add the following dependency (if available):
  ```gradle
  implementation 'org.springframework.ai:spring-ai-ollama-spring-boot-starter'
  ```
- Ensure you are using a Spring AI version that provides this starter and that the correct repository is included.
- As of now, this starter may not be available in public repositories for 1.1.2 or 2.0.0-M2.

## Notes
- The current `LearningService` is a minimal stub for compatibility. Extend it to add chat or AI features as needed.
- For chat memory or advanced AI features, upgrade to a compatible Spring AI version and follow the latest documentation.

## License
This project is licensed under the Apache License 2.0.
