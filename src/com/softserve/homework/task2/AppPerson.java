package com.softserve.homework.task2;

import java.util.Scanner;

public class AppPerson extends Person{
    public static void main(String [] args){
        int age1;
        int birth;
String firstName1;
String lastName1;


    Person [] array=new Person[5];
    Person person1= new Person();
    array[0]=person1;
        person1.getInputs();
    firstName1=person1.getFirstName();
   lastName1= person1.getLastName();
    birth=person1.getBirthYear();
   age1 = person1.getAge();
   person1.output();
        System.out.println("you"+firstName1);




    }
}
