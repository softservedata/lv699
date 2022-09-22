package com.softserve.hw08.Task01;

public class App {
    public static void main(String[] args) {
        Person student1 = new Student(new FullName("Stepan", "Mukycey"), 22, 5);
        Student student2 = new Student(new FullName("Andriy", "Yakovenchuk"), 20, 3);
        System.out.println(student1.activity());
        System.out.println(student1.info());
        System.out.println(student2.activity());
        System.out.println(student2.info());
    }
}
