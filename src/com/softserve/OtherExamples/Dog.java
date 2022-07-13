package com.softserve.OtherExamples;

import java.util.Objects;

public class Dog {
    private String name;
    private String breed;
    private int age;
    private static int temp=0;
    private static String nameoftheoldest;

    public Dog() {
        name = "";
        breed = "";
        age = 0;
        nameoftheoldest="";
    }
    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String getnameoftheoldest() {
        return nameoftheoldest;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }
    public String oldest(){
        if (getAge() > temp) {
            temp=getAge();
            nameoftheoldest = name;
        }

        return nameoftheoldest;
    }
}

