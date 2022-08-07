package com.softserve.hw07.diagramProgram;

public class Plane extends FlyingVehicle{
    private int maxDistance;

    public Plane() {
        maxDistance = 0;
    }

    @Override
    public void fly() {
        super.fly();
    }

    @Override
    public void land() {
        super.land();
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
}
