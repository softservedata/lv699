package com.softserve.hw09.Task03;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Student {
    private String name;
    private int course;

    public Student() {

    }

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public static class ByName implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.name.compareTo(o2.name);
        }
    }
    public static class ByCourse implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.course - o2.course;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        if (course != student.course) return false;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + course;
        return result;
    }

    @Override
    public String toString() {
        return "Student {" +
                "name = " + name +
                ", course = " + course +
                "}";
    }

    public static void printStudents(List<Student> students, int course){
        System.out.println("\nStudents studying at course " + course + ": ");
        Iterator iterator = students.iterator();
        while(iterator.hasNext()){
            Student st1 = (Student) iterator.next();
            if(course == st1.getCourse()) {
                System.out.println(st1.getName());
            }
        }
    }
}
