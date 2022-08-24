package com.example.cloud.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackServiceController {
    @GetMapping("/employeeServiceFallBack")
    public String employeeServiceFallBackMethod() {
        return("employee service has issues, taking more time to respond");
    }
    @GetMapping("/departmentServiceFallBack")
    public String departmentServiceFallBack() {
        return("department service has issues, taking more time to respond");
    }
}
