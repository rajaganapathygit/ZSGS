//7. Write a program to input and store the weight of ten people. Sort and display them in descending order using the Selection sort technique.

import java.util.Scanner;

public class Q7 {
    public static int[] selectionSort(int nums[]){
        for(int i=0;i<nums.length-1;i++){
            int max_index = i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]>nums[max_index]){
                    max_index = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[max_index];
            nums[max_index] = temp;
        }
       return nums;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the weight of 10 people: ");
        int arr[] = new int[10];
        for(int i=0;i<10;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Before Sorting: ");
        for(int i=0;i<10;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("After Sorting: ");  
        selectionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
