package com.softserve.hw06.bird;

public class Main {
    public static void main(String[] args) {
        Bird[] birds = {new Eagle(), new Swallow(), new Penguin(), new Chicken()};
        for (Bird bird : birds) {
            System.out.println(bird);
            bird.fly();
        }
    }
}
