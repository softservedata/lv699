package com.softserve.hw04.home_work;

public class Dogs {
    public static void main(String[] args) {
        Dog dog1= new Dog("Sally", Breed.DOB, 3);
        Dog dog2= new Dog("Mike", Breed.DVOR, 8);
        Dog dog3= new Dog("Jack", Breed.BULDOG, 1);
        System.out.println("First dog:"+"\n"+dog1.toString());
        System.out.println("Second dog:"+"\n"+dog2.toString());
        System.out.println("Third dog:"+"\n"+dog3.toString());
        System.out.println("Two dogs with the same name"+"\n First dog vs Second dog: "+dog1.equals(dog2)
                +"\n Second dog vs Third dog: "+dog2.equals(dog3)+"\n Third dog vs First dog: "+dog3.equals(dog1));
        dog1.oldest();
        dog2.oldest();
        dog3.oldest();
        System.out.println("The name of the oldest dog is "+ Dog.getnameoftheoldest());


    }
}
