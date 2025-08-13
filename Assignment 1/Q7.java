//Write a program to check if a number is a power of 2?
import java.util.Scanner;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args){
        //Power of 2
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean flag = true;
        for(int i=0;Math.pow(2,i)<=n;i++){
            if(Math.pow(2,i)==n){
                flag = false;
                System.out.print("This number is a power of 2");
                break;
            }
        }
        if(flag){
            System.out.print("This number is not a power of 2");
        }
    }
}
