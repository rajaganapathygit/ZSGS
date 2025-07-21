import java.util.Scanner;
public class Q3 {
    public static void p1(int n){
          int i=0;
        while(i<(2*n)-1){
            int j=0;
            int end = (i<n)?i:((2*n)-i-2);
            while(j<=end){
                System.out.print("w ");
                j++;
            }
            i++;
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = sc.nextInt();
        int a=1,i=0;
        while(i<5){
            int j=0;
            int end = (i<3)?i:(5-i-1);
            int k=0;
            while(k<Math.abs(2-i)){
                System.out.print("  ");
                k++;
            }
            while(j<=end){
                System.out.print(a+"   ");
                j++;
                a++;
            }
            i++;
            System.out.println();
        }
        p1(n);
       
        }
    }    

