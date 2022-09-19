package com.softserve.hw09.second_task;

import java.util.*;
import java.util.Map.Entry;

public class AppMap {
public static void main(String[] args) {
	Map<String,String> personMap= new HashMap<>();
	personMap.put("Pavlyk","Vitalii");
	personMap.put( "Nestepan","Stepan");
	personMap.put( "Pugach","Viktoria");
	personMap.put("Skoropad","Yura");
	personMap.put("Mamay","Vasyl");
	personMap.put("Stetskiv","Orest");
	personMap.put("Dzyubalo","Vitalii");
	personMap.put("Lepin","Olena");
	personMap.put("Skiriak","Yura");
	personMap.put("Ivanov", "Ivan");
	System.out.println("Original Map: "+personMap);
	
	Set set=new HashSet<>();
	 for(Entry<String, String> mapVal:personMap.entrySet()) {

         if(!set.add(mapVal.getValue())) {
        	 System.out.println("This first name "+mapVal.getValue()+" is duplicated");  

         }
	 }
//HashMap<String, String> duplicatMap = new HashMap<>();
//	    Set<Entry<String, String>> entrySet = personMap.entrySet();
//	    Iterator<Entry<String, String>> iterator = entrySet.iterator();
//	    while(iterator.hasNext()) {
//	        Entry<String, String> entry = iterator.next();
//	        String key = entry.getKey();
//	        String value = entry.getValue();
//
//	        if(duplicatMap.containsKey(value)) {
//	        	 System.out.println(value+" "+duplicatMap.get(value)+" duplicate is "+value+" "+key);
//	        } else {
//	           duplicatMap.put(value, key);
//	        }
//	    }
         System.out.println("Remove person with firstName Orest");
	    CompareMap.compare(personMap);
		System.out.println(personMap);


  

} 
}



