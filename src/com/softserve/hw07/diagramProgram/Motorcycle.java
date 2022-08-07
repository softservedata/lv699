package com.softserve.hw07.diagramProgram;

public class Motorcycle extends GroundVehicle{
    private int maxSpeed;

    public Motorcycle() {
        maxSpeed = 0;
    }

    @Override
    public void drive() {
        super.drive();
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
