package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HelloController {

    public String helloWorld(){
        return "Hello world @"+ new Date();
    }
}
