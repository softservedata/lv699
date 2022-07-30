package com.softserve.hw07.practicalTASKS.PersonTask;

public class Student extends Person {
    String TYPE_PERSON;
    public String print() {
        return "I am Student person";
    }

    public Student(String st1) {
        super();
        TYPE_PERSON = "Student";
    }

    public double salary() {
        return 1000;
    }

}
