package com.learning.runnerz;

import org.springframework.stereotype.Component;

@Component
public class WelcomeMessage {
    public String getMessage() {
        return "Welcome to the Spring Boot application";
    }
}
