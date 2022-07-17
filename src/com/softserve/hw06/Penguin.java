package com.softserve.hw06;

public class Penguin extends  NotFlyingBird {

    String name;
    protected boolean feathers = false;

    public Penguin (String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Bird's name: " + name + ", feathers: " + feathers +
                ", layEggs: " + layEggs+  "\n";
    }
}
