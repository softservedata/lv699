package com.softserve.hw06.practical_tasks.second;

import java.util.Arrays;

import com.softserve.hw07.first.ContractEmployee;
import com.softserve.hw07.first.Employee;
import com.softserve.hw07.first.SalariedEmployee;

public class App {
	public static void main(String[] args) {
		Line [] cars=new Line[6];
		cars[0]=new Line(12,12);
		cars[1]=new Line(6,8);
		cars[2]=new ColorLine(2,8);
		cars[3]=new Line(-3,5);
		cars[4]=new ColorLine(9,-5);
		cars[5]=new Line(10,15);
		System.out.println(Arrays.toString(cars));
		 for (Line employee : cars) {
	            if (employee instanceof Line) {
	               	System.out.println(((Line) employee).print());
	            }
	            else if (employee instanceof ColorLine) {
	                System.out.println(((ColorLine) employee).print());
	            }

	    }
	}
	}
