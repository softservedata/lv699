package com.softserve.HomeWork.hw04;

public enum Breed {

    BEAGLE("Beagle"), BOXER("Boxer"), YORK("York");

    private String breed;

    Breed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return breed +
                ';';
    }
}