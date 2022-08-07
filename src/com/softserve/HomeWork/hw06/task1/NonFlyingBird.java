package com.softserve.HomeWork.hw06.task1;

public class NonFlyingBird extends Bird{
    public NonFlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String fly() {
        return ": This bird not Flying";
    }

    @Override
    public String info() {
        return null;
    }
}
