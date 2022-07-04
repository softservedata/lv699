package com.softserve.hw03;

public class Student {
    private String name;
    private double rating;

    public Student() {
        this.name = "";
        this.rating = 0;
    }
    public Student(String name, double rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
