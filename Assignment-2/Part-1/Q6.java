//6. Define a method to convert the decimal number to a binary number?

import java.util.Scanner;

import java.util.Scanner;

public class Q6 {
    public static String binary(int m){
        StringBuilder sb = new StringBuilder();
        while(m>0){
            sb.append(m%2);
            m=m/2;
        }
    
        return sb.reverse().toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        String str = binary(n);
        System.out.print(str);
    }
}
