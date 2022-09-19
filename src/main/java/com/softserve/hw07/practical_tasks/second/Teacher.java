package com.softserve.hw07.practical_tasks.second;

public class Teacher extends Staff {
private final String TYPE_PERSON;

	public Teacher(String name, String tYPE_PERSON) {
	super(name);
	TYPE_PERSON = tYPE_PERSON;
}

	@Override
	public int salary() {
		return 50;
	}

	@Override
	public String print() {
		return "I am a teacher" +"TYPE_PERSON= " + getTYPE_PERSON();
	}

	public String getTYPE_PERSON() {
		return TYPE_PERSON;
	}
	

}
