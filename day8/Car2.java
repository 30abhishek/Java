package com.company.day8;

public class Car2 {
    private Integer id;
    private Double speed;
    private String name;
    private Float horsePower;
    private Character maker;
    private Boolean isHatchBack;
    private Long carNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(float horsePower) {
        this.horsePower = horsePower;
    }

    public Character getMaker() {
        return maker;
    }

    public void setMaker(Character maker) {
        this.maker = maker;
    }

    public Boolean getisHatchBack() {
        return isHatchBack;
    }

    public void setisHatchBack(Boolean hatchBack) {
        isHatchBack = hatchBack;
    }

    public Long getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(Long carNumber) {
        this.carNumber = carNumber;
    }

    Car2(){

    }
    public Car2(int id, Double speed, String name, float horsePower, Character maker, Boolean isHatchBack, Long carNumber) {
        this.id = id;
        this.speed = speed;
        this.name = name;
        this.horsePower = horsePower;
        this.maker = maker;
        this.isHatchBack = isHatchBack;
        this.carNumber = carNumber;
    }
}

