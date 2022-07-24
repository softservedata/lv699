package com.softserve.homework.task6.bird;

public class Swallow extends FlyingBird{
    protected String name;
    protected boolean feathersEagle=true;


    public  Swallow(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "\nSwallow{" +
                "name='" + name + '\'' +
                ", feathersEagle=" + feathersEagle +
                ", layEggs=" + layEggs +
                '}';
    }
}
