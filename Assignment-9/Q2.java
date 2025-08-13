/* 2.Demonstrate multiple catch blocks: accept two numbers as strings,
 then convert them to integers, and perform division, and catch the following exceptions: 
 InputMismatchException, NumberFormatException, ArithmeticException and Exception. */

import java.util.*;

public class Q2{
	public static void main(String[] args) throws Exception{
		 Scanner sc = new Scanner(System.in);		 
		 try{
		 	System.out.print("Enter first number as a string: ");
		 	String num1 = sc.nextLine();
		 	System.out.print("Enter second number as a string: ");
		 	String num2 = sc.nextLine();
		 	Integer a = toInt(num1);
		 	Integer b = toInt(num2);
		 	int quotient = a/b;
		 }catch(InputMismatchException e){
		 	System.out.println("Input Mismatch Exception: "+e.getMessage());
		 }catch(NumberFormatException e){
		 	System.out.println("Number Format Exception: "+e.getMessage());
		 }catch(ArithmeticException e){
		 	System.out.println("Arithmetic Exception: "+e.getMessage());
		 }catch(Exception e){
		 	System.out.println("Exception: "+e.getMessage());
		 }finally{
		 	System.out.println("Finally: Problem works fine");
		 }
	}

	public static int toInt(String num){
		return Integer.parseInt(num);
	}
}