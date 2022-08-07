package com.softserve.HomeWork.hw06.task1;

public class Swallow extends FlyingBird{
    public Swallow(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "Swallow has feathers "+feathers+" colors  and Swallow"+((layEggs)? "" : " laying eggs");
    }
}
