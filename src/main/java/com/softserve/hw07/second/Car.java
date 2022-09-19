package com.softserve.hw07.second;

public class Car extends GroundVehicle{
    private String model;

    public Car() {
        model="";
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    void drive() {
        System.out.println("drive a Car");
    }
}
