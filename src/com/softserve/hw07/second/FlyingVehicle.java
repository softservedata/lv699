package com.softserve.hw07.second;

public abstract class FlyingVehicle extends Passengers implements Vehicle {
    public FlyingVehicle() {
    }
    abstract void fly();
    abstract void land();
}
