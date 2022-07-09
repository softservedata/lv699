package com.softserve.hw04.HomeWork;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {

    Dog checktask = new Dog();

    @Test
    public void sameNameTrue() {
        Dog dog1 = new Dog("Cezar", Breed.BOXER, 2);
        Dog dog2 = new Dog("Molly", Breed.CHIHUAHUA, 2);
        Dog dog3 = new Dog("Cezar", Breed.ROTTWEILER, 5);
        assertEquals("Cezar", checktask.sameName(dog1, dog2, dog3));
    }
    @Test
    public void sameNameFalse() {
        Dog dog1 = new Dog("Cezar", Breed.BOXER, 2);
        Dog dog2 = new Dog("Molly", Breed.CHIHUAHUA, 2);
        Dog dog3 = new Dog("Alph", Breed.ROTTWEILER, 5);
        assertEquals("", checktask.sameName(dog1, dog2, dog3));
    }

    @Test
    public void oldestDogTrue() {

        Dog dog1 = new Dog("Cezar", Breed.BOXER, 2);
        Dog dog2 = new Dog("Molly", Breed.CHIHUAHUA, 15);
        Dog dog3 = new Dog("Alph", Breed.ROTTWEILER, 5);
        assertEquals("The Oldest Dog is: Molly. Breed: Chihuahua.", checktask.oldestDog(dog1, dog2, dog3));
    }
}