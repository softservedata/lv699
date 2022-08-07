package com.softserve.HomeWork.hw06.task1;

public class Penguin extends NonFlyingBird{
    @Override
    public String toString() {
        return "Penguin has feathers "+feathers+" colors  and Penguin"+((layEggs)? "" : " laying eggs");
    }

    public Penguin(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }
}
