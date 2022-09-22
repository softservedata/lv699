package com.softserve.hw09.Task03;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student  {
    private String name;
    private Integer course;


    public Student(String name, Integer course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

   public static void printStudents (List <Student> students, Integer course) {
       Iterator<Student> studentIterator = students.iterator();
       while (studentIterator.hasNext()){
               Student student = studentIterator.next() ;
           if (student.getCourse() == course.intValue()){
               System.out.println("The student with the name is " + student.getName() +
                       " studying in the course " + course);
           }
       }
   }
   public static class SudentName implements Comparator<Student> {

       @Override
       public int compare(Student o1, Student o2) {
           return o1.name.compareTo(o2.name);
       }
   }
   public static class SudentCourse implements Comparator<Student> {

       @Override
       public int compare(Student o1, Student o2) {
           return o1.course.compareTo(o2.course);
       }
   }
}
