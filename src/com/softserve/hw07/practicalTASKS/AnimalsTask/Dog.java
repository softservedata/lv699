package com.softserve.hw07.practicalTASKS.AnimalsTask;

public class Dog implements Animal{
    private String name = "";
    @Override
    public String voice() {
        return "Gav";
    }

    public String getName() {
        return name;
    }

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public String feed() {
        return "Cats";
    }
}
