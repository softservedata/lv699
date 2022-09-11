package com.softserve.HomeWork.hw08.task1;

import java.util.ArrayList;
import java.util.List;

public class AppPerson {
    public static void main(String[] args) {
        Student st1 = new Student("Bob", "Arum", 22, 3);
        Student st2 = new Student("Iren", "Adler", 21, 1);
        System.out.println(st1.activity());
        st1.info();
        System.out.println(st2.activity());
        st2.info();

//        List<Student> students = new ArrayList<Student>();
//        students.add(st1);
//        students.add(st2);
//
//        for (Student stud: students) {
//            stud.info();
//            stud.activity();
//        }
    }
}
