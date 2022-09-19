package com.softserve.hw11.practical_tasks_second;


public class Appl {

	public static void main(String[] args) {
		Plant[] pl=new Plant[5];
				pl[0]=new Plant("alpines", "blue",3);
		        pl[1]=new Plant("bulbs", "red",3);
		        pl[2]=new Plant("cacti", "white",3);
		        pl[3]=new Plant("climbers", "green",3);
		        pl[4]=new Plant("rose", "red",3);
		        for(Plant p:pl) {
	   try {
	    
	      System.out.println(p);
	   } catch (ColorException | TypeException e) {
	      System.err.println(e.getMessage() + "\n");
	      //e.printStackTrace();
	   }
		        }
	}
}
