package com.softserve.hw06.bird;

public class FlyingBird extends Bird {
    @Override
    public boolean fly() {
        System.out.println("This type of bird is able to fly.");
        return true;
    }

    @Override
    public String toString() {
        return "FlyingBird{}";
    }
}
