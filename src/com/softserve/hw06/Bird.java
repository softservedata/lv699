package com.softserve.hw06;

public abstract class Bird {

    protected boolean feathers;
   protected boolean layEggs = true;

    public abstract boolean fly();

    public boolean isFeathers() {
        return feathers;
    }

    public boolean isLayEggs() {
        return layEggs;
    }

    @Override
    public String toString() {
        return "feathers: " + feathers +
                ", layEggs: " + layEggs;
    }
}
