package com.softserve.hw07.practical_tasks.first;

import java.util.ArrayList;
import java.util.List;

public class AppAnimals {
public static void main(String[] args) {
	List<Animal> list = new ArrayList<Animal>();

    list.add(new Cat("Sam"));
    list.add(new Dog("Ivan"));
    list.add(new Cat("Barsik"));
    list.add(new Dog("Hayme"));
    list.add(new Dog("Muhtar"));
    list.add(new Cat("Jack"));
    for (Animal animal : list) {
    	System.out.println(animal); 
       System.out.println(animal.voice()); 
       System.out.println(animal.feed()); 
    }

}
}
