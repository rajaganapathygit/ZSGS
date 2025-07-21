import java.util.Scanner;
public class Q4 {
    public static void main(String[] args){
        //Both numbers are equal or not without using comparison operator
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int a = sc.nextInt();
        System.out.print("Enter b value: ");
        int b = sc.nextInt();
        int result = a^b;
        if(result==0){
            System.out.print("Both numbers are equal");
        }
        else{
            System.out.print("Both are not equal");
        }
    }
}
