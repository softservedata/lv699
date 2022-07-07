package hw04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {
    Dog dog = new Dog();
    Dog dog01 = new Dog("Jerry", Dog.Breed.DALMATIAN, 15);
    Dog dog02 = new Dog("Tom", Dog.Breed.PUG, 10);
    Dog dog03 = new Dog("Tom", Dog.Breed.BEAGLE, 15);
    Dog dog04 = new Dog("Tom2", Dog.Breed.PUG, 13);
    @Test
    void isSameName() {
        assertEquals("Tom", dog.isSameName(dog01, dog02, dog03));
    }@Test
    void isNotSameName() {
        assertEquals(null, dog.isSameName(dog01, dog02, dog04));
    }

}