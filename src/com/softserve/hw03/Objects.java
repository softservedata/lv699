package com.softserve.hw03;

import java.util.Scanner;

public class Objects {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        Person p4 = new Person();
        Person p5 = new Person();
        System.out.println("Enter information about Person 1");
        p1.input();
        System.out.println("Enter information about Person 2");
        p2.input();
        System.out.println("Enter information about Person 3");
        p3.input();
        System.out.println("Enter information about Person 4");
        p4.input();
        System.out.println("Enter information about Person 5");
        p5.input();
        System.out.println(p1.output());
        System.out.println("p1.getAge() = " + p1.getAge());
        System.out.println(p2.output());
        System.out.println("p2.getAge() = " + p2.getAge());
        System.out.println(p3.output());
        System.out.println("p3.getAge() = " + p3.getAge());
        System.out.println(p4.output());
        System.out.println("p4.getAge() = " + p4.getAge());
        System.out.println(p5.output());
        System.out.println("p5.getAge() = " + p5.getAge());
        System.out.println("Do you want to change something? yes or no: ");
        String yes = scan.nextLine();
        if(yes.equals("yes")) {
            p3.changeName();
            System.out.println("p3.changeName() = " + p3.output());
        }
        else{

        }
    }
}
