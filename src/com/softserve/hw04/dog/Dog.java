package com.softserve.hw04.dog;

import java.util.Objects;

public class Dog {
    private String name;
    private int age;
    public enum Breed{
        CORGI ("Corgi"),
        BULLDOG ("Bulldog"),
        MALTIPU ("Maltipu");

        private final String breedName;

        Breed(String breedName){
            this.breedName = breedName;
        }
        public String getBreedName() {
            return breedName;
        }
    }
    private Breed breed;

    public Dog(String name, int age, Breed breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
    //--------------------------------------------------------

}
