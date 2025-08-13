//9. Write an array which takes in roll no and marks in 3 subjects for 10 students. Format and Print the roll no, total marks and average for all students in a table form.

import java.util.Scanner;
public class Q9{
    public static void calculateTotal(int roll_no[], int marks1[],int marks2[], int marks3[]){
        int sum[]= new int[3];
        double avg[] = new double[3];
        for(int i=0;i<3;i++){
            sum[i] = marks1[i]+marks2[i]+marks3[i];
            avg[i] = sum[i]/3;
        }
        System.out.println("_____________________________________________");
        System.out.println("Roll NO | Total | Average |");
        System.out.println("_____________________________________________");
        for(int i=0;i<3;i++){
          System.out.printf("%-8d| %-7d| %-8.2f|\n",roll_no[i],sum[i],avg[i]);
        }
        System.out.println("_____________________________________________");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int roll_no[] = new int[3];
        int mark1[] = new int[3];
        int mark2[] = new int[3];
        int mark3[] = new int[3];
        System.out.println("Enter the student details: ");
        for(int i=0;i<3;i++){
            System.out.print("Enter the roll no for Student-"+(i+1)+": ");
            roll_no[i] = sc.nextInt();
            System.out.print("Enter the marks for Subject 1: ");
            mark1[i] = sc.nextInt();
            System.out.print("Enter the marks for Subject 2: ");
             mark2[i] = sc.nextInt();
            System.out.print("Enter the marks for Subject 3: ");
            mark3[i] = sc.nextInt();
        }
        calculateTotal(roll_no,mark1,mark2,mark3);
    
    }
}
