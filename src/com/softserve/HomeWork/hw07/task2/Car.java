package com.softserve.HomeWork.hw07.task2;

public class Car extends GroundVehicle{
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Car(String mmm, int i){

    }

    @Override
    void drive() {
        System.out.println("Машина їде по землі");

    }
}
