package com.softserve.hw07.practicalTASKS.PersonTask;

public class App {
    public static void main(String[] args) {

        Person[] arr = new Person[5];
        arr[0] = new Student("Student1");
        arr[1] = new Teacher("Teacher1");
        arr[2] = new Cleaner("Cleaner1");
        arr[3] = new Teacher("Teacher2");
        arr[4] = new Cleaner("Cleaner2");

    for (int i=0; i < arr.length; i++) {
       System.out.println(arr[i].print());
        System.out.println(arr[i].salary());
    }

    }
}
