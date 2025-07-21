import java.util.Scanner;
public class Q4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter s String: ");
        String s = sc.nextLine();
        System.out.print("Enter t String: ");
        String t = sc.nextLine();
        for(int i=0;i<t.length();i++){
            boolean flag = false;
           for(int j=0;j<s.length();j++){
            if(t.charAt(i)==s.charAt(j)){
                flag = true;
                break;
            }
           }
           if(!flag){
            System.out.print(t.charAt(i));
            break;
           }
        }
    }
}
