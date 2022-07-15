package com.softserve.OtherExamples;

public class Arrays_of_Strings {
    public static  void main(String [] args){
        int[] numbers = new  int[5];
        numbers[0] =10;
        String [] strings = new  String[4];
        strings[0] = "джава";
        strings[1] = "джава1";
        strings[2] = "джава2";
        strings[3] = "джава3";
        //System.out.println(strings[0]);
       // System.out.println(strings[2]);
        for(int i=0; i< strings.length;i++){
         //   System.out.println(strings[i]);
        }

         for(String string:strings){
           //  System.out.println(string);
            // System.out.println();

         }
         int[] numbers1 = {1,2,3};
         int sum = 0;
         for(int x:numbers1){
             sum = sum+x;
            // System.out.println(numbers1);

         }
        System.out.println(sum);
         int value = 0;
         String s = null;
        System.out.println(s);
    }
}
