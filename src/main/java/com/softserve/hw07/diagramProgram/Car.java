package com.softserve.hw07.diagramProgram;

public class Car extends GroundVehicle{
    private String model;

    public Car() {
        model = "";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void drive() {
        super.drive();
    }
}
