package com.softserve.hw09.homework.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AppStudent {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Liuba", 3));
        students.add(new Student("Andrii", 2));
        students.add(new Student("Artur", 3));
        students.add(new Student("Ira", 1));
        students.add(new Student("Adam", 2));
        Scanner scan = new Scanner(System.in);

    Integer course = 0;
    System.out.println("Please input the course number");
    course = scan.nextInt();

        System.out.println("The following students participate in the course " + course + ": "+ Student.printStudents(students,course));

        Collections.sort(students, new Student.ByName());
        System.out.println("Sorted by name: " + students);

        students.sort(new Student.ByCourse());
        System.out.println("Sorted by course: " + students);

    }
   }
