package com.softserve.hw12.four;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Appl {
    public static void main(String[] args) {
//    	Create file1.txt file with a text about your career.
//    	Read context from file into array of strings. Each array item contains one line from file.
//    	Write in to the file2.txt
//    	   1) number of lines in file1.txt.
//    	   2) the longest line in file1.txt.
//    	   3) your name and birthday date. 

			String fileName= "C:/Tools/eclipse-workspace/lv699/src/com/softserve/hw12/four/file1.txt";
			String fileName1= "C:/Tools/eclipse-workspace/lv699/src/com/softserve/hw12/four/file2.txt";
			FileWriter fw = null;
			BufferedWriter bw = null;
			FileReader fr = null;
			BufferedReader br = null;
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			System.out.println("Read data from file: "+fileName);
			String s1=null;
			int count=0;
			while((s1=br.readLine())!=null) {
				//System.out.println(s1);
				count++;
			}
			fr.close();
			br.close();
				fr = new FileReader(fileName);
				br = new BufferedReader(fr);
				int longest=0;
				String Longest=null;
				String [] s=new String[count];
				for(int i=0;i<count;i++) {
					s[i]=br.readLine();
				//	System.out.println(s[i]);
					if(s[i].length()>longest) {
						longest=s[i].length();
						Longest=s[i];
					}
				}
				fr.close();
				br.close();
		//			1) number of lines in file1.txt.
					fw = new FileWriter(fileName1);
					bw = new BufferedWriter(fw);
					bw.write("number of lines in file1.txt: ");	
						bw.write(count+"\r\n");
						//	2) the longest line in file1.txt.
							bw.write("This is the longest line: ");	
							bw.write(Longest+"\r\n");	
						
//				    	   		3) your name and birthday date. 
						String name="";
						String birthday="";
						for(int i=0;i<count;i++) {
							if(s[i].contains("Name")) {
								name=s[i];							
							}
							if(s[i].contains("Birthday"))
							{
								birthday=s[i];
							}
						}
						String pattern1 =":\\s(\\w*\\b)";
						Pattern p1=Pattern.compile(pattern1);
						Matcher m1=p1.matcher(name);
						m1.reset();
							while(m1.find()) {
							//	System.out.println(m1.group(1));
								bw.write("Name: ");	
								bw.write(m1.group(1)+"\r\n");	
							}
							String pattern ="(\\d{2})(\\.\\d{2})(\\.\\d{4})";
							Pattern p=Pattern.compile(pattern);
							Matcher m=p.matcher(birthday);
							m.reset();
								while(m.find()) {
								//	System.out.println(birthday.substring(m.start(), m.end()));
									bw.write("Birthday date: ");	
									bw.write(birthday.substring(m.start(), m.end())+"\r\n");	
								}
							

							bw.close();	}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
    }
}
