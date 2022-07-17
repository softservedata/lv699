package com.softserve.hw06.bird;

public class NonFlyingBirds extends Bird {
    @Override
    public boolean fly() {
        System.out.println("This type of birds is unable to fly.");
        return false;
    }

    @Override
    public String toString() {
        return "NonFlyingBirds{}";
    }
}
