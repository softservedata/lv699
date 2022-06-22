package hw01;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class NameAddress {
    public static void main(String[] args) {

        String name;
        String address;

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?: ");
        name = scan.nextLine();
        System.out.println("Where are you live " + name + "?");
        address = scan.nextLine();
        System.out.println(name + " live at the address: " + address);

        scan.close();
    }
}

