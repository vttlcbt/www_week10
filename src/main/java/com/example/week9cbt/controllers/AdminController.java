package com.example.week9cbt.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @GetMapping()
    public String showAdmin(){
        return "ADMIN";
    }

    @GetMapping("/admin1")
    public String demo1(){
        return "Demo1";
    }

}
