package com.example.response.dto;

import java.util.List;

public class PostRequestDto {

    private String name;
    private  String address;
    private int age;
    private List<CarDto> car;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<CarDto> getCar() {
        return car;
    }

    public void setCar(List<CarDto> car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "PostRequestDto{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", car=" + car +
                '}';
    }
}
