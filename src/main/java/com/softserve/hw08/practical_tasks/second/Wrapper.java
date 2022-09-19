package com.softserve.hw08.practical_tasks.second;

public class Wrapper<T> {
	private T t;

	public Wrapper(T t) {
		this.t = t;
	}

	public T getT() {
		return t;
	}

	@Override
	public String toString() {
		return "Wrapper" + t + "]";
	}

	
	
}
