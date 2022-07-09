package com.softserve.hw04.HomeWork;

public enum Breed {
    // Declare enum for field breed.

    MASTIFF ("Mastiff"),
    ROTTWEILER ("Rottweiler"),
    BOXER ("Boxer"),
    POODLE ("Poodle"),
    BULLDOG ("Bulldog"),
    CHIHUAHUA ("Chihuahua"),
    YORKSHIRE_TERRIER ("Yorkshire terrier"),
    COCER_SPANIEL ("Cocer spaniel"),
    CHOW_CHOW ("Chow chow");
private String name;

    @Override
    public String toString() {
        return "Breed: " + name + ". ";
    }

    public String getName() {
        return name;
    }

    Breed(String name) {
        this.name=name;




    }

}
