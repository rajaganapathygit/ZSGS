/* 5. Write a program to initialize the following character arrays and print a suitable message after checking the arrays whether the two arrays are identical or not. Make suitable use of Boolean data type. X[] =('m', 'n', 'o', 'p'} and Y[] =('m', 'n', 'o', 'p' }
X[] =('m', 'n', 'o', 'p'} and
Y[] =('m', 'n', 'o', 'p' } */

import java.util.Scanner;
public class Q5 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array1: ");
		int m = sc.nextInt();
		char arr1[] = new char[m];
		System.out.print("Enter the array elements: ");
		for(int i=0;i<m;i++){
			arr1[i] = sc.next().charAt(0);
		}
		System.out.print("Enter the size of array2: ");
		int n = sc.nextInt();
		char arr2[] = new char[n];
		System.out.print("Enter the array elements: ");
		for(int i=0;i<n;i++){
			arr2[i] = sc.next().charAt(0);
		}
		boolean flag = true;
		for(int i=0;i<n;i++){
			if(arr1[i]!=arr2[i]){
				flag = false;
				break;
			}
		}
		if(flag){
			System.out.println("Two arrays are identical");
		}
		else{
			System.out.println("Two arrays are not identical");
		}


	}
}