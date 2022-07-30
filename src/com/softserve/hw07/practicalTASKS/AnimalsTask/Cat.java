package com.softserve.hw07.practicalTASKS.AnimalsTask;

public class Cat implements Animal {
private String name = "";

    @Override
    public String voice() {
        return "Miau";
    }

    public String getName() {
        return name;
    }

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public String feed() {
        return "Mouses";
    }
}
