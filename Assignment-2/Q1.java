import java.util.Scanner;
public class Q1 {
    // Minimum of 3 numbers
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int a = sc.nextInt();
        System.out.print("Enter b value: ");
        int b = sc.nextInt();
        System.out.print("Enter c value: ");
        int c = sc.nextInt();
        if(a<b || c<b){
            if(a<c){
                System.out.print(a+ " is minimum value");
            }
            else{
                System.out.print(c+ " is minimum value");
            }  
        }
        else{
            if(b<c){
                System.out.print(b+" is minimum value");
            }
            else{
                System.out.print(c+" is minimum value");
            }
        }
    }
}
