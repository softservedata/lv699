package com.softserve.hw06.Task01;

public class Eagle extends FlyingBird{

    public Eagle(String feathers, int layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly(){
          System.out.println("I am Eagle and i can fly");
      }

    @Override
    public String toString() {
        return "Eagle{" +
                "feathers='" + getFeathers() + '\'' +
                ", layEggs=" + getLayEggs() +
                '}';
    }
}
