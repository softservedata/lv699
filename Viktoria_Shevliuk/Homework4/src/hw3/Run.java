/*
Enter 5 integer numbers. Find
+ position of second positive number;
+ minimum and its position in the array.
+ Count the product of all entered even numbers.
*/

package hw3;

public class Run {
    public static void main(String[] args) {
        int [] numbers = {3, -3, -7, 4, -1};
        int positive;
        int min = numbers[0];
        int imin = 0;
        int product = 1;
        int poscount = 0;

/////////////////////////////////////////////////////////////////////////////////
        for(int i=0; i< numbers.length; i++){
        if(numbers[i]>0){
            poscount++;
            if(poscount==2){
                System.out.println("position of second positive number is " + (i+1));
            }
        }
        product *= numbers[i];
        }
//////////////////////////////////////////////////////////////////////////////////

        int i = 0;
        while (i < numbers.length) {
            if (numbers[i] < min) {
                min = numbers[i];
                imin = i;
            }
            i++;
        }
        System.out.print("Minimum = " + min);
        System.out.println(" and is in " + (imin + 1) + " place");
        System.out.println("Product of all entered even numbers is "+ product);


    }
}
