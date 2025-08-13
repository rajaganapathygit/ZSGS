/* 8. Design a login system that throws AuthenticationException 
if the username or password is incorrect. Handle it and display a login failure message. */

import java.util.Scanner;

class AuthenticationException extends Exception{
	
	String userName;
	String message;
	int password;

	AuthenticationException(String message){
		super(message);
	}
	AuthenticationException(String userName,int password){
		this.userName = userName;
		this.password = password;
	}

	public String display() throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your username: ");
		String user = sc.nextLine();
		System.out.print("Enter your password: ");
		int secret = sc.nextInt();
		if(!user.equals(userName) || secret!=password){
			throw new AuthenticationException("Incorrect username or password");
		}
		else{
			return " Login Successfully";
		}
	}

}

public class Q8{
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);

		try{
			System.out.print("Enter username: ");
			String userName = sc.nextLine();
			System.out.print("Enter password: ");
			int password = sc.nextInt();
			AuthenticationException obj = new AuthenticationException(userName,password);
			String result = obj.display();
			System.out.println(result);

		}catch(AuthenticationException e){
			System.out.println("Exception: "+e.getMessage());
		}
	}
}