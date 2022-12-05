package com.example.productapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class productcontroller {

    @GetMapping("/")
    public String Homepage(){
        return "welcome to product app";

    }
    @PostMapping("/add")
    public String Productadd(){
        return "Add the product ";

    }
    @PostMapping("/search")
    public String Productsearch(){
        return "Search the product ";

    }
    @PostMapping("/edit")
    public String Productedit(){
        return "Edit the product ";

    }
}
