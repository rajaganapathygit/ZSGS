import java.util.Scanner;
public class Q7 {
    public static void calculateGrade(int m){
        if(m>=80 && m<85){
            m = m-5;
        }
        if(m>=85){
            m = m+5;
        }
        int n = m/10;
        switch(n){
            case 10:
            case 9: System.out.print("Grade: A");
                    break;
            case 7: System.out.print("Grade: B");
                    break;
            case 6:
            case 5: System.out.print("Grade: C");
                    break;
            default: System.out.print("Fail");
                     break;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the percentage: ");
        int n = sc.nextInt();
        if(n>=85 && n<=100){
            System.out.println("Grade: A");
        }
        else if(n>=70){
            System.out.println("Grade: B");
        }
        else if(n>=50){
            System.out.println("Grade: C");
        }
        else{
            System.out.println("Fail");
        }
        calculateGrade(n);
    }
}
