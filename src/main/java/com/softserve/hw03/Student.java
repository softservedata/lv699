package com.softserve.hw03;

//Example from the presentation

public class Student {

    private String name;
    private double rating;
    private static double avgRating;
    private static double totalRating;
    private static int studentCount = 0;

    public String getName(){
        return this.name;
    }

    public double getRating(){
        return this.rating;
    }

    public Student(String name, double rating){
        this.name = name;
        this.rating = rating;
        totalRating = totalRating + rating;
        studentCount++;
        avgRating = totalRating / studentCount;
    }

    public Student(){
        name = "";
        rating = 0d;
    }

    public boolean betterStudent(double rating1, double rating2){
        return rating1 > rating2;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }

    public static void main(String[] args) {
        // Student 1
        Student st0 = new Student("Petro", 4.5);
        System.out.println(st0.toString());
        //Student 2
        Student st1 = new Student("Andriy", 4.0);
        System.out.println(st1.toString());
        //Student 3
        Student st2 = new Student("Alisa", 3.1);
        System.out.println(st2.toString());

        System.out.println("The average rating of all students is: " + avgRating);
        System.out.println("The total rating of all students is: " + totalRating);
    }
}
