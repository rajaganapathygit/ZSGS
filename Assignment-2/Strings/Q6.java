import java.util.Scanner;
public class Q6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num1: ");
		String num1 = sc.nextLine();
		System.out.print("Enter num2: ");
		String num2 = sc.nextLine();
		int i=num1.length()-1,j=num2.length()-1;
		int carry = 0;
		StringBuilder result = new StringBuilder();
		while(i>=0 || j>=0 || carry>0){
			
			int a = i>=0?num1.charAt(i)-'0':0;
			int b = j>=0?num2.charAt(j)-'0' :0;
			
			System.out.println(result.append((a+b+ carry)%10));
			carry = (a+b+carry)/10;
			i--;
			j--;
		}
		System.out.println(result.reverse().toString());
	}
}