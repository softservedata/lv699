package hw1;

import java.util.Arrays;

import static java.lang.String.valueOf;

public class Run {
    public static void main(String[] args) {
        Chiken chiken = new Chiken();
        Eagle eagle = new Eagle();
        Penguin penguin = new Penguin();
        Swallow swallow = new Swallow();


        String [] birds = {valueOf(swallow),valueOf(penguin), valueOf(eagle), valueOf(chiken)};
        swallow.fly();
        penguin.fly();
        eagle.fly();
        chiken.fly();

        System.out.println("Chicken can fly: " + chiken.fly());
        System.out.println("Eagle can fly: " + eagle.fly());
        System.out.println("Penguin can fly: " + penguin.fly());
        System.out.println("Swallow can fly: " + swallow.fly());
        System.out.println("Array birds contains: " + Arrays.toString(birds));




    }
    }

