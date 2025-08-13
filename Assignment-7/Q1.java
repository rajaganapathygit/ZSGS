/* 1. All the banks operating in India are controlled by RBI. RBI has set a well defined guideline (e.g. minimum interest rate, minimum balance allowed, maximum withdrawal limit etc) which all banks must follow. For example, suppose RBI has set minimum interest rate applicable to a saving bank account to be 4% annually; however, banks are free to use 4% interest rate or to set any rates above it.
Write a program to implement bank functionality in the above scenario. Note: Create few classes namely Customer, Account, RBI (Base Class) and few derived classes (SBI, ICICI, PNB etc). Assume and implement required member variables and methods in each class.
Hint:
class Customer
{
//Personal Details ...
// Few functions ...
}
class Account
{
// Account Detail ...
// Few functions ...
}
abstract class RBI
{
Customer c; //hasA relationship
Account a; //hasA relationship
..
public abstract double getInterestRate();
public abstract double getWithdrawalLimit();
}
class SBI extends RBI
{
//Use RBI functionality or define own functionality.
}
class ICICI extends RBI
{
//Use RBI functionality or define own functionality.
} */

import java.util.Scanner;

class Account{
	
	String accountHolderName;
	String accountNumber;
	String accountType;
	double balance;

	Account(String accountHolderName,String accountNumber, String accountType, double balance){
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.balance = balance;
	}

	public String toString(){
		return "\n-------Account Details--------\nAccount Holder Name: "+accountHolderName+"\nAccount Number: "+accountNumber+"\nAccount Type: "+accountType+"\nBalance: "+balance;
	}

}

class Customer{
	
	String name;
	String phoneno;
	int age;
	String mailId;

	Customer(String name,String phoneno, int age, String mailId){
		this.name = name;
		this.phoneno = phoneno;
		this.age = age;
		this.mailId = mailId;
	}

	public String toString(){
		return "\n--------Customer Details------\nName: "+name+"\nPhone Number: "+phoneno+"\nAge: "+age+"\nMail Id: "+mailId;
	}
}

abstract class RBI{
	Customer cus;
	Account acc;

	RBI(Customer cus, Account acc){
		this.cus = cus;
		this.acc = acc;	
	}

	public abstract double getInterestRate();
	public abstract double getWithdrawalLimit();

	public void display(){
		System.out.println(cus.toString());
		System.out.println(acc);
	}


}

class SBI extends RBI{
	
	double interest = 5.75;

	SBI(Customer cus,Account acc){
		super(cus,acc);
	}
	
	public double getInterestRate(){
		return ( acc.balance*(interest/100));
	}

	public double getWithdrawalLimit(){
		return 5000;
	}
}

class ICICI extends RBI{
	
	double interest = 5;

	ICICI(Customer cus,Account acc){
		super(cus,acc);
	}

	public double getInterestRate(){
		return acc.balance*(interest/100);
	}

	public double getWithdrawalLimit(){
		return 3000;
	}

}

class PNB extends RBI{

	PNB(Customer cus,Account acc){
		super(cus,acc);
	}

	double interest = 4;

	public double getInterestRate(){
		return acc.balance*(interest/100);
	}

	public double getWithdrawalLimit(){
		return 2000;
	}

}

public class Q1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Which bank you have the account? \n1. SBI\n2. ICICI\n3. PNB\n");
		int n = sc.nextInt();
		Customer cus = new Customer("Raja","7689878987",21,"raja@gmail.com");
		Account acc = new Account("Rajaganapathy","65789870","Savings",2200);
		RBI bank;
		switch(n){
			case 1: bank = new SBI(cus,acc);
					break;
			case 2: bank = new ICICI(cus,acc);
					break;
			case 3: bank = new PNB(cus,acc);
					break;
			default: System.out.println("Invalid bank");
					 return;
		}

		bank.display();
		System.out.println("Interest: "+bank.getInterestRate());
		System.out.println("Withdrawal Limit: "+bank.getWithdrawalLimit());

	}
}