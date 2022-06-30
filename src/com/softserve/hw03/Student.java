package com.softserve.hw03;

public class Student {
    private String name;
    private int rating;
    public static double avgRating = 0;


                public static double getAvgRating() {
                    return avgRating;
                 }

                    public String getName() {
                    return name;
                      }

                    public int getRating() {
                        return rating;
                      }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public void setRating(int rating) {
                        this.rating = rating;
                        avgRating = avgRating + rating;
                    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }

    public Student () {
        name="";
        rating=0;
        }

    public Student (String name, int rating) {
        this.name=name;
        this.rating=rating;
        avgRating = avgRating + rating;
    }
            public boolean betterStudent(Student a, Student b){
                    return a.rating>b.rating;
            }
    public static void main (String[] args) {
        // create 3 objects and input information about them
        Student student1 = new Student();
        student1.setName("Dave");
        student1.setRating(81);
        Student student2 = new Student("maria",70);
        Student student3 = new Student("Diana",99);

        // Display total information about students with rating

        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());

       //  Displaythe average and total rating of all student
        System.out.println("Total Rating of all students = " + Student.getAvgRating());
        System.out.println("st2>st1 = " + student3.betterStudent(student2, student1));

        System.out.format("Average Rating = " + "%.2f", Student.getAvgRating()/3);








        }


    }



