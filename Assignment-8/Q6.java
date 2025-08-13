//6. Develop a Java program to illustrate pass-by-value.

import java.util.Scanner;

public class Q6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a = sc.nextInt();
		System.out.print("Enter another number: ");
		int b = sc.nextInt();
		System.out.println("After adding 5 to a: "+change(a));
		System.out.println("a: "+a);
		System.out.println("After adding 5 to b: "+change(b));
		System.out.println("b: "+b);
	}

	public static int change(int x){
		int y = x+5;
		return y;
	}
}