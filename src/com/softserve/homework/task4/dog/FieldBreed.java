package com.softserve.homework.task4.dog;

public enum FieldBreed {
    FIELD_BREED1("dog1","breed1",5),
    FIELD_BREED2("dog1","breed2",7),
    FIELD_BREED3("dog3","breed3",1);

    private String name;
    private String breed;
    private int age;


    public String print() {
        return "FieldBreed{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }

    FieldBreed(String name, String breed, int age) {
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
}
