package com.softserve.hw06;

public class NotFlyingBird extends Bird {


    @Override
    public String toString() {
        return "NotFlyingBird{" +
                "feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }

    @Override
    public boolean fly() {
        return false;

    }
}
