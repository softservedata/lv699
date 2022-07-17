package com.softserve.hw06;

public class Eagle extends FlyingBird {

    String name;
    protected boolean feathers = true;

    public Eagle (String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Bird's name: " + name + ", feathers: " + feathers +
                ", layEggs: " + layEggs + "\n";
    }

}
