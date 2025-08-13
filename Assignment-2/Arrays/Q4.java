//4. Design a function void print( ) with a single dimensional array x[ ] and n (as size of the array) as function arguments. The function calculates sum of only single digit and sum of only double digit elements from the array. Design a main() function to input size of the array ‘len' and single dimensional array of size 'len', and print the required result by invoking the function print( ).


import java.util.Scanner;

public class Q4 {
    public static int digitCount(int n){
        int count=0;
        while(n>0){
            n = n/10;
            count++;
        }
        return count;
    }
    public static void print(int nums[],int m){
        int sum = 0;
        for(int i=0;i<m;i++){
            if(digitCount(nums[i])<=2){
                sum = sum+nums[i];
            }
        }
        System.out.print("Sum: "+sum);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the 10 array elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        print(arr,n);
    }
}
