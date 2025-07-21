import java.util.Scanner;
public class Q2 {
    public static void charToColumn(StringBuilder sb){
        int count=0;
        double result = 0;
        for(int i=sb.length()-1;i>=0;i--){
            result = result+( (1+(sb.charAt(i)-'A')) *Math.pow(26,count));
            count++;
        }
        System.out.print(result);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the column number: ");
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while(n>0){
            n--;
            char ch = (char)('A' + n%26);
            sb.insert(0,ch);
            n = n/26;
        }
        System.out.println(sb);
        charToColumn(sb);
    }
}
