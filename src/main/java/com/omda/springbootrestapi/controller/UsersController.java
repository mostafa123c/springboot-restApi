package com.omda.springbootrestapi.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class UsersController {
    //--Routes

    //@RequestMapping(value = "/users", method = RequestMethod.POST)
    //@PostMapping("/users")
    @GetMapping("/users/{id}")
    public String hello(@PathVariable String id) {
        return "hello " + id;
    }


    @GetMapping("/path/{id}")
    public String helloWithDifferentPathVarName(@PathVariable("id") String uuid) {
        return "hello! " + uuid;
    }


    //Query Param

    @GetMapping("/user/{id}")
    public String heyy(@PathVariable("id") String uuid ,
                       @RequestParam String name ,
                       @RequestParam(required = false , defaultValue = "" , name = "email") String userEmail
    ){
        return "hello " + name +"__" + userEmail;
    }
}
