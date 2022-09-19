package com.softserve.hw06.Task01;

public abstract class Bird  {
    private String feathers;
    private int layEggs;

    public Bird(String feathers, int layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public String getFeathers() {
        return feathers;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "feathers='" + feathers + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }

    public int getLayEggs() {
        return layEggs;
    }

    public abstract void fly();

    public static void info(Bird [] birds){
        for (Bird bird:birds) {
            bird.fly();
            System.out.println(bird.toString());
        }
    }

}
