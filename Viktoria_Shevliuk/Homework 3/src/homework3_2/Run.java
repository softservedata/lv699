package homework3_2;

import pract_task_4.Product;


import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {

        Dog dog1 = new Dog("LUCKY", Dog.Breed.DOBERMAN, 3);
        Dog dog2 = new Dog("BUG", Dog.Breed.BEAGLE, 7);
        Dog dog3 = new Dog("CHOO", Dog.Breed.BULLDOG, 11);

        List<Dog> list = new ArrayList<Dog>();
        list.add(dog1);
        list.add(dog2);
        list.add(dog3);

        list.sort(new AgeComparator());
        for(Dog d0 : list){
            System.out.println("The name of the oldest dog is " + d0.getName());
            break;
        }

        if(dog1.equals(dog2) || dog1.equals(dog3) || dog2.equals(dog3)){
            System.out.println("There are dogs with the same name");
        }else System.out.println("There are no dogs with the same name");




    }
}
