package com.example.iocspring;


//1. 인터페이스 상속받고
//2. 정의 내려주고
//3. 메소드 정의 해주고
//4. 하위클래스에서 메소드 활용 할 것 임.

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Encoder {
    private IEncoder iEncoder; // 인터페이스 IEncoder


    public  Encoder(@Qualifier("urlEncoding") IEncoder iEncoder){

        this.iEncoder = iEncoder;
    }

    public String encode(String message){

        return iEncoder.encode(message);
    }
}
