/* 3. Write a Java program that reads a file and prints the number of lines, words, and characters. */

import java.io.*;

public class Q3{
	public static void main(String[] args)throws IOException{
		FileReader file = new FileReader("Q1.txt");
		
        int lineCount = 0;
        int charCount = 0;
        int wordCount = 0;
        try{
            BufferedReader br = new BufferedReader(file);
            String line;
            while((line = br.readLine())!=null){
            	lineCount++;
            	charCount = charCount + line.replace(" ","").length();
            	wordCount = wordCount + line.split("\\s+").length;
            }
            System.out.println("Line Count: "+lineCount);
            System.out.println("Word Count: "+wordCount);
            System.out.println("Character Count: "+charCount);

        }catch(IOException e){
        	e.printStackTrace();
        }
	}
}