package com.softserve.hw09.second_task;

import java.util.Map;

public class CompareMap {
	public static void compare(Map<String,String> personMap) {
		String key="";
		for (Map.Entry<String, String> entry : personMap.entrySet()) {
			if(entry.getValue().contains("Orest")) {
				System.out.println("Yes,we have person with  firstName Orest : "+entry.getKey()+" "+entry.getValue());
				key=entry.getKey();
			}
			
		}
		personMap.remove(key);
		
	}
}
