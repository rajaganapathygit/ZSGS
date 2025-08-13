/*6. Write a program to accept the year of graduation from school as an integer value from the users . Using the Binary search technique on the sorted array of integers given below . Output the message “record exists" if the value input is located in the array and if not output the message record does not exits”.
{1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010, 2016, 2002}*/

import java.util.Arrays;
import java.util.Scanner;
public class Q6 {
    public static boolean binary(int nums[],int low, int high,int target){
        int mid = (low+high)/2;
        if(low<=high){
            if(nums[mid]==target){
                return true;
            }
            else if(nums[mid]<target){
             return binary(nums,mid+1,high,target);
             }
             else{
                 return binary(nums,low,mid-1,target);
            }
        }
        return false;
    
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010, 2016, 2002};
        System.out.print("Enter the Graduation Year: ");
        int n = sc.nextInt();
        Arrays.sort(arr);
        if(binary(arr,0,arr.length-1,n)){
            System.out.println("Record Exists");
        }
        else{
            System.out.println("No Record Exists");
        }
    }    
}
