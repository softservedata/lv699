package com.softserve.homework.task7.passengers;

public class Car extends GroundVehicle{
    private String model;
    Car(){}

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void drive() {

    }
}
