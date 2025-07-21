import java.util.Scanner;
public class Q4b {
    public static int factorial(int n){
        if(n<=1) return 1;
        return n*factorial(n-1);
    }
    public static void p1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = sc.nextInt();
        int i=0;
        do{
            int j=0;
            int k=0;
                do{
                    System.out.print(" ");
                    k++;
                }while(k<=n-i-1);
            do{
                System.out.print(factorial(i)/(factorial(i-j)*factorial(j))+" ");
                j++;
            }while(j<=i);
            System.out.println();
            i++;
        }while(i<n);
    }
    public static void main(String[] args){
        String str = "ZOHOCORPORATIONS";
        int i=0,a=0;
        do{
            int j=0;
            do{
                System.out.print(str.charAt(a)+" ");
                j++;
                a++;
            }while(j<4);
            i++;
            System.out.println();
        }while(i<4);
        p1();
    }
}
