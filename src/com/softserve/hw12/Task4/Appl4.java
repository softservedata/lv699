package com.softserve.hw12.Task4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.sql.Array;
import java.util.Arrays;

public class Appl4 {


    public static void main(String[] args) {

        //Prepare mytext.txt file with a lot of text inside.
        // Each array item contains one line from file.

        int numberOfSympols = 0;
        int numberOfLines = 0;
        String shortestLine = null;
        int shortestlinelenght = 10000;
        String longestLine = null;
        int longestlinelenght = 0;


        String fileName = "C:/Liuba/Kurs OP/Java core/21/mytext.txt";
        FileWriter fw = null;
        BufferedWriter bw = null;
        FileReader fr = null;
        BufferedReader br = null;
        String data = "My name is Luba.\r\nI am 31 years old.\r\nI am working in the HR industry and combine learning with family and work.\r\nSince my studies, I was fascinated by programming.\r\nI learned the basics of Basic, Pascal, SQL at university.\r\nSo I decided to learn java programming.";
        try {
            fw = new FileWriter(fileName);
            bw = new BufferedWriter(fw);
            System.out.println("Write data to file: " + fileName);
            bw.write(data);
            bw.close();

            fr = new FileReader(fileName);
            br = new BufferedReader(fr);
            String s = null;
            while ((s = br.readLine()) != null) {
                numberOfLines++;
            }
            br.close();
            fr.close();
            System.out.println("In the File there are " + numberOfLines + " lines.");

            // Read context from file into array of strings.
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);
            System.out.println("Read data from file to array");
            String[] lineArray = new String[numberOfLines];
            for ( int i = 0; i<numberOfLines; i++) {
                lineArray[i] = br.readLine();
                if (lineArray[i].length() > longestlinelenght) {
                    longestLine = lineArray[i];
                    longestlinelenght = lineArray[i].length();
                }
                if (lineArray[i].length() < shortestlinelenght) {
                    shortestLine = lineArray[i];
                    shortestlinelenght = lineArray[i].length();
                }
                // 1) count and write the number of symbols in every line.
                System.out.println(i + " line has " + lineArray[i].length() + " symbols");
                }
            // 2) find the longest and the shortest line.
            System.out.println("Longest line: " + longestLine + " There are " + longestlinelenght + " symbols");
            System.out.println("Shortest line: " + shortestLine + " There are " + shortestlinelenght + " symbols");


            fr.close();
            br.close();
            System.out.println(Arrays.toString(lineArray));

//Write in to the file2.txt
//   3) your name and birthday date.

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
