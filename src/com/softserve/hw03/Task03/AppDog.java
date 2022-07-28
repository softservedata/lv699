package com.softserve.hw03.Task03;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;

import static java.lang.System.out;

public class AppDog {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Rex", 5, Breed.Beagle);
        Dog dog2 = new Dog("Cezar", 1, Breed.Jack_Russell_Terrier);
        Dog dog3 = new Dog("Rex",7, Breed.German_Shepherd_Dog);

        if (dog1.getName().equals(dog2.getName())) {
            System.out.println("Thees dogs have the same name " + dog1 + " " + dog2);
        } else if (dog1.getName().equals(dog3.getName())) {
            System.out.println("Thees dogs have the same name " + dog1 + " " + dog3);
        } else if (dog2.getName().equals(dog3.getName())) {
            System.out.println("Thees dogs have the same name " + dog3 + " " + dog3);
        } else {
            System.out.println("None of these dogs have the same name");
        }

       Dog[]dogs = {dog1,dog2,dog3};
        Arrays.sort(dogs);
        System.out.println("The oldest dog is - " + dogs[0]);



    }
}
