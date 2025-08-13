/* 10. Write a Java program to manage a voting system where a person must be at least 18 
years old to be eligible to vote. Use a custom exception to handle the scenario 
when an ineligible person tries to register for voting. Display appropriate messages for eligible 
and ineligible voters. */

import java.util.Scanner;
import java.io.*;

class EligibleException extends Exception{
	int age;

	EligibleException(String message){
		super(message);
	}
	EligibleException(int age){
		this.age = age;
	}

	public String check() throws Exception{
		if(age<18){
			throw new EligibleException("Not eligible to vote");
		}else{
			return "Eligible to vote";
		}

	}
}

public class Q10{
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		try{
			EligibleException obj = new EligibleException(age);
			System.out.println(obj.check());

		}catch(EligibleException e){
			System.out.println("Exception: "+e.getMessage());
		}finally{
			System.out.println("Executed Successfully");
		}
		
	}
}