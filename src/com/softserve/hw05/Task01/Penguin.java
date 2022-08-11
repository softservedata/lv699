package com.softserve.hw05.Task01;

public class Penguin extends NonFlyingBird{
    public Penguin(String feathers, int layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        super.cantFly();
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "feathers='" + getFeathers() + '\'' +
                ", layEggs=" + getLayEggs() +
                '}';
    }
}
