package com.example.productapp_backend.controller;

import com.example.productapp_backend.dao.productdao;
import com.example.productapp_backend.model.product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController


public class productcontroller {
    @Autowired
    private productdao dao;
@CrossOrigin(origins = "*")
    @GetMapping("/")
    public String Homepage(){
        return "welcome to product app";

    }
    @PostMapping(path="/add",consumes = "application/json",produces = "application/json")
    public String Productadd(@RequestBody product p){
    dao.save(p);
        return "Add the product ";

    }
    @CrossOrigin(origins = "*")
    @GetMapping("/viewall")
    public List<product>Productview(){
        return (List<product>) dao.findAll();

    }

}
