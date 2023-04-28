package com.omda.springbootrestapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home() {
        //System.out.println("Hello World");
        String name = "omda";
        return "hello "+ name;
    }
}
