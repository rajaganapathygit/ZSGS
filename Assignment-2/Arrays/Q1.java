//1. Write a program that creates an integer array of 10 elements, accepts values of arrays and Find the sum of all odd numbers.

import java.util.Scanner;

public class Q1 {
    public static int sumOdd(int nums[]){
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                sum = sum + nums[i];
            }
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.print("Enter the 10 array elements: ");
        for(int i=0;i<10;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Odd Sum: "+sumOdd(arr));
    }
}
