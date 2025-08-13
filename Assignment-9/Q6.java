/* 6. Write a Java program to accept a 4-digit ATM PIN from the user and validate whether it meets the following conditions:
--->It must be exactly 4 digits long.
--->It should contain only numeric characters.
--->It must not start with 0.
Display an appropriate message whether the PIN is valid or invalid. */

import java.util.*;

public class Q6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		try{
			System.out.print("Enter 4-digit ATM PIN: ");
			String pin = sc.nextLine();
			if(pin.length()<4 || pin.length()>4){
				throw new Exception("It must be exactly 4 digits long");
			}else if(!isLetters(pin)){
				throw new Exception("It should contain only numeric characters");
			}else if(pin.charAt(0)=='0'){
				throw new Exception("It must not start with 0");
			}
			else{
				System.out.println("PIN is valid");
			}
		}catch(Exception e){
			System.out.println("Exception: "+e.getMessage());
		}
	}

	public static boolean isLetters(String word){

		char[] letters = word.toCharArray();
		for(int i=0;i<word.length();i++){
			if(Character.isLetter(letters[i])){
				return false;
			}
		}
		return true;
	}
}