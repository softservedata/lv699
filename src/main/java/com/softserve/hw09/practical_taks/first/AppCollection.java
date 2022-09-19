package com.softserve.hw09.practical_taks.first;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class AppCollection {
public static void main(String[] args) {
	List<Integer> myCollection= new ArrayList();
	List<Integer> newCollection=new LinkedList();
	myCollection.add(20);
	myCollection.add(7);
	myCollection.add(25);
	myCollection.add(10);
	myCollection.add(15);
	myCollection.add(1);
	myCollection.add(1);
	myCollection.add(6);
	myCollection.add(2);
	myCollection.add(5);
	System.out.println("My collection is: "+myCollection);
	//Find and save in list newCollection 
//	all positions of element more than 5 in the collection.
//	Print newCollection
	for(Integer collection:myCollection) {
		if(collection>5) {
			newCollection.add(collection);
		}
	}
	System.out.println("We take elements only bigger than 5");
	System.out.println("New collection is: "+newCollection);
//	Remove from collection myCollection elements, 
//	which are greater then 20. 
//	Print result
	Iterator<Integer> iterator = myCollection.iterator();
	while(iterator.hasNext()) {
	    Integer current = iterator.next();
	   
	    if (current>20) {
	    	 System.out.println("element = " + current+">"+20+"\nremove: "+current);
	        iterator.remove();
	    }
	    if (current<20) {
	    	 System.out.println("element = " + current+"<"+20+"\n stay: "+current);
	    }
	}
	System.out.println("Remove from collection myCollection elements, which are greater then 20");
	System.out.println("My collection is: "+ myCollection);
//	Insert elements 1, -3, -4 in positions 2, 8, 5. 
//	Print result in the format: “position – xxx,
//	value of element – xxx”
	System.out.println("Insert elements 1, -3, -4 in positions 2, 8, 5.");
	myCollection.set(2,1);
	myCollection.set(8,-3);
	myCollection.set(5,-4);
	for(int i=0;i<myCollection.size();i++) {
	System.out.println("\"nposition: " +myCollection.indexOf(myCollection.get(i))
	+", value of element: " +myCollection.get(i)+"\"");
	}
//	Sort and print collection 
	Collections.sort(myCollection);
	System.out.println("My collection is: "+ myCollection);
}
}
