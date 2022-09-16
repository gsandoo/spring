package com.example.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // 해당 클래스는 Rest API 를 처리하는 컨트롤러로 등록
@RequestMapping("/api") //RequestMapping URI 를 지정해주는 Annotation
public class ApiController {

    @GetMapping("/hello")  // http://localhost:8080/api/hello 로 매핑
    public String hello(){
        return  "hello spring Boot ! ";
    }

}
