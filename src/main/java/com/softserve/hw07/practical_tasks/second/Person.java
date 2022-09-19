package com.softserve.hw07.practical_tasks.second;

public abstract class Person {
private String name;

public Person(String name) {
	super();
	this.name = name;
}

abstract String print();

@Override
public String toString() {
	return "\nPerson [name=" + name + "]";
}
}

