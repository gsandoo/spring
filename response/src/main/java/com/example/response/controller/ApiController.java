package com.example.response.controller;

import com.example.response.dto.PostRequestDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/get/{userid}")
    public String get(@PathVariable String userid , @RequestParam String account){

        return userid + account;
    }
    @PostMapping("/post")
    public PostRequestDto post(@RequestBody PostRequestDto requestDto)
    {
        return  requestDto;
    }
    @PutMapping("/put")
    public  ResponseEntity<PostRequestDto> put(@RequestBody PostRequestDto requestDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(requestDto);
    }
}
