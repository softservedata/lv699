package com.softserve.hw08.practical_tasks.second;

public class AppShape {
public static void main(String[] args) {
	Wrapper<Shape> squareWrapper = new Wrapper(new Square());
	Wrapper<String> stringWrapper = new Wrapper("Something");
	Wrapper<Shape> circleWrapper = new Wrapper(new Circle());
	System.out.println(stringWrapper);
}
}
