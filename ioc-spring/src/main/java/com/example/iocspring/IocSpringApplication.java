package com.example.iocspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// IOC 프로그래밍:
// 스프링에서 작동. 개발자가 아닌 스프링이 작동권한을 모두 가져감.(제어의 역전)
// 관리당하는 객체들이 Bean 이라고 불림 . Bean들을 관리하는 장소가 Spring Container 이다.
// 각 객체들에 어노테이션 @Component 붙혀서 스프링이 권한 가져가게함
// AppConfig로도 관리 가능함.

@SpringBootApplication
public class IocSpringApplication {

    public static void main(String[] args) {

        SpringApplication.run(IocSpringApplication.class, args);
        ApplicationContext context = ApplicationContextProvider.getContext();
        //Base64Encoder base64Encoder = context.getBean("Base64Encode",Base64Encoder.class);
        //Encoder encoder = new Encoder(base64Encoder);
        Encoder encoder = context.getBean("UrlEncode",Encoder.class);
        String url = "www.naver.com/books/it?page=10";
        String result = encoder.encode(url);
        System.out.println(result);
    }

}

@Configuration
class  AppConfig{
    @Bean("Base64Encode")
    public  Encoder encoder(Base64Encoder base64Encoder){
        return new Encoder(base64Encoder);
    }
    @Bean("UrlEncode")
    public Encoder encoder(UrlEncoding urlEncoding){
        return  new Encoder(urlEncoding);
    }
}
