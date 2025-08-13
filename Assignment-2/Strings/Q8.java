/*8. We define the usage of capitals in a word to be right when one of the following cases holds:
1. All letters in this word are capitals, like "USA".
2. All letters in this word are not capitals, like "leetcode".
3. Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.
Example 1:
Input: word = "USA"
Output: true
‌
Example 2:
Input: word = "FlaG"
Output: false
‌
Constraints:
1 <= word.length <= 100
word consists of lowercase and uppercase English letters.*/

import java.util.Scanner;
public class Q8{
	public static boolean isAllCaps(String word){
		for(int i=0;i<word.length();i++){
			if(word.charAt(i)-'A' > 25){
				System.out.println(" Not All Caps");
				return false;
			}
		}
		System.out.println("All Caps");
		return true;

	}

	public static boolean isAllSmall(String word){
		for(int i=0;i<word.length();i++){
			if(word.charAt(i)-'a' > 25 || word.charAt(i)-'a'<0){
				System.out.println(word.charAt(i)-'a' );
				System.out.println(" Not All Small");
				return false;
			}
		}
		System.out.println("All Small");
		return true;
	}

	public static boolean isFirstCaps(String word){
		boolean flag1 = false;
		boolean flag2 = false;
		for(int i=0;i<word.length();i++){
			if( (i==0 && word.charAt(i)-'A' < 26) ){
				 flag1= true;
			}
			else if(i>0 && (word.charAt(i)-'a' < 26 && word.charAt(i)-'a' >= 0 )){
				flag2 = true;
			}
			else{
				flag2 = false;
				break;
			}
		}
		if(flag1 && flag2){
			System.out.println("First Caps");
			return true;
		}
		return false;
	}


	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = sc.nextLine();
		if(isAllCaps(str) || isAllSmall(str) || isFirstCaps(str) ){
			System.out.println("True");
		}
		else{
			System.out.println("False");
		}
	}
}