package com.softserve.homework.task6.bird;

public class Penguin extends NonFlyingBird{
    protected String name;
    protected boolean feathersEagle=false;


        public Penguin(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "\nPenguin{" +
                "name='" + name + '\'' +
                ", feathersEagle=" + feathersEagle +
                ", layEggs=" + layEggs +
                '}';
    }
}
