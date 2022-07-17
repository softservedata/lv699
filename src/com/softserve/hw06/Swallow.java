package com.softserve.hw06;

public class Swallow extends FlyingBird {

    String name;
    protected boolean feathers= true;
    public Swallow (String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bird's name: " + name + ", feathers: " + feathers +
                ", layEggs: " + layEggs + "\n";
    }
}
