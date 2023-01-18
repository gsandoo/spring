package com.example.iocspring;

import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
@Component
public class UrlEncoding implements IEncoder { // 상속

    public String encode(String message){
        try {
            return URLEncoder.encode(message , "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
