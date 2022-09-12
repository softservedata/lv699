/*  Create an array of ten integers. Display
        + the biggest of these numbers;
        + the sum of positive numbers in the array;
        + the amount of negative numbers in the array.
        + What values there are more: negative or positive?
*/
package practical_task_1;

import java.sql.SQLOutput;

public class Run {
    public static void main(String[] args) {
        int sum = 0;
        int negcount = 0;
        int poscount = 0;

        int[] arr = {-4, 3, 7, -33, 2, 4, 45, -90, 1, 6};

        int tmp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println("\nYour array: \n");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("\n\nThe biggest of these numbers: " + arr[0]);

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0){
                sum += arr[i];
                poscount++;
            }

        } System.out.println("The sum of positive numbers in the array: "+ sum);

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0){
                 negcount++;
            }

        } System.out.println("The amount of negative numbers in the array: "+ negcount);

        if(poscount > negcount){
            System.out.println("There are more positive numbers in your array");
        } else System.out.println("There are more negative numbers in your array");

    }
}
