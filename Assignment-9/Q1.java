/* 1. int[] arr = {2, 5, 1, 4, 0, 7};
int quotient = arr[7] / arr[4];
Develop a Java program which handles any unexpected situations that may arise during execution. */

import java.util.Scanner;

public class Q1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the array size: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array elements: ");
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}

		try{
			System.out.print("Enter the ith value for numerator: ");
			int num = sc.nextInt();
			System.out.print("Enter the jth value for denominator: ");
			int denom = sc.nextInt();
			int quotient = arr[num] / arr[denom];
		}catch(ArithmeticException e){
			System.out.println("Exception: "+e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Exception: "+e.getMessage());
		}catch(Exception e){
			System.out.println("Exception: "+e.getMessage());
		}finally{
			System.out.println("Finally: Problem works fine");
		}
	}
}