package com.softserve.homework.task7.passengers;

public class Plane extends FlyingVehicle{
    private int maxDistance;
    Plane(){}

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    public void fly() {

    }

    @Override
    public void land() {
        super.land();
    }
}
