package com.softserve.hw06.first_task;

public abstract class Bird {
    protected boolean feathers;
    protected boolean layEggs;

    public abstract boolean fly();

    public boolean isFeathers() {
        return feathers;
    }

    public boolean isLayEggs() {
        return layEggs;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}
