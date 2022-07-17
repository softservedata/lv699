package com.softserve.hw06;

public class FlyingBird extends Bird {


    @Override
    public boolean fly() {
        return true;
    }

    @Override
    public String toString() {
        return "FlyingBird{" +
                "feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}
