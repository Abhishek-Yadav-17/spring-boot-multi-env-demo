package com.example.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AppService {

    @Value("${app.environment}")
    private String environment;

    public void printEnvironment() {
        System.out.println("Running in environment: " + environment);
    }
}