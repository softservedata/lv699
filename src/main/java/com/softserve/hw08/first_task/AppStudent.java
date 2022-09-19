package com.softserve.hw08.first_task;

public class AppStudent {
	
public static void main(String[] args) {
	 Person st1 = new Student("Ira", "Svystun", 25, 3);
     Person st2 = new Student("Stepan", "Nestepan", 20, 5);
    System.out.println(st1.info());
    System.out.println(st1.activity()); 
    System.out.println(st2.info());   
    System.out.println(st2.activity());   
}
}
