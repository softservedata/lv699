package com.softserve.HomeWork.hw04;

public class AppDog {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Barni", Breed.YORK, 2);
        Dog dog2 = new Dog("Molly", Breed.BEAGLE, 5);
        Dog dog3 = new Dog("Halk", Breed.BOXER, 7);
        System.out.println("We have 3 dogs");
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        if (dog1.equals(dog2)) {
            System.out.println("name dog1 and name dog2 are the same:" + dog1.getName());
        } else if (dog1.equals(dog3)) {
            System.out.println("name dog1 and name dog3 are the same:" + dog3.getName());
        } else if (dog2.equals(dog3)) {
            System.out.println("name dog2 and name dog3 are the same:" + dog2.getName());
        } else
            System.out.println("All nicknames are different");

       dog1.oldest();
       dog2.oldest();
       dog3.oldest();
       System.out.println("The oldest dog is "+Dog.getNameOldest());
}

}