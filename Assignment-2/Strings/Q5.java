import java.util.Scanner;
public class Q5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the main string: ");
		String str = sc.nextLine();
		System.out.print("Enter the sub string: ");
		String sub = sc.nextLine();
		int j=0;
		for(int i=0;i<str.length();i++){
			if(j<sub.length() && sub.charAt(j)==str.charAt(i) ){
				j++;
			}
		}
		if(j==sub.length()){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}

	}
}