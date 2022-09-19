package com.softserve.hw06.practical_tasks.second;

public class Point {
private int x;
private int y;
public Point() {
	x=0;
	y=0;
}
public Point(int x, int y) {
	super();
	this.x = x;
	this.y = y;
}


public int getX() {
	return x;
}

public void setX(int x) {
	this.x = x;
}

public int getY() {
	return y;
}

public void setY(int y) {
	this.y = y;
}
@Override
public String toString() {
	return "point x= " + x + ", y= " + y;
}
public String print() {
	return "print Point";
}

}
