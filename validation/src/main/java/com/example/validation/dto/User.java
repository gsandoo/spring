package com.example.validation.dto;

import com.example.validation.annotation.YearMonth;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;

@JsonNaming(PropertyNamingStrategies.LowerCamelCaseStrategy.class)
public class User {
    @NotBlank
    private  String name;
    @Max(value = 90)
    private  int age;
    @NotBlank
    private  String address;
    @Email
    private  String email;
    @Pattern(regexp = "^\\d{2,3}-\\d{3,4}-\\d{4}$" , message = "핸드폰 번호의 양식과 맞지 않습니다")
    private  String phoneNumber;

    @YearMonth
    private  String reqYM; // yyyyMM

    @Valid
    private List<Car> cars;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getReqYM() {
        return reqYM;
    }

    public void setReqYM(String reqYM) {
        this.reqYM = reqYM;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", reqYM='" + reqYM + '\'' +
                '}';
    }
}
