package com.softserve.hw03;

public class Person {
    private String name;
    private  String surname;
    private static int yb;


    public Person(int yb) {
        this.yb = yb;
        name = "";
        surname = "";
    }

    public Person(int yb , String name,String surname) {
        this(yb);
        this.name = name;
        this.surname = name;
    }

    public static int getYb() {
        return yb;
    }



    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }

    public void setYb(int yb) {
        this.yb = yb;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String name) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "yb=" + yb +
                ", name='" + name + '\'' +
                '}';
    }
}
public class main {

    public static void main(String[] args) {
        Person person1 = new Person("Oleg");
        person1.setYb(1984);
        Person person2 = new Person("Anna");
        person2.setYb(1985);
        Person person3 = new Person();
        person3.setName("Mary");
        person3.setYb(1986);
        System.out.println("Out person");
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println();
        System.out.print("Student 1 has better rating than student2 ");
        //System.out.println(person1.betterPerson(person2));
        System.out.println();
        //System.out.printf("Average rating is " + "%.2f", Person.getAvgRating());
    }

}
