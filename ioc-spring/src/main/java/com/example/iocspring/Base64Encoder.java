package com.example.iocspring;

import org.springframework.stereotype.Component;

import java.util.Base64;
@Component
public class Base64Encoder implements IEncoder { // 상속

    public String encode(String message){
        return Base64.getEncoder().encodeToString(message.getBytes());
    }
}
