package com.example.response.controller;


import com.example.response.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {
    @RequestMapping("/main") // main으로 로컬주소 검색하면 main.html 이 나온다.
    public String main(){

        return "main.html"; // return 값
    }

    @ResponseBody
    @GetMapping("/user")
    public User user(){

        var user = new User();
        user.setAddress("패스트캠퍼스");

        user.setName("김창식");
        user.setPhoneNumber("010-1111-2222");
        return user;
    }
}
