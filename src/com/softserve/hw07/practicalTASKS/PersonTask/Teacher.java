package com.softserve.hw07.practicalTASKS.PersonTask;

public class Teacher extends Staff {
    @Override
    public double salary() {
        return 2000;
    }

    public Teacher(String name) {
        super(name);
    }
}
