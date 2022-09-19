package com.softserve.hw07.practical_tasks.first;

public class Cat implements Animal {
	private String name;
	

	public Cat(String name) {
		super();
		this.name = name;
	}

	@Override
	public String voice() {
		
		return "Meow";
	}

	@Override
	public String feed() {
		
		return "Cat feed, please";
	}
	@Override
	public String toString() {
		return "Cat name=" + name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
