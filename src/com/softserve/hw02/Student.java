package com.softserve.hw02;

public class Student {
    private String name;
boolean result;
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
                    }


    public Student () {
     avgRating=avgRating + rating;}

    public Student (String name, int rating) {
        this.name=name;
        this.rating=rating;
        avgRating=avgRating + rating;
    }

  // допрацювати
   public boolean betterStudent() {
     return result = rating > avgRating;

         }


   // betterStudent - to definite the better student (between two, return true or false)
   public String toString() {
       return "Student{" +
               "name:" + name +
               ", rating = " + rating + '}';

   }

public static void main (String[] args) {
        Student student1 = new Student("Dave",85);
        student1.betterStudent();
        Student student2 = new Student("maria",70);
        student2.betterStudent();
        Student student3 = new Student("Diana",99);
        student3.betterStudent();

        System.out.println("student1 = " + student1);
        System.out.println("student2 = " + student2);
        System.out.println("student3 = " + student3);

        System.out.println("avgRating = " + Student.getAvgRating()/3);

}

}
