/* 3. Given a string s, reverse only all the vowels in the string and return it.
‌
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
‌
Example 1:
Input: s = "hello"
Output: "holle"
‌
Example 2:
Input: s = "leetcode"
Output: "leotcede"
‌
Constraints:
1 <= s.length <= 3 * 10^5
s consist of printable ASCII characters.*/


import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder(str);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' || str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U' ){
                  sb.append(str.charAt(i));
            }
        }
        int j = sb.length()-1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' || str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U' ){
                  sb1.setCharAt(i,sb.charAt(j));
                  j--;
            }
        }
        System.out.print(sb1);
       
    }
}
