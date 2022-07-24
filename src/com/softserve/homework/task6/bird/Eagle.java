package com.softserve.homework.task6.bird;

public class Eagle extends FlyingBird{

    protected String name;
    protected boolean feathersEagle=true;

    public  Eagle(String name){
        this.name=name;
}

    @Override
    public String toString() {
        return "\nEagle{" +
                "name='" + name + '\'' +
                ", feathersEagle=" + feathersEagle +
                ", layEggs=" + layEggs +
                '}';
    }
}
