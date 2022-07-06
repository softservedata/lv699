package com.softserve.homework.task3;

public class AppPerson {
    public static void main(String[] args) {
        Person person1=new Person();
        Inp input=new Inp();
        GetAge getAge=new GetAge();
        Output output=new Output();
Change change=new Change();
       String fistName=input.inputFirstName();
       String lastName=input.inputLastName();
        int birthDay=input.inputBirthYear();
       int age= getAge.getAge(birthDay);
        output.output(fistName,lastName,birthDay,age );
change.changeName(fistName,lastName);
               }
    }


