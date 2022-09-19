package com.softserve.hw05.practical_tasks.first;

public class Calc {
    //the biggest of these numbers
    public int theBiggest(int[]arg0) {
        int big=arg0[0];
        for (int arg:arg0) {
            if(big<arg){
                big=arg;
            }
        }
        return big;
    }
    //the sum of positive numbers in the array
    public int sumpositive(int[]arg0) {
        int sum=0;
        for (int arg:arg0) {
            if(arg>0){
                sum+=arg;
            }
        }
        return sum;
    }
    //the amount of negative numbers in the array
    public int amountofnegative(int[]arg0) {
        int count=0;
        for (int arg:arg0) {
            if(arg<0){
                count++;
            }
        }
        return count;
    }
    // What values there are more: negative or positive?
    public String morevalues(int[]arg0) {
        int count=0;
        String result="";
        if(arg0==null){
            result="array is empty";
        }
        else {
            for (int arg : arg0) {
                if (arg < 0) {
                    count++;
                }
            }
            if (count > (count - arg0.length)) {
                result = "negative";
            } else if (count < (count - arg0.length)) {
                result = "positive";
            } else if (count == arg0.length) {
                result = "equal";
            }
        }
       return result;
    }


}
