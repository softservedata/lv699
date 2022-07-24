package com.softserve.homework.task6.bird;

public  class FlyingBird extends Bird {


    @Override
    public String toString() {
        return "\nFlyingBird{" +
                "feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
    @Override
    public  boolean fly(){
       return true;
    }


}
