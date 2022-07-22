package com.softserve.hw06.first_task;

public class Eagle extends FlyingBird {
    private String name;

    public Eagle(String name) {
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
        return true;
    }

    @Override
    public boolean isLayEggs() {
        return true;
    }
    @Override
    public String toString() {
        return "Eagle{" +
                "name='" + name + '\'' +
                "name='" + name + '\'' +
                ", feathers=" + isLayEggs() +
                ", layEggs=" + isFeathers() +
                '}';
    }
}
