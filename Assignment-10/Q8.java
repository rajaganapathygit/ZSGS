/* 8. Develop a Java program to manage a list of bank accounts using ArrayList.
--->Create an Account class with the following attributes:
a. accountNumber (int)
b. holderName (String)
c. balance (double)
--->Use autoboxing to store the balance and interest as Double wrapper objects.
--->Use manual boxing to convert a primitive interest rate into a Double object.
--->Unbox the values (both automatic and manual) to calculate and update the new balance.
--->Add at least three Account objects to an ArrayList<Account>.
--->For each account:
a. Display the holder name, account number, original balance
b. Apply 5% interest
c. Show the new balance using primitive values (unboxed). */

import java.util.ArrayList;

class Account{
	int accountNumber;
	String holderName;
	double balance;

	Account(int accountNumber,String holderName, double balance){
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
	}

	void display(){
		System.out.println("------------------------");
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Holder Name: "+holderName);
		System.out.println("Balance: "+balance);

	}

	
	void calculate(Double interest){
		double primitive_interest = interest.doubleValue(); //Manual unboxing 
		double result = balance + ((primitive_interest/100)*balance);
		System.out.println("New balance: "+result);
		System.out.println("------------------------");
	}
}

public class Q8{
	public static void main(String[] args){
		ArrayList<Account> obj = new ArrayList<>();
		obj.add(new Account(1234,"Raja",2000));
		obj.add(new Account(3456,"Pugal",5000));
		obj.add(new Account(879,"Raghul",3000));

		Double interest = Double.valueOf(5);//Manual boxing  

		for(Account acc: obj){
			acc.display();
			acc.calculate(interest);
		}

	}
}