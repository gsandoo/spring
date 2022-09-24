package com.example.objectmapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ObjectMapperApplicationTests {

    @Test
    void contextLoads() throws JsonProcessingException {
        System.out.println("Let's start Object Mapper!");

        var objectMapper = new ObjectMapper();


        // object mapper :  문자를 object로 , object를 문자 형태로 변환 시켜준다.

        // object -> text
        // objectMapper 는 get method가 있어야 한다.

        var user = new User("steve" , 10 , "010-2222-2222");

        var text = objectMapper.writeValueAsString(user);
        System.out.println(text);



        // text -> object
        // objectMapper 는 default 생성자가 있어야한다.

        var objectUser = objectMapper.readValue(text , User.class);
        System.out.println(objectUser);


    }

}
