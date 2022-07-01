package com.softserve.hw03;

public class Objects {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        Person p4 = new Person();
        Person p5 = new Person();
        p1.input("Vitalii","Pavlyk",1997);
        System.out.println(p1.output());
        System.out.println("p1.getAge() = " + p1.getAge());
        p2.input("Ivan", "Oleshko",1990);
        System.out.println(p2.output());
        System.out.println("p2.getAge() = " + p2.getAge());
        p3.input("Figo", "Wuud",1986);
        System.out.println(p3.output());
        System.out.println("p3.getAge() = " + p3.getAge());
        p4.input("Sven", "Johnson",1980);
        System.out.println(p4.output());
        System.out.println("p4.getAge() = " + p4.getAge());
        p5.input("Stepan", "Skiriak",1977);
        System.out.println(p5.output());
        System.out.println("p5.getAge() = " + p5.getAge());
        p3.changeName("Viktor","Vaskes");
        System.out.println("p3.changeName() = " + p3.output());
    }
}
