package com.softserve.hw06.bird;

public class Penguin extends NonFlyingBirds{
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

    public Penguin() {
        feathers = "Black and White";
        layEggs = true;
    }

    @Override
    public String toString() {
        return "Penguin " +
                "feathers = " + feathers +
                ", layEggs = " + layEggs;
    }
}
