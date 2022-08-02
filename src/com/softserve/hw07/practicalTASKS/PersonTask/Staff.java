package com.softserve.hw07.practicalTASKS.PersonTask;

public abstract class Staff extends Person {
    final String TYPE_PERSON;
   @Override
    public String print() {
       return "I am Staff person";
   }

    public Staff(String name) {
       this.name = name;
        TYPE_PERSON = "Staff";
    }

    public abstract double salary();
    }


