import java.util.Scanner;
public class Q1 {
    public static int binaryToInt(String a){
        double result = 0,count=0;
        for(int i=a.length()-1;i>=0;i--){
            if(a.charAt(i)=='1'){
                result = result+Math.pow(2,count);
            }
            count++;
        }
        return (int)result;
    }
    public static String intToBinary(int a){
        StringBuilder result = new StringBuilder();
        while(a>0){
            result.append(a%2);
            a = a/2;
        }
        return result.reverse().toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        String a = sc.nextLine();
        System.out.print("Enter b value: ");
        String b = sc.nextLine();
        int aValue = binaryToInt(a);
        int bValue = binaryToInt(b);
        int sum = aValue+bValue;
        System.out.println(intToBinary(sum));

    }
}
