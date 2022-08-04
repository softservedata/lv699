package com.softserve.homework.task8.exersize1;

public class FullName {
    private String firstName;
    private String lasName;

    public FullName(String firstName, String lasName) {
        this.firstName = firstName;
        this.lasName = lasName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLasName() {
        return lasName;
    }

    public void setLasName(String lasName) {
        this.lasName = lasName;
    }

    @Override
    public String toString() {
        return "FullName :" +
                "firstName='" + firstName + '\'' +
                ", lasName='" + lasName + '\'' ;
    }
}
