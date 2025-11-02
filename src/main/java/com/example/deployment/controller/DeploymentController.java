package com.example.deployment.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController

public class DeploymentController {

    @GetMapping("/")
    public String getMessage() {
        return "Deployment Successful!";
    }

}
