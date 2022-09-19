package com.softserve.hw06.first_task;

public class Penguin extends NonFlyingBird {
    private String name;

    public Penguin(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean isFeathers() {
        return false;
    }

    @Override
    public boolean isLayEggs() {
        return true;
    }
    @Override
    public String toString() {
        return "Penguin{" +
                "name='" + name + '\'' +
                "name='" + name + '\'' +
                ", feathers=" + isLayEggs() +
                ", layEggs=" + isFeathers() +
                '}';
    }
}
