package com.softserve.hw06;

public class Chiken extends NotFlyingBird {
    String name;
    protected boolean feathers = true;

    public Chiken (String name) {
        this.name = name;
    }
@Override
    public String toString() {
        return "Bird's name: " + name + ", feathers: " + feathers +
                ", layEggs: " + layEggs+ "\n";
    }
}

