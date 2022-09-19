package com.softserve.hw06.practical_tasks.second;



public class Line {
	Point one;
	Point two;
	public Line(int x, int y) {
		super();
		this.one = new Point(x,y);
		this.two = new Point(x,y);
	}
	
	public String print() {
		return "print Line";
	}

	@Override
	public String toString() {
		return "\nLine one= " + one + ", two= " + two;
	}

}
