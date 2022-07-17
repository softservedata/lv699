package com.softserve.hw06.bird;

public class Chicken extends NonFlyingBirds{
    private String feathers;
    private boolean layEggs;

    @Override
    public String getFeathers() {
        return feathers;
    }

    @Override
    public void setFeathers(String feathers) {
        this.feathers = feathers;
    }

    @Override
    public boolean isLayEggs() {
        return layEggs;
    }

    @Override
    public void setLayEggs(boolean layEggs) {
        this.layEggs = layEggs;
    }

    public Chicken() {
        feathers = "Yellow";
        layEggs = true;
    }

    @Override
    public String toString() {
        return "Chicken " +
                "feathers = " + feathers +
                ", layEggs = " + layEggs;
    }
}
