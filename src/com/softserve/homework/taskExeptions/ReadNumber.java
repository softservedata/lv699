package com.softserve.homework.taskExeptions;

import java.util.Arrays;
import java.util.Scanner;

public class ReadNumber {
   public void readNumber(int start, int end) throws Exception {
       int[] array = new int[0];
       int num1 = 0;
       int num2 = 0;
       int num3 = 0;
       int num4 = 0;
       int num5 = 0;
       int num6 = 0;
       int num7 = 0;
       int num8 = 0;
       int num9 = 0;
       int num10 = 0;
       try {
           array = new int[10];
           System.out.println("Please, enter a number greater than " + start + " to " + end + ".");
           Scanner sc = new Scanner(System.in);
           num1 = 0;
           num2 = 0;
           num3 = 0;
           num4 = 0;
           num5 = 0;
           num6 = 0;
           num7 = 0;
           num8 = 0;
           num9 = 0;
           num10 = 0;
           for (int i = 0; i < array.length; i++) {
               array[i] = Integer.parseInt(sc.nextLine());
               if ((array[i] > start) && (array[i] < end)) {
                   num1 = array[0];
                   num2 = array[1];
                   num3 = array[2];
                   num4 = array[3];
                   num5 = array[4];
                   num6 = array[5];
                   num7 = array[6];
                   num8 = array[7];
                   num9 = array[8];
                   num10 = array[9];
                   System.out.println("Your number" + (i + 1) + " is: " + array[i]);
                   Arrays.sort(array);
                   System.out.println(Arrays.toString(array));
                   System.out.println("Your numbers are:"+"\n  "+start+"<"+num1+"<"+num2+"<"+num3+
                           "<"+num4+"<"+num5+"<"+num6+"<"+num7+"<"+num8+"<"+num9+"<"+num10+"<"+end);
               }  else {
                   System.out.println("You entered wrong number,try again.");
                   sc.close();
                   throw new ArithmeticException("You entered wrong number or your number"+
                            " does not meet the requirement specified in the conditions");
               }
           }
       } catch (NumberFormatException e) {
           System.out.println("You entered wrong format");;
       } catch (ArithmeticException e) {
           System.out.println( "You entered wrong number or your number"+
                   " does not meet the requirement specified in the conditions");
       } catch (ArrayStoreException e) {
           System.out.println( "You entered wrong format");
       } finally {
       }


           }

    public static void main(String[] args) throws Exception {

       ReadNumber readNumber=new ReadNumber();
       readNumber.readNumber(1,100);


    }
}
