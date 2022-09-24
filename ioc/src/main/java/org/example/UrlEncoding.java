package org.example;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class UrlEncoding implements IEncoder {

    public String encode(String message){
        try {
            return URLEncoder.encode(message , "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
