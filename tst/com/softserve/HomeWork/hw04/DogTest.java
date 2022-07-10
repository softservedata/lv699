package com.softserve.HomeWork.hw04;

import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {


    @Test
    public void SameNameTrue() {
        Dog dog1 = new Dog("Barni", Breed.YORK, 2);
        Dog dog2 = new Dog("Molly", Breed.BEAGLE, 5);
        Dog dog3 = new Dog("Barni", Breed.BOXER, 7);
        //assertEquals("Barni",Dog.getName();
    }

    @Test
    public void getNameOldest() {
    }

    @Test
    public void testEquals() {
    }
}