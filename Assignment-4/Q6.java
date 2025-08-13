/* 6. Design and implement a custom Java class named MyString that mimics the behavior of Java’s built-in String class. Your class should store character data internally (e.g., using a char[] or String as input) and should provide the following string methods,
1. int length() – Returns the number of characters.
2. char charAt(int index) – Returns the character at the specified index.
3. boolean equals(MyString other) – Checks if two MyString objects are equal.
4. MyString toUpperCase() – Returns a new string with all characters in uppercase.
5. MyString toLowerCase() – Returns a new string with all characters in lowercase.
6. MyString substring(int start, int end) – Returns a substring from start to end-1.
7. MyString concat(MyString other) – Concatenates another string to the current one.
8. boolean contains(MyString sub) – Checks if a substring exists.
9. int indexOf(char ch) – Returns the index of the first occurrence of the character.
10. MyString replace(char oldChar, char newChar) – Replaces all occurrences of a character.
* Implement proper constructors, including one that takes a char[] or String as input.
* Avoid using any built-in String methods to perform the operations internally.
* Write a main method to demonstrate the working of your MyString class.  */

import java.util.Scanner;

class MyString{
	String word;
	char[] letters;
	MyString(String word){
		this.word = word;
		this.letters = word.toCharArray();
	}
	 public String toString(){
	 	return new String(letters);
	 }
	int length(){
		return letters.length;
	}

	char charAt(int index){
		if(index>=0 && index<word.length()){
				return letters[index];
		}
		return '0';
	}

	boolean equals(String other){
		char[] input = other.toCharArray();
		if(input.length<letters.length) return false;
		for(int i=0;i<letters.length;i++){
			if(letters[i]!=input[i]){
					return false;
			}
		}
		return true;
	}

	MyString toUpperCase(){
		for(int i=0;i<letters.length;i++){
			if(letters[i]>='a' && letters[i]<='z'){
				letters[i] = (char) (letters[i]-32); 
			}
		}
		return new MyString(new String(letters));
	}

	MyString toLowerCase(){
		for(int i=0;i<letters.length;i++){
			if(letters[i]>='A' && letters[i]<='Z'){
				letters[i] = (char)(letters[i]+32);
			}
		}
		return new MyString(new String(letters));
	}

	MyString substring(int start,int end){
		String result ="";
		for(int i=start;i<end;i++){
			result =result+word.charAt(i);
		}
		return new MyString(result);
	}

	MyString concat(MyString other){
		return new MyString(word+other);
	}

	boolean contains(MyString sub){
		if(word.length()<sub.length()) return false;
		for(int i=0;i<word.length()-sub.length();i++){
			if(sub.substring(0,sub.length()).equals(word.substring(i,i+sub.length()))){
				return true;
			}
		}
		return false;
		
	}

	int indexOf(char ch){
		for(int i=0;i<word.length();i++){
			if(word.charAt(i)==ch){
				return i;
			}
		}
		return -1;
	}

	MyString replace(char oldChar, char newChar){
		for(int i = 0;i<letters.length;i++){
			if(letters[i]==oldChar){
				letters[i]=newChar;
			}
		}
		return new MyString(new String(letters));
	}
		
}
public class Q6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the input string: ");
		String input = sc.nextLine();
		MyString str = new MyString(input);
		System.out.println("Length of the String: "+str.length());
		System.out.print("Enter the index to Search: ");
		int index = sc.nextInt();
		sc.nextLine();
		System.out.println("Character at index "+index+" is: "+str.charAt(index));
		System.out.print("Enter the string to compare: ");
		String compare = sc.nextLine();
		System.out.println("String equals: "+str.equals(compare));
		System.out.println("UpperCase String: "+str.toUpperCase());
		System.out.println("LowerCase String: "+str.toLowerCase());
		System.out.print("Enter the start of the substring: ");
		int start = sc.nextInt();
		System.out.print("Enter the end of the substring: ");
		int end = sc.nextInt();
		sc.nextLine();
		System.out.println("Substring: "+str.substring(start,end));
		System.out.print("Enter the string to concat: ");
		String str1 = sc.nextLine();
		MyString str2 = new MyString(str1);
		System.out.println("Concatenated String: "+str.concat(str2));
		System.out.println("Enter the string to check whether it contains or not: ");
		String str3 = sc.nextLine();
		MyString str4 = new MyString(str3);
		System.out.println("Is Contains: "+str.contains(str4));
		System.out.print("Enter the character to find the index: ");
		char s = sc.next().charAt(0);
		System.out.println("Character found at index: "+str.indexOf(s));
		System.out.print("Enter the character to replace: ");
		char oldchar = sc.next().charAt(0);
		System.out.print("Enter the character which you have to place: ");
		char newchar = sc.next().charAt(0);
		System.out.println("Replaced word: "+str.replace(oldchar,newchar));

	}
}