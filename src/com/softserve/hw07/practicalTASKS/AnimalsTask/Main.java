package com.softserve.hw07.practicalTASKS.AnimalsTask;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal [] animals = new Animal [6];
        animals[0] = new Cat("FirstCat");
        animals[1] = new Dog("FirstDog");
        animals[2] = new Cat("SecondCat");
        animals[3] = new Dog("SecondDog");
        animals[4] = new Cat("ThirdCat");
        animals[5] = new Dog("ThirdDog");
        
        for (int i=0; i < animals.length; i++ ) {
            animals[i].voice();
            animals[i].feed();
            System.out.println(animals[i].getName() + " makes " + animals[i].voice() + ",he eats " + animals[i].feed());
                }
        System.out.println(Arrays.toString(animals));
        
        
        
        
    }
}
