package com.softserve.hw12.task04;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        String readFileName = "/Users/bohdanviter/Documents/Tools/ideaProjects/lv699/src/com/softserve/hw12/task04/file1.txt";
        String writeFileName = "/Users/bohdanviter/Documents/Tools/ideaProjects/lv699/src/com/softserve/hw12/task04/file2.txt";

        int numberOfLines = 0;
        int longestLineCount = 0;
        String longestLine = null;

        FileReader fr = null;
        BufferedReader br = null;
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
//  read data from file1, defining the number of lines
            fr = new FileReader(readFileName);
            br = new BufferedReader(fr);

            System.out.println("Read data from: " + readFileName.substring(readFileName.lastIndexOf("file")));
            while (br.readLine() != null) {
                numberOfLines++;
            }

            br.close();
            fr.close();

            System.out.println("Number of lines in file1: " + numberOfLines);

//  defining the longest line from file1, reading data to String array
            fr = new FileReader(readFileName);
            br = new BufferedReader(fr);
            String[] strArray = new String[numberOfLines];

            for (int i = 0; i < strArray.length; i++) {
                strArray[i] = br.readLine();
                if (strArray[i].length() > longestLineCount) {
                    longestLineCount = strArray[i].length();
                    longestLine = strArray[i];

                }
            }
            br.close();
            fr.close();

/*
check if array is filled with strings from file1 and if the longestLine is found
            for (String str : strArray) {
                System.out.println(str);
            }

            System.out.println("Longest string count: " + longestStringCount);
            System.out.println("Longest string: " + longestString);
*/

// writing data to file2
            fw = new FileWriter(writeFileName);
            bw = new BufferedWriter(fw);

            System.out.println("Write data to: " + writeFileName.substring(writeFileName.lastIndexOf("file")));
            bw.write("Number of lines in file1: " + numberOfLines + "\n");
            bw.write("The longest line in the file1:\n\t" + longestLine + "\n");
            for(String str: strArray) {
                if (str.toLowerCase().contains("name")){
                    bw.write(str + "\n");
                }
                if (str.toLowerCase().contains("birth")){
                    bw.write((str));
                }
            }
            bw.close();
            fw.close();
            System.out.println("The file2 was successfully filled");

        } catch (FileNotFoundException fnf) {
            System.out.println("FileNotFoundException: ");
            fnf.printStackTrace();
        } catch (IOException io) {
            System.out.println("IOException: ");
            io.printStackTrace();
        } catch (NullPointerException np) {
            System.out.println("NullPointerException: ");
            np.printStackTrace();
        } catch (Exception e) {
            System.out.println("Unknown exception: ");
            e.printStackTrace();
        }

    }
}