package com.softserve.hw06.Task01;

public class Chicken extends NonFlyingBird{
    public Chicken(String feathers, int layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        super.cantFly();
    }

    @Override
    public String toString() {
        return "Chicken{" +
                "feathers='" + getFeathers() + '\'' +
                ", layEggs=" + getLayEggs() +
                '}';
    }
}
