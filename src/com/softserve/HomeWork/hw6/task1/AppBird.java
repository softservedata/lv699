package com.softserve.HomeWork.hw6.task1;

public class AppBird {
    public static void main(String[] args) {
        Bird[] birdArrey = {
                new Eagle("black with white", true),
                new Swallow("gray", true),
                new Chiken("grey with wite", true),
                new Penguin("black with white", true)
        };

        // System.out.println(birdArrey[0].toString()+birdArrey[0].fly());
        //  System.out.println(birdArrey[1].toString()+birdArrey[1].fly());
        //  System.out.println(birdArrey[2].toString()+birdArrey[2].fly());
        //  System.out.println(birdArrey[3].toString()+birdArrey[3].fly());
        for (int i = 0; i < birdArrey.length; i++) {
            System.out.println(birdArrey[i].toString() + birdArrey[i].fly());
            System.out.println(birdArrey[i].info());
        }
    }
}
