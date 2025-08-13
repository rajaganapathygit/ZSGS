//8. Write a program which takes in 10 people’s age and gives number of people who are <18, 18-60, >60.

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.print("Enter the ages of 10 people: ");
        for(int i=0;i<10;i++){
            arr[i] = sc.nextInt();
        }
        int lessThan18 = 0;
        int between18To60 = 0;
        int greaterThan60 = 0;
        for(int i=0;i<10;i++){
            if(arr[i]<18){
                lessThan18++;
            }
            else if(arr[i]>=18 && arr[i]<60){
                between18To60++;
            }
            else{
                greaterThan60++;
            }
        }
        System.out.println("Number of people who are less than 18 years of age: "+lessThan18);
        System.out.println("Number of people who are between 18 to 60 years of age: "+between18To60);
        System.out.println("Number of people who are greater than 60 years of age: "+greaterThan60);
    }
}
