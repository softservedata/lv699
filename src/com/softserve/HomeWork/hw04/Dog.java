package com.softserve.HomeWork.hw04;

import java.util.Objects;

public class Dog {
    private String name;
    private Breed breed;
    private int age;
    private static int count = 0;
    private static String nameoldest;

    public Dog() {
        this.name = "";
        this.breed = null;
        this.age = 0;
        nameoldest = "";
    }
    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public Breed getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public static String getNameOldest() {
        return nameoldest;
    }

    @Override
    public String toString() {
        return "Dog:" +
                "name - " + name +
                " breed -" + breed +
                "age=" + age +
                "years;";
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
        return Objects.hash(name);
    }

    public String oldest(){
        if (getAge() > count) {
            count  = getAge();
            nameoldest = name;
        }

        return nameoldest;
    }



}
