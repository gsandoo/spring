package com.example.put.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

// JsonNaming: 아래 클래스의 snake_case 를 camelCase 와 매핑시켜준다.
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class CarListDto {

    private String name;
//    @JsonProperty("car_number")
    private String carNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    @Override
    public String toString() {
        return "CarListDto{" +
                "name='" + name + '\'' +
                ", carNumber='" + carNumber + '\'' +
                '}';
    }
}
