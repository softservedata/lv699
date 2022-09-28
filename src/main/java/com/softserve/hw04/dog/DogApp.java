package com.softserve.hw04.dog;

public class DogApp {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Ellie", 2, Breed.BULLDOG);
        Dog dog2 = new Dog("Betty", 4, Breed.CORGI);
        Dog dog3 = new Dog("Polly", 10, Breed.MALTIPU);

    // check for the same names
        if(dog1.equals(dog2)){
            System.out.println("Dog1 and Dog2 have the same names");
        } else if(dog2.equals(dog3)){
            System.out.println("Dog2 and Dog3 have the same names");
        } else if(dog1.equals(dog3)){
            System.out.println("Dog1 and Dog3 have the same names");
        } else {
            System.out.println("No dogs have the same names");
        }
    //Check the age of the dogs
        if (dog1.getAge() > dog2.getAge() && dog1.getAge() > dog3.getAge()) {
            System.out.println("The oldest dog name is " + dog1.getName() + ". Its breed - " + dog1.getBreed().getBreedName());
        } else if (dog2.getAge() > dog1.getAge() && dog2.getAge() > dog3.getAge()) {
            System.out.println("The oldest dog name is " + dog2.getName() + ". Its breed - " + dog2.getBreed().getBreedName());
        } else {
            System.out.println("The oldest dog name is " + dog3.getName() + ". Its breed - " + dog3.getBreed().getBreedName());
        }
    }
}
