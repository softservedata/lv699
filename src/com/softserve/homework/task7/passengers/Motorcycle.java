package com.softserve.homework.task7.passengers;

public class Motorcycle extends GroundVehicle{
    private int maxSpeed;
    Motorcycle(){

    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void drive() {

    }
}
