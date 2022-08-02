package com.softserve.HomeWork.hw6.task1;

public class Eagle extends FlyingBird{
    public Eagle(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "Eagle has feathers "+feathers+" colors  and Eagle"+((layEggs)? "" : " laying eggs");
    }
}
