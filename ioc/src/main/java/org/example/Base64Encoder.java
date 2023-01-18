package org.example;

import java.util.Base64;

public class Base64Encoder implements IEncoder { // 상속

    public String encode(String message){
        return Base64.getEncoder().encodeToString(message.getBytes());
    }
}
