package com.softserve.hw12.practical_tasks.third;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

public class Third {
    public static void main(String[] args) {
//    	Prepare mytext.txt file with a lot of text inside.
//    	Read context from file into array of strings.
//    	Each array item contains one line from file.
//    	Complete next tasks:
//    	   1) count and write the number of symbols in every line.
//    	   2) find the longest and the shortest line. 
//    	   3) find and write only that lines, which consist of word «var»
			String fileName= "C:/Tools/eclipse-workspace/lv699/src/com/softserve/hw12/practical_tasks/third/mytext.txt";
			String fileName1= "C:/Tools/eclipse-workspace/lv699/src/com/softserve/hw12/practical_tasks/third/mytext1.txt";
			FileWriter fw = null;
			BufferedWriter bw = null;
			FileReader fr = null;
			BufferedReader br = null;
			//FileOutputStream outFile;
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			System.out.println("Read data from file: "+fileName);
			String s1=null;
			int count=0;
			String shortest=null;
			while((s1=br.readLine())!=null) {
				//System.out.println(s1);
				count++;
				shortest=s1;
			}
			fr.close();
			br.close();
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			int longest=0;
			String lonGest=null;
		//	String shortest=s[0];
			int	shorts=0;
			String [] s=new String[count];
//	2) find the longest and the shortest line. 
			for(int i=0;i<count;i++) {
				s[i]=br.readLine();
				System.out.println(s[i]);
				System.out.println("Size of this line is "+s[i].length()+" symbols");
				if(s[i].length()>longest) {
					longest=s[i].length();
					lonGest=s[i];
				}
				
				if(s[i].length()<shortest.length()) {
					shorts=s[i].length();
					shortest=s[i];
				}
				
			}
			s1=s[0];
			System.out.println("This is the longest line: \n"+lonGest+"\nsize "+longest+" symbols");
			System.out.println("This is the shortest line: \n"+shortest+"\nsize "+shorts+" symbols");
//	1) count and write the number of symbols in every line.
			fw = new FileWriter(fileName1);
			bw = new BufferedWriter(fw);
			//outFile = new FileOutputStream(fileName);
			for(int i=1;i<count;i++) {
				bw.write(s[i]+" "+s[i].length()+"\r\n");
			
			}
			bw.close();
// 3) find and write only that lines, which consist of word «var»
			fw = new FileWriter(fileName1);
			bw = new BufferedWriter(fw);
			//outFile = new FileOutputStream(fileName);
			for(int i=1;i<count;i++) {
				if(s[i].contains("var")) {
					System.out.println("This sentence contains symbols 'var': \n"+s[i]);
				bw.write(s[i]+" "+s[i].length()+"\r\n");
			}
			}
			bw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
    }
}
