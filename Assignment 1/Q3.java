import java.util.Scanner;
public class Q3 {
    public static void main(String[] args){
        //Maximum of 2 value
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int a = sc.nextInt();
        System.out.print("Enter b value: ");
        int b = sc.nextInt();
        int result = (a>b)?a:b;
        System.out.print(result+" is maximum");
    }
}
