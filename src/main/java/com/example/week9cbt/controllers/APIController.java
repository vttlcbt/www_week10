package com.example.week9cbt.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class APIController {
    @GetMapping()
    public String showAPI(){
        return "API session";
    }

    @GetMapping("/detail")
    public String showRole(){
        return "Role Admin";
    }
}
