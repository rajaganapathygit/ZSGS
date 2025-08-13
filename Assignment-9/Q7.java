/* 7. Write a Java program that shows exception propagation across multiple methods
(method1 calls method2 calls method3, which throws the exception). Handle the exception in method1. */

import java.util.Scanner;


public class Q7{
	public static void main(String[] args){
	
		try{
			System.out.println("Result: "+divide());
		}catch(Exception e){
			System.out.println("Exception: "+e.getMessage());
		}

	}

	public static int divide() throws Exception{
		Scanner sc = new Scanner(System.in);
		int result=0;
		try{
			 System.out.println("Input: "+number());
			 System.out.print("Enter a numerator: ");
		int num = sc.nextInt();
		System.out.print("Enter a denominator: ");
		int denom = sc.nextInt();
			 result = num/denom;
		}catch(Exception e){
			System.out.println("Exception: "+e.getMessage());
		}finally{
			return result;
		}
	}

	public static int number(){
		Scanner sc = new Scanner(System.in);
		int n=0;
		System.out.print("Enter a number: ");
		try{
			 n = sc.nextInt();
		}catch(Exception e){
			System.out.println("Number method Exception: "+e.getMessage());
		}
		return n;

	}
}