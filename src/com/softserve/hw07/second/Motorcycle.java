package com.softserve.hw07.second;

public class Motorcycle extends GroundVehicle{
   private int maxSpeed;

    public Motorcycle() {
        maxSpeed=0;
    }
    @Override
    void drive() {
        System.out.println("drive a Motorcycle");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
