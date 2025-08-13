//3. Write a program which generates 30 terms of Fibonacci no in an array and then prints it.

public class Q3{
    public static void main(String[] args){
        int arr[] = new int[50];
        arr[0] = 0;
        arr[1] = 1;
        for(int i=2;i<30;i++){
            arr[i] = arr[i-2]+arr[i-1];
        }
        System.out.println("Fibonacci Series: ");
        for(int i=0;i<29;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
