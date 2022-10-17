/*Enter 10 integer numbers.
Calculate the sum of first 5 elements if they are positive
 or product of last 5 element in the other case.
 */

package hw2;

public class Run {

    public static void main(String[] args) {
        int [] numbers = {3, 0, -7, 4, -1, 10, 65, -3, 35, 1};
        int sum = 0;
        int product = 1;

            int checkcount=0;
            for(int i : numbers){
                if(i>0){checkcount ++;}else break;
            }
            if(checkcount==5){
                for(int i=0; i<5; i++){sum += numbers[i];}  System.out.println("The sum of first 5 numbers is: "+sum);
            } else for(int i=5; i< numbers.length; i++){product *= numbers[i];}System.out.println("The product of first 5 numbers is: "+product);;



}}
