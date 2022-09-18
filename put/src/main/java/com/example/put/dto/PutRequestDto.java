package com.example.put.dto;

import java.util.List;

public class PutRequestDto {

    private String name;
    private String address;
    private List<CarListDto> car;

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

    public List<CarListDto> getCar() {
        return car;
    }

    public void setCar(List<CarListDto> car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "PutRequestDto{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", car=" + car +
                '}';
    }
}
