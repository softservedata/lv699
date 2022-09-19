package com.softserve.hw06.Task01;

public class Swallow extends FlyingBird {
    public Swallow(String feathers, int layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly(){
        System.out.println("I am Swallow and i can fly");
    }

    @Override
    public String toString() {
        return "Swallow{" +
                "feathers='" + getFeathers() + '\'' +
                ", layEggs=" + getLayEggs() +
                '}';
    }
}
