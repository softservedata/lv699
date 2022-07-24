package com.softserve.hw07.second;

public class Helicopter extends FlyingVehicle{
   private int weight;
   private int maxHeight;

    public Helicopter() {
        weight=0;
        maxHeight=0;
    }

    @Override
    void fly() {
        System.out.println("fly a Helicopter");
    }

    @Override
    void land() {
        System.out.println("Helicopter is on land");
    }

}
