/*2. Create a Java application that demonstrates the use of user-defined packages by organising classes based on their functionality:
--- arithmetic: This package should include a class that defines methods to perform the following operations on two numbers:
a. Addition
b. Subtraction
c. Multiplication
d. Division
e. Modulo
--- stringutils: This package should include a class that defines methods for:
a. Concatenating two strings
b. Reversing a string
c. Finding the length of a string
In your main class (outside those packages), import the above packages and demonstrate the usage of all the methods.*/

import arithmetic.MathOperations;
import stringutils.StringOperations;
import java.util.Scanner;

public class Q2{
	public static void main(String[] args){
		MathOperations obj1 = new MathOperations();
		StringOperations obj2 = new StringOperations();
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while(flag){
			System.out.println("Menu List");
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.Modulo");
			System.out.println("6.Concatenation of Strings");
			System.out.println("7.Reverse of a String");
			System.out.println("8.Length of a String");
			System.out.print("Enter your choice: ");
			int ch = sc.nextInt();
			sc.nextLine();
			int a=0,b=0;
			String str="";
			if(ch<=5 && ch>=1){
				System.out.print("Enter a number: ");
				a = sc.nextInt();
				System.out.print("Enter another number: ");
				 b = sc.nextInt();
				 sc.nextLine();
			}
			else{

				System.out.print("Enter a String: ");
				 str = sc.nextLine();
			}
			switch(ch){
				
				case 1: System.out.println("Addition: "+obj1.add(a,b));
						break;
				case 2: System.out.println("Subtraction: "+obj1.sub(a,b));
						break;
				case 3: System.out.println("Multiplication:"+obj1.multiply(a,b));
						break;
				case 4: System.out.println("Division: "+obj1.divide(a,b));
						break;
				case 5: System.out.println("Modulus: "+obj1.modulo(a,b));
						break;

				case 6: System.out.print("Enter another String: ");
						String str1 =sc.nextLine();
						System.out.println("Concatenation of 2 strings: "+obj2.concate(str,str1));
						break;
				case 7: System.out.println("Reverse of a string: "+obj2.reverse(str));
						break;
				case 8: System.out.println("Length of a string: "+obj2.length(str));
						break;
				default: System.out.println("Invalid Choice!");
						 flag = false;
						 break;


			}
			System.out.println("-------------------------------------------------------");

		}
		
	}
}
