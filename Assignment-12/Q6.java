/* 6. Use Threads to implement the ATM machine, where create thread to check the PIN number, 
another thread to perform the cash withdrawal, another one to check the balance amount and 
print the receipt. */

import java.util.Scanner;
class ATM{
	private String secret = "1234";
	private boolean flag = false;
	private int balance = 20000;
	Scanner sc = new Scanner(System.in);

	public void checkPin(String password){
		if(secret.equals(password)){
			flag = true;
		}
	}

	public void withdrawCash(){
		if(flag){
			try{
				System.out.print("Enter the amount to withdraw: ");
				int amount = sc.nextInt();
				Thread.sleep(2000);
				if(amount>balance){
					System.out.println("Insufficient Balance");
					Thread.sleep(2000);
				}
				else{
					balance = balance - amount;
					System.out.println("Amount Withdrawn Successfully");
				}
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		else{
			System.out.println("Incorrect PIN");	
		}
	}

	public void display(){
		if(flag){
			System.out.println("Balance: "+balance);
		}
		
	}
}
class PIN_Number extends Thread{
	ATM acc;
	Scanner sc = new Scanner(System.in);

	PIN_Number(ATM acc){
		this.acc = acc;
	}
	public void run(){
		System.out.print("Enter the PIN: ");
		try{
			String password = sc.nextLine();
			Thread.sleep(2000);
			acc.checkPin(password);
		}catch(Exception e){
			e.printStackTrace();
		}
		

		

	}
	
}

class CashWithdraw extends Thread{
	ATM acc;

	CashWithdraw(ATM acc){
		this.acc = acc;
	}
	public void run(){
		acc.withdrawCash();
	}
}

class Balance extends Thread{
	ATM acc;

	Balance(ATM acc){
		this.acc = acc;
	}
	public void run(){
		acc.display();
	}
}

public class Q6{
	public static void main(String[] args){
		ATM account = new ATM();
		PIN_Number pin = new PIN_Number(account);
		CashWithdraw cash = new CashWithdraw(account);
		Balance bal = new Balance(account);

		pin.start();
		try{
			pin.join();
		}catch(Exception e){
			e.printStackTrace();
		}
		cash.start();
		try{
			cash.join();
		}catch(Exception e){
			e.printStackTrace();
		}
		bal.start();
	}
}




