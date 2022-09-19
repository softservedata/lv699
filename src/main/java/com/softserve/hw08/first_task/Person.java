package com.softserve.hw08.first_task;

public abstract class Person {
	//	-------------
	private FullName fullName;
	private int age;
	public Person(String firstName, String lastName, int age) {
		this.fullName = new FullName(firstName, lastName);
		this.age = age;
	}
public FullName getFullName() {
		return fullName;
	}

	public void setFullName(FullName fullName) {
		this.fullName = fullName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


public String info() {
	return "First name:" + fullName.getFirstName() + ", Last name:" + fullName.getLastName() + ", Age:" + age;
}
public abstract String activity();
}
