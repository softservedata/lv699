package com.softserve.hw05.serv;

import com.softserve.hw05.Car;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_cars {
    Car[] car;

    public Sort_cars() {
        car= new Car[4];
    }
    public void sortByfield(){
        car[0] = new Car(2010, 1.3);
        car[1] = new Car(2005, 2.2);
        car[2] = new Car(2010, 2.0);
        car[3] = new Car(2022, 5.0);
            Car scar= new Car();

        System.out.println("Sorted by field year:");
        scar.defaultsort(car);

    }
    public void sortBymodel(){
        car[0] = new Car(2010, 1.3);
        car[1] = new Car(2005, 2.2);
        car[2] = new Car(2010, 2.0);
        car[3] = new Car(2022, 5.0);
        System.out.println("No sorted car: " + Arrays.toString(car));
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter model year, please: ");
        int tmp=sc.nextInt();
        Car scar = new Car();
        int j=0;
        System.out.println("Sorted by model year");
        for (int i = 0; i < car.length; i++) {
                if (car[i].getYear_of_production()==tmp)
                {

                    scar = car[i];
                    System.out.println(scar);
                j++;
            }
        }

        if(j==0){
            System.out.println("Wrong number");

        }

    }
    }
