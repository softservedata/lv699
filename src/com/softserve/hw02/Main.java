package com.softserve.hw02;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Anna","Maria");
        person1.setBirthYear(1994);
        Person person2 = new Person("Bob" , "Marley");
        person2.setBirthYear(1988);
        Person person3 = new Person("Andrew", "Garfield");
        person3.setBirthYear(1999);
        Person person4 = new Person();
        person4.input("Tobey" , " Maguire", 1988);
        person4.output();
        Person person5 = new Person();
        person5.setFirstName("Jim");
        person5.setLastName("Carson");
        person5.setBirthYear(1969);
        person5.output();

    }
}
