import java.util.Scanner;
public class Q7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Sentence: ");
		String str = sc.nextLine();
		int count = 1;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==' '){
				count++;
			}
		}
		System.out.println("Number of Segments: "+count);
	}
}