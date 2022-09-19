package com.softserve.hw09.third_task;

import java.util.*;



public class Student {
	
	public static class ByCourse implements Comparator<Student> {
		@Override
		public int compare(Student st1, Student st2) {
			
			return st1.getCourse() - st2.getCourse();
		}
	}
	public static class ByName implements Comparator<Student> {
		@Override
		public int compare(Student st1, Student st2) {
			int byName = st1.getName().compareTo(st2.getName());
			return byName;
		}
	}
	
	
//----------------
	private String name;
	private Integer course;
	public Student(String name, int course) {
		super();
		this.name = name;
		this.course = course;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCourse() {
		return course;
	}
	public void setCourse(Integer course) {
		this.course = course;
	}
	
	public static List  printStudents(List <Student> students,Integer course) {
		List right = new ArrayList<>();
	for(Student list: students) {
		if((list.getCourse()).equals(course))
		right.add(list.getName());
		
	}
	return right;
	}
	@Override
	public String toString() {
		return "\nStudent name=" + name + ", course=" + course;
	}
	

}
