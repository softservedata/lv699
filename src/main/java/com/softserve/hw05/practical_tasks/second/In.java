package com.softserve.hw05.practical_tasks.second;

import java.util.Scanner;

public class In {
	 private Scanner sc;

	    public In() {
	        sc = new Scanner(System.in);
	    }
	public  int number(){	
		int number =sc.nextInt();
		return number;
	}
	public void close() {
        sc.close();
    }
	
}
