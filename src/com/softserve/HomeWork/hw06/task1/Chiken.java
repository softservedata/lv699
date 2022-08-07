package com.softserve.HomeWork.hw06.task1;

public class Chiken extends NonFlyingBird{
    public Chiken(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "Chiken has feathers "+feathers+" colors  and Chiken"+((layEggs)? "" : " laying eggs");
    }
}
