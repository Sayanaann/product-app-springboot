package com.example.productapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class productcontroller {

    @GetMapping("/")
    public String Homepage(){
        return "welcome to product app";

    }
}
