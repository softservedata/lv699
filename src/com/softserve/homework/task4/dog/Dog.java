package com.softserve.homework.task4.dog;


public class Dog {


    public static void main(String[] args) {
        String name1;
        String name2;
        String name3;
        int age1;
        int age2;
        int age3;

        FieldBreed dog1;
        dog1 = FieldBreed.FIELD_BREED1;
        FieldBreed dog2;
        dog2 = FieldBreed.FIELD_BREED2;
        FieldBreed dog3;
        dog3 = FieldBreed.FIELD_BREED3;

        name1= dog1.getName();
        name2= dog2.getName();
        name3= dog3.getName();

        if(name1==name2||name2==name3||name3==name1||name1==name3||name2 ==name1||name3==name2) {
            System.out.println("1.1 dog names are not different, first try:"+" "+name1+" , "+name2+" , "+name3);
        }else
        System.out.println("all dog names are different, first try");


        if (name1.equals(name2)){
            System.out.println("1.2 "+name1+" , name1=name2,  second try");
        if (name2.equals(name3)){
            System.out.println("1.2 "+name2+" , name2=name3, second try");
        if(name3.equals(name1)){
            System.out.println("1.2 "+name3+" , name3=name1, second try");
        }}}else
            System.out.println("all dog names are different");







        age1= dog1.getAge();
        age2= dog2.getAge();
        age3= dog3.getAge();

            int ageMax=0;
        if (age1 >= ageMax) {
            ageMax = age1;}
            if (age2 >= ageMax) {
                ageMax = age2;}
                if (age3 >= ageMax) {
                    ageMax = age3;}
                    System.out.println("2. oldest dog is:" + ageMax);
                }
            }



