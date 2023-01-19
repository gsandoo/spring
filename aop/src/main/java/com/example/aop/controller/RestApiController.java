package com.example.aop.controller;

import com.example.aop.dto.User;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;

@RestController
@RequestMapping("/api")
public class RestApiController {
    @GetMapping("/get/{id}")
    public String get(@PathVariable Long id , @RequestParam String name , String email){
        System.out.println("get method");
        System.out.println("get method: "+id);
        System.out.println("get method: "+name);
        System.out.println("get method: "+email);
        return id+ " " + name+ " " + email;
    }
    @PostMapping("/post")
    public User post(@RequestBody User user){
        System.out.println("post method: "+user);
        return user;
    }
}

