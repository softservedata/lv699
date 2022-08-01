package pract_task_1;

import java.util.Scanner;

public class CheckNumber {

    private int num;
    private static int counter;
    public static int getCounter() {
        return counter;
    }

    public void checkOdd(){
        Scanner scanner = new Scanner(System.in);
        int c = 0;
        while (c<3){
            System.out.println("Enter a number, please");
            this.num = scanner.nextInt();
            int rest = num % 2;
            if(rest > 0){
                counter++; }
            c++;
        }
        System.out.println( getCounter() + " of your numbers are odd");
    }
}
