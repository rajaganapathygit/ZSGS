import java.util.Scanner;
public class Q2{
	public static void p2(int n){
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i==j || i+j==n-1){
					System.out.print("1 ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		for(int i=0;i<5;i++){
			for(int j=0;j<4;j++){
				if(i==0 || j==0 || i==2 || (j==3 && i!=3) || (i==3 && j==2)){
					System.out.print("R ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		p2(n);
	}
}