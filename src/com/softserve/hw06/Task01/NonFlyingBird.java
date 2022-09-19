package com.softserve.hw06.Task01;

public abstract class NonFlyingBird extends Bird {

    public NonFlyingBird(String feathers, int layEggs) {
        super(feathers, layEggs);
    }

    public void cantFly() {
      System.out.print("I can't fly");
  }
}
