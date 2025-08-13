/* 1. Write a Java program to read the contents of a text file and display it on the console. */

import java.io.*;
import java.util.Scanner;

public class Q1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		File file = new File("Q1 txt file");
		if(file.exists()){
			System.out.println("File exists.");
		}
		else{
			try{
				file.createNewFile();
			}catch(IOException e){
				e.printStackTrace();
			}
			
			System.out.println("File created successfully");
		}

		try{
			FileWriter fw = new FileWriter(file);
			// fw.write("Welcome to file handling");
			System.out.print("Enter the text to store in the file: ");
			String sentence = sc.nextLine();
			fw.write(sentence);
			fw.close();

			FileReader fr = new FileReader(file);
			int ch;
			while((ch = fr.read())!=-1){
				System.out.print((char)ch);
			}
			fr.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}