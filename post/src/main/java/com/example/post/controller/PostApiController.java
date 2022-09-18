package com.example.post.controller;

import com.example.post.dto.PostApiDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/api")
public class PostApiController {

    @PostMapping("/post")
    public void post(@RequestBody PostApiDto data){
        System.out.println(data.toString());
    }


    // 매핑방법
    @PostMapping("/post2")
    public void post(@RequestBody Map<String , Object> data){
        data.entrySet().forEach(
                params->{
                    System.out.println(params.getKey());
                    System.out.println(params.getValue());
                }
        );
    }
}



