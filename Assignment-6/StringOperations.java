/*2. Create a Java application that demonstrates the use of user-defined packages by organising classes based on their functionality:
--- arithmetic: This package should include a class that defines methods to perform the following operations on two numbers:
a. Addition
b. Subtraction
c. Multiplication
d. Division
e. Modulo
--- stringutils: This package should include a class that defines methods for:
a. Concatenating two strings
b. Reversing a string
c. Finding the length of a string
In your main class (outside those packages), import the above packages and demonstrate the usage of all the methods.*/

package stringutils;

public class StringOperations{

	public String concate(String str1, String str2){
		return str1+str2;
	}

	public String reverse(String str){
		char letters[] = str.toCharArray();
		int i=0,j=letters.length-1;
		while(i<j){
			char temp = letters[i];
			letters[i] = letters[j];
			letters[j] = temp;
			i++;
			j--;
		}
		return new String(letters);
	}

	public int length(String str){
		char letters[] = str.toCharArray();
		return letters.length;
	}
}