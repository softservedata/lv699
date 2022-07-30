package com.softserve.hw05.serv;

public class Third_task {
    public int position2(int [] numbers) {
     int position=0;
        for(int i=0; i< numbers.length;i++){
            if(numbers[i]>0){
                for(int j=i+1;j< numbers.length;j++){
                   if(numbers[i]>0) {
                       position=i;
                       break;
                   }
                }
            }
        }
        return position;
    }
    public int minimum(int [] numbers) {
        int min = numbers[0];
        int i = 0;
        while (i < numbers.length) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            i++;
        }
        return min;
    }
    public int positionofminimum(int [] numbers) {
        int min = numbers[0];
        int imin = 0;
        int i = 0;
        while (i < numbers.length) {
            if (numbers[i] < min) {
                min = numbers[i];
                imin = i;
            }
            i++;
        }
        return imin;
    }
    public int product(int [] numbers) {
   int product=1;

        for (int i = 0;i < numbers.length;i++) {
            if (numbers[i]%2==0) {
                product=product*numbers[i];
            }
        }
        if(product==1){
            product=0;
        }

        return product;
    }
}
