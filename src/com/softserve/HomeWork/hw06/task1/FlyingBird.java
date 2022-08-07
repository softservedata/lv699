package com.softserve.HomeWork.hw06.task1;

public class FlyingBird extends Bird {

    public FlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String fly() {
        return ": this byrd Flying";
    }
    @Override
    public String info() {
        return " this is a very important skill";
    }

}
