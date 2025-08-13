//5. Design a class named`BankAccount that uses the concept of encapsulation. The class should have the following private data members: account number, account holder name, and balance. Provide public getter and setter methods to access and modify these fields. Also, include a method to deposit and withdraw amount ensuring that the balance cannot go negative.

class BankAccount{
	private int accountNumber;
	private String accountHolderName;
	private double balance;

	void setAccountNumber(int accountNumber){
		this.accountNumber = accountNumber;
	}

	int getAccountNumber(){
		return accountNumber;
	}

	void setAccountHolderName(String accountHolderName){
		this.accountHolderName = accountHolderName;
	}

	String getAccountHolderName(){
		return accountHolderName;
	}

	void setBalance(double balance){
		this.balance = balance;
	}

	double getBalance(){
		return balance;
	}

	void deposit(double amount){
		balance = amount + balance;
		System.out.println("After deposit: "+amount);
		System.out.println("New Balance: "+balance);
	}

	void withdraw(double amount){
		if(amount<0 || amount>balance){
			System.out.println("Insufficient Balance");
		}
		else{
			balance = balance - amount;
			System.out.println("Your balance: "+balance);
		}

	}

	void display(){
		System.out.println("Account Number: "+getAccountNumber());
		System.out.println("Account Holder Name: "+getAccountHolderName());
		System.out.println("Balance: "+getBalance());
	}
}

public class Q5{
	public static void main(String[] args){
		BankAccount acc = new BankAccount();
		acc.setAccountNumber(1235643);
		acc.setAccountHolderName("Raja");
		acc.setBalance(3045.73);
		acc.display();
		acc.deposit(1000);
		acc.withdraw(500);

	}
}