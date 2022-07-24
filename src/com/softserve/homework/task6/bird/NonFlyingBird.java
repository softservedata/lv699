package com.softserve.homework.task6.bird;

public class NonFlyingBird extends Bird {

    @Override
    public boolean fly(){
        return false;
    }

    @Override
    public String toString() {
        return "\nNonFlyingBird{" +
                "feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}
