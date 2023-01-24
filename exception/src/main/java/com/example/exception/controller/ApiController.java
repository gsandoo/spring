package com.example.exception.controller;


import com.example.exception.dto.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/user")
public class ApiController {

    // required = false : 파라미터가 없어도 동작은 하되 null로 됨
    @GetMapping("")
    public User get(@RequestParam(required = false) String name , @RequestParam(required = false) Integer age){
        User user  = new User();
        user.setAge(age);
        user.setName(name);

        int a = 10 + age;
        return user;
    }

    @PostMapping("")
    public User post(@Valid @RequestBody User user){
        System.out.println(user);
        return user;
    }

    // global exception을 생성해도 특정 클래스 안에 exception을 만듦ㄴ 무조건 해당 클래스에 exeption 처리는 이 코드가 1순위다
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public ResponseEntity MethodArgumentNotValidException(MethodArgumentNotValidException e){
        System.out.println("api controller first");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
    }
}
