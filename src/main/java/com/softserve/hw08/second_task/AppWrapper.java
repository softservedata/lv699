package com.softserve.hw08.second_task;


public class AppWrapper {
public static void main(String[] args) {
	Wrapper<Integer> box = new Wrapper<>(123);
	Wrapper<String> box1 = new Wrapper<>("one,two,three");
	Wrapper<Boolean> box2 = new Wrapper<>(23!=22);
	System.out.println("Wrapper<Integer> = "+box.getValue());
	System.out.println("Wrapper<String> = "+box1.getValue());
	System.out.println("Wrapper<Boolean> = "+box2.getValue());
}
}
