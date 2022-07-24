package com.softserve.homework.task6.bird;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        Bird[] birds=new Bird[4];
        birds[0]=new Eagle("Eagle");
        birds[1]= new Swallow("Swallow");
        birds[2]=new Chicken("Chicken");
        birds[3] =new Penguin("Penguin");


        System.out.println(birds[0].toString()+" .It is can fly:"+birds[0].fly());
        System.out.println(birds[1].toString()+" .It is can fly:"+birds[1].fly());
        System.out.println(birds[2].toString()+" .It is can fly:"+birds[2].fly());
        System.out.println(birds[3].toString()+" .It is can fly:"+birds[3].fly());

    }
}
