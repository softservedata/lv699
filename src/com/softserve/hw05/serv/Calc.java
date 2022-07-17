package com.softserve.hw05.serv;

public class Calc {

    public int Number(int [] numbers) {
        int number=0;
        int sum=0;
        int product=1;
            if(numbers[0]>0&&numbers[1]>0&&numbers[2]>0&&numbers[3]>0&&numbers[4]>0){
                System.out.println("Your massive are positive");
                for(int i=0;i<5;i++){
                    sum=sum+numbers[i];

                }
                number=sum;
            }
            else{
                System.out.println("Your massive are negative");
                for(int i=9;i>5;i--){
                    product=product*numbers[i];
                }
                number=product;
            }

        return number;
    }
}
