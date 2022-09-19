package com.softserve.hw07.practical_tasks.second;

public class Student extends Person {
	private final String TYPE_PERSON;

	public Student(String name,String tYPE_PERSON) {
		super(name);
		TYPE_PERSON = tYPE_PERSON;
	}
	@Override
	public String print() {
		return "I am a student" +" \nTYPE_PERSON= " + getTYPE_PERSON();
	}
	public String getTYPE_PERSON() {
		return TYPE_PERSON;
	}
	
}
