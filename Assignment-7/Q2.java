/* 2. Design a Payment Gateway System using an interface named PaymentMethod with a method pay(double amount). Implement this interface in different classes like CreditCardPayment, DebitCardPayment, and UPIPayment. Write a main class where you can accept payment using different methods. */

import java.util.Scanner;

interface PaymentMethod{
	double pay(double amount);
}

class CreditCardPayment implements PaymentMethod{
	public static final double OFFER = 45;

	public double pay(double amount){
		return amount - (amount*(OFFER/100));
	}

}

class DebitCardPayment implements PaymentMethod{
	 
	 public static final double OFFER = 25;

	 public double pay(double amount){
	 	return amount - (amount*(OFFER/100));
	 } 
}

class UPIPayment implements PaymentMethod{
	
	public static final double OFFER = 10;

	public double pay(double amount){
		return amount - (amount*(OFFER/100));
	}
}

public class Q2{
	public static void main(String[] args){

		System.out.println("""
		 Which Payment Gateway you wish to choose?\n 1. Credit Card\n 2. Debit Card\n 3. UPI 
			""");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		switch(ch){
			case 1: CreditCardPayment cd = new CreditCardPayment();
					System.out.println("You Paid: "+cd.pay(12000));
					break;
			case 2: DebitCardPayment db = new DebitCardPayment();
					System.out.println("You Paid: "+db.pay(12000));
					break;
			case 3: UPIPayment upi = new UPIPayment();
					System.out.println("You Paid: "+upi.pay(12000));
					break;
			default: System.out.println("You have choosed invalid gateway!");
					  break;
		}
		sc.close();
	}
}