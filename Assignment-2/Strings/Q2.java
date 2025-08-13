/* 2. Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
‌
For example:
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28
...
‌
Example 1:
Input: columnNumber = 1
Output: "A"
‌
Example 2:
Input: columnNumber = 28
Output: "AB"
‌
Example 3:
Input: columnNumber = 701
Output: "ZY"
‌
Constraints:
1 <= columnNumber <= 2^31 - 1*/


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
