package com.example.main.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main-controller")
public class MainController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
}
