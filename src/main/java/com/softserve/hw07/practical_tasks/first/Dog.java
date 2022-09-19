package com.softserve.hw07.practical_tasks.first;

public class Dog implements Animal {
private String name;
	

	public Dog(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public String voice() {
		
		return "Haaw";
	}

	@Override
	public String feed() {
		
		return "Dog feed, please";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Dog name=" + name;
	}
	
}
