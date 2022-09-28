package com.softserve.hw09.Task03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student st1 = new Student();
        students.add(new Student("Ivan Bokalo", 1));
        students.add(new Student("Iryna Kosminska", 2));
        students.add(new Student("Petro Vorona", 3));
        students.add(new Student("Svitlana Horyn", 3));
        students.add(new Student("Roman Lytvyn", 2));
        students.add(new Student("Ruslana Paslo", 4));
        students.add(new Student("Stefan Vasylkiv", 3));
        students.add(new Student("Julia Chorniy", 5));
        students.add(new Student("Kvitka Rymar", 1));
        students.add(new Student("Dmytro Korol", 3));

        System.out.println("Students list, unsorted: ");
        students.forEach(System.out::println);

        System.out.println("\n\tStudents list, sorted by name: ");
        Collections.sort(students, new Student.ByName());
        students.forEach(System.out::println);

        System.out.println("\n\tStudents list, sorted by course: ");
        Collections.sort(students, new Student.ByCourse());
        students.forEach(System.out::println);

        Student.printStudents(students, 3);


    }
}
