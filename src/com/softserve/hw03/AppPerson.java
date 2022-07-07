package com.softserve.hw03;

public class AppPerson {
    public static void main(String[] args){
        Person pr1 = new Person("Volodymyr","Shashkov",1984);
        System.out.println("The Person pr1: "+pr1.getFirstName()+" "+pr1.getLastName()+" Have "+pr1.getAge()+" years");
        Person pr2 = new Person("Alexandr","Petrov",1980);
        System.out.println("The Person pr2: "+pr2.getFirstName()+" "+pr2.getLastName()+" Have "+pr2.getAge()+" years");
        Person pr3 = new Person("Roman","Nikiforov",1990);
        System.out.println("The Person pr3: "+pr3.getFirstName()+" "+pr3.getLastName()+" Have "+pr3.getAge()+" years");
        Person pr4 = new Person("Valeriy","Larionov",2000);
        System.out.println("The Person pr4: "+pr4.getFirstName()+" "+pr4.getLastName()+" Have "+pr4.getAge()+" years");
        Person pr5 = new Person("Alexandr","Osipov",2001);
        System.out.println("The Person pr5: "+pr5.getFirstName()+" "+pr5.getLastName()+" Have "+pr5.getAge()+" years");
       //
        System.out.println("");
        pr2.setFirstName("Igor");
        pr2.setLastName("Gavrilov");
        System.out.println("Change Person pr1 : "+pr2.getFirstName()+" "+pr2.getLastName()+" Have "+pr2.getAge()+" years");
    }
}
