package com.softserve.hw06.first_task;

public class Chicken extends NonFlyingBird {
    private String name;

    public Chicken(String name) {
        this.name = name;
    }
    @Override
    public boolean isFeathers() {
        return true;
    }

    @Override
    public boolean isLayEggs() {
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Chicken{" +
                "name='" + name + '\'' +
                ", feathers=" + isLayEggs() +
                ", layEggs=" + isFeathers() +
                '}';
    }
}
