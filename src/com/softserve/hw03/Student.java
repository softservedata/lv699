package com.softserve.hw03;

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
        name="";
        rating=-1;
        avgRating=avgRating + rating;}

    public Student (String name, int rating) {
        this.name=name;
        this.rating=rating;
        avgRating=avgRating + rating;
    }

  // допрацювати
   /*public boolean betterStudent(int rating) {
       result= rating > avgRating;
                    return true;

         }*/


   // betterStudent - to definite the better student (between two, return true or false)
   public String toString() {
       return "Student{" +
               "name:" + name +
               ", rating = " + rating + '}';

   }

public static void main (String[] args) {
        Student student1 = new Student("Dave",85);
    System.out.println(student1.toString());
   // System.out.println(student1.betterStudent(85));
        Student student2 = new Student("maria",70);
    System.out.println(student2.toString());
   // System.out.println(student2.betterStudent(70));
        Student student3 = new Student("Diana",99);
    System.out.println(student3.toString());
   // System.out.println(student3.betterStudent(99));

        System.out.println("avgRating = " + Student.getAvgRating()/3);

}

}
