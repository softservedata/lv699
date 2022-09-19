package com.softserve.hw08.first_task;

public class Student extends Person {
	
	private int course;

	public Student(String firstName, String lastName, int age, int course) {
		super(firstName, lastName, age);
		this.course = course;
	}
	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}
	@Override
	public String info() {
		
		return super.info()+" course: "+getCourse();
	}
	
	@Override
	public String activity() {
		String status="";
		if(course>0&&course<=3) {
			status="I study at university";
		}
		else if(course>3&&course<=5) {
			status="The best years of university!!";
		}
		else if(course==6) {
			status="I am finishing my university studies";
		}
		
		
		return status;
	}
	
}

