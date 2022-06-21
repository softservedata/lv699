package com.softserve.homework.task1.nameAndAddress;

import java.util.Scanner;

public class NameAndAddress {
    public static void main(String[] args) {
        String name;
        String address;
        System.out.println("What is your name?");
        Scanner scanner=new Scanner(System.in);
        name= scanner.nextLine();
        System.out.println("Where are you live,"+name+"?");
        address=scanner.nextLine();
        System.out.println("Your name is :"+name+","+"\n"+"and you live at the:"+address+".");
    }
}
