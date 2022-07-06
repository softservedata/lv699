package com.softserve.homework.task3;

public class Change {

    String firsName;
    String lastName;

    void changeName(String fn, String ln) {
        firsName = fn;
        lastName = ln;
        System.out.println("You change name is : "+fn+" "+ln);
    }
}