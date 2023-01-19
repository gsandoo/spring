package com.example.validation.controller;


import com.example.validation.dto.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class ApiController {

    // valid : validation
    // bindingResult : validate 한 결과 값
    // StringBuilder : String 형태로 만들어줌
    // fieldError : 필드에러
    @PostMapping("/user")
    public ResponseEntity user(@Valid @RequestBody User user , BindingResult bindingResult){
        System.out.println(user);
        if(bindingResult.hasErrors()){
            StringBuilder sb = new StringBuilder();
            // 모든에러를 찾아서 에러가 난 필드 선언 후 메세지 출력
            bindingResult.getAllErrors().forEach(e-> {
                FieldError field = (FieldError) e;
                String message = e.getDefaultMessage();

                System.out.println(message);

                sb.append("field : "+ field.getField());

                sb.append("message :"+ message);
            });
            return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body(sb.toString());
        }
        System.out.println(user);
        return  ResponseEntity.ok(user);
    }

}
