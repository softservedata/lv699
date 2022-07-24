package com.softserve.hw07.second;

public class Plane  extends FlyingVehicle{

    private int maxDistance;

    public Plane() {
        maxDistance=0;
    }

    @Override
    void fly() {
        System.out.println("fly a Plane");
    }

    @Override
    void land() {
        System.out.println("Plane is on land");
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
}
