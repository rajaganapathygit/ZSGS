import java.util.Scanner;
public class Q5{
    public static int sum(int m){
        int sum = 0;
        for(int i=1;i<=m;i++){
            if(i%2!=0){
                continue;
            }
            else{
                sum = sum+i;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n value: ");
        int n = sc.nextInt();
        System.out.print("Sum:"+sum(n));
    }
}