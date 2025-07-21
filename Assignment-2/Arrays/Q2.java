import java.util.Scanner;
public class Q2 {
    public static boolean isPrime(int n){
        if(n==1) return false;
        if(n<4 && n>1) return true;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.print("Enter 10 elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(isPrime(arr[i])){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
