package com.example.hello.controller;

import com.example.hello.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

    //get
    @GetMapping(path = "/hello") //http://localhost:8080/api/get/hello
    public String hello(){
        return "get hello ! ";
    }

    //mapping = method -> get
    @RequestMapping(path = "/hi" , method = RequestMethod.GET)
    public String hi(){
        return "hi , spring Boot ! ";
    }

    @RequestMapping (path = "/path-variable/{name}"  , method = RequestMethod.GET)
    public String pathVariable(@PathVariable(name = "name") String pathName ){
        System.out.println("path-variable : " + pathName);
        return pathName;
    };

    //query-parameter 받는법:
    //?key1=value1&key2=value2&key3=value3 ... 형태의 꼴을 띈다.

    // 1. 객체 형태로 , dto 사용 (선호)
    // 2. 매핑해서
    // 3. 인자에 입력


    // 1번 사용법
    // 주의 : 인자에 객체 자체를 넣고 , @RequestParam 은 쓰지 않는다.
    @GetMapping("query-param")
    public  String queryParam(UserRequest userRequest){

        System.out.println(userRequest.getName());
        System.out.println(userRequest.getEmail());
        System.out.println(userRequest.getAge());

        return  userRequest.toString();
    }


    // 2번사용법
    @GetMapping("query-param02")
    public String queryParam02(@RequestParam Map<String , String> queryParam){

        // 문자열로 변환시켜줌.
        StringBuilder sb = new StringBuilder();

        queryParam.entrySet().forEach(entry->{
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("\n");

            sb.append(entry.getKey() + " = " + entry.getValue());
        });

        return (sb.toString()) ;
    }

    // 3번 사용법. 인자로 받기
    @GetMapping("query-param03")
    public String queryParam03(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam int age)
    {
        System.out.println(name);
        System.out.println(email);
        System.out.println(age);
        return  name + " " + email + " " + age ;
    };

}
