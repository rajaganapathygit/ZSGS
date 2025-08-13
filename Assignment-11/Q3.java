/* 3. Write a Java program that reads a file and prints the number of lines, words, and characters. */

import java.io.*;

public class Q3{
	public static void main(String[] args){
		File file = new File("Q1 txt file");
		System.out.println(file.length());
	}
}