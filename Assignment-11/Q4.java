/* 4. Write a Java program to append a text read from the user to an existing file without overwriting the original content. */
import java.io.*;
import java.util.Scanner;

public class Q4{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
		try{
			
			FileWriter file1 = new FileWriter("Q1.txt",true);
			BufferedWriter bw = new BufferedWriter(file1);
			String sentence = sc.nextLine();
			bw.append(sentence);
			bw.close();
			FileReader file = new FileReader("Q1.txt");
			BufferedReader br = new BufferedReader(file);
			String line;
			while((line = br.readLine())!=null){
				System.out.print(line);
				System.out.println();
			}
			br.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		

	}
}