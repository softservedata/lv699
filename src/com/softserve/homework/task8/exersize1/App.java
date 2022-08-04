package com.softserve.homework.task8.exersize1;

public class App {
    public static void main(String[] args) {
        Student student1=new Student("Pavlo","Zibrov",22,4);
        Person student2=new Student("Mihailo","Poplavski",23,5);
        System.out.println(student1.info());
        System.out.println(student1.activity());
        System.out.println(student2.info());
        System.out.println(student2.activity());
        }
    }

