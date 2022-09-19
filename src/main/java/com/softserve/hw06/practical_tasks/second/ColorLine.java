package com.softserve.hw06.practical_tasks.second;

public class ColorLine extends Line {

	public ColorLine(int x, int y) {
		super(x, y);
	}
	
	
	public String print() {
		return "print ColorLine";
	}


	@Override
	public String toString() {
		return "\nColorLine one= " + one + ", two= " + two;
	}

}
