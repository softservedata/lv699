package com.softserve.hw08.second_task;
//import java.io.Serializable;
public class Wrapper<T> {//implements Serializable{
	

	private T value;

	public Wrapper(T value) {
		super();
		this.value = value;
	}
	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	
	

}
