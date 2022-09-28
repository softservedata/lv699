package com.softserve.hw08;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", "Petrov", 25, 3);
        Student st2 = new Student("Maria", "Kiseliova", 18, 1);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);

        for(Student stud : students){
            System.out.println(stud.info());
            System.out.println(stud.activity());
        }
    }
}
