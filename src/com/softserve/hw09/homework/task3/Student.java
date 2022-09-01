package com.softserve.hw09.homework.task3;

import java.util.*;

public class Student  {
private String name;
private Integer course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public Integer getCourse() {
        return course;
    }

    public static List<Student> printStudents (List <Student> students, Integer course) {
    List <Student> specificCourse = new ArrayList<>();

        for (Student current : students){
            if ((current.getCourse()).equals(course)) {
                specificCourse.add(current);
            }
        }
        return specificCourse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public static class ByName extends Student implements Comparator<Student> {
        public int compare(Student first, Student second){
            return first.getName().compareTo(second.getName());
        }
    }
    public static class ByCourse extends Student implements Comparator<Student> {
        public int compare(Student first, Student second){
            return first.getCourse().compareTo(second.getCourse());
        }
    }
  }
