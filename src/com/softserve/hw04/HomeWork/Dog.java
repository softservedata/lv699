package com.softserve.hw04.HomeWork;

import java.util.Objects;

public class Dog {
    private String name;
    private Breed breed;
    private int age;


    public static void main(String[] args) {
        //  Create 3 instances of type Dog.
        Dog dog1 = new Dog("Cezar", Breed.BOXER, 7);
        Dog dog2 = new Dog("Molly", Breed.CHIHUAHUA, 12);
        Dog dog3 = new Dog("Alph", Breed.ROTTWEILER, 5);

        Dog checktask = new Dog();

       String sameName1 = checktask.sameName(dog1, dog2, dog3);
       System.out.println(checktask.oldestDog(dog1, dog2, dog3));


    }

    //  Check if there is no two dogs with the same name.

                           public String sameName(Dog dog1, Dog dog2, Dog dog3) {
                             String  sameName = "";
                               if (dog1.getName().equals(dog2.getName())) {
                                sameName = dog1.getName();
                                System.out.println("Dog 1 and Dog 2 have the same Name: " + sameName);

                            } else
                            if (dog2.getName().equals(dog3.getName())) {
                                sameName = dog2.getName();
                                System.out.println("Dog 2 and Dog 3 have the same Name: " + sameName);
                            } else
                            if (dog1.getName().equals(dog3.getName())) {
                                sameName = dog1.getName();
                                System.out.println("Dog 1 and Dog 3 have the same Name: " + sameName);
                            } else
                            System.out.println("Nobody have the same name");
                            return sameName;
                            }

    public Breed getBreed() {
        return breed;
    }

    //  Display the name and the kind of the oldest dog.
        String result = "";
    public String oldestDog(Dog dog1, Dog dog2, Dog dog3) {
          String  oldestDogName = "";
          Breed  oldestDogBreed = null;
          int a = 0;
        if (dog1.getAge() >= a) {
            oldestDogName = dog1.getName();
            oldestDogBreed = dog1.getBreed();
            a=dog1.getAge();

        } if (dog2.getAge() >= a) {
            oldestDogName = dog2.getName();
            oldestDogBreed = dog2.getBreed();
            a=dog2.getAge();

            } if (dog3.getAge() >= a) {
            oldestDogName = dog3.getName();
            oldestDogBreed = dog3.getBreed();
            a = dog3.getAge();

            }
            return result = ("The Oldest Dog is: " + oldestDogName + ". " + oldestDogBreed);

        }

    public Dog(String name, Breed breed, int age){
            this.name = name;
            this.breed = breed;
            this.age = age;
        }

    public Dog() {
        name = "";
        breed = null;
        age = 0;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString () {
            return "Dog: " + name +
                    ", breed:" + breed +
                    ", age:" + age;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age && Objects.equals(name, dog.name) && breed == dog.breed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, breed, age);
    }
}








