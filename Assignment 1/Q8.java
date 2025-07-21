import java.util.Scanner;
public class Q8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int n = sc.nextInt();
        int pos = 0;
        while(n>0){
             pos++;
             if(n%2==1){
                System.out.print(pos);
                break;
             }  
            n=n/2;
        }

    }
}
