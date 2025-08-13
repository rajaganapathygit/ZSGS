/* 4. Write a method to parse a string to an integer. Throw an exception 
if the string is not a valid number. Handle it using try-catch. */

import java.util.*;

public class Q4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		String num = sc.nextLine();
		try{
			toInt(num);
			System.out.println("String has a valid number");
		}catch(NumberFormatException e){
			System.out.println("Number Format Exception: "+e.getMessage());
		}
	}

	public static  int toInt(String num){
		return Integer.parseInt(num);
	}
}