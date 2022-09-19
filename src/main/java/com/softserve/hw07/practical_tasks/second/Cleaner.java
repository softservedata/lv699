package com.softserve.hw07.practical_tasks.second;

public class Cleaner extends Staff  {
	private final String TYPE_PERSON;

	public Cleaner(String name,String tYPE_PERSON) {
		super(name);
		TYPE_PERSON = tYPE_PERSON;
	}

	@Override
	public int salary() {
		return 100;
	}

	@Override
	public String print() {
		return "I am a cleaner" +"\nTYPE_PERSON= " + getTYPE_PERSON();
	}

	public String getTYPE_PERSON() {
		return TYPE_PERSON;
	}
	
}
