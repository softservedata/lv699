package com.softserve.hw09.Task03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task03 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ivan", 2));
        students.add(new Student("Andriy", 3));
        students.add(new Student("Yura",5));
        students.add(new Student("Valeriy",2));
        students.add(new Student("Bohadan",3));

        Student.printStudents(students,2);

        students.sort(new Student.SudentName());
        System.out.println(students);

        students.sort(new Student.SudentCourse());
        System.out.println(students);



    }
}
