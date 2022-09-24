package com.example.response.dto;


import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

// JsonNaming : 카멜케이스 , 스네이크 케이스 통일화
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class CarDto {

    private String carName;
    private String carNum;

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarNum() {
        return carNum;
    }

    public void setCarNum(String carNum) {
        this.carNum = carNum;
    }

    @Override
    public String toString() {
        return "CarDto{" +
                "carName='" + carName + '\'' +
                ", carNum='" + carNum + '\'' +
                '}';
    }
}
