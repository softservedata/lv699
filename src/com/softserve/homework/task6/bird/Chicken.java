package com.softserve.homework.task6.bird;

public class Chicken extends NonFlyingBird{
    protected String name;
    protected boolean feathersEagle=true;



    public Chicken(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "\nChicken{" +
                "name='" + name + '\'' +
                ", feathersEagle=" + feathersEagle +
                ", layEggs=" + layEggs +
                '}';
    }
}
