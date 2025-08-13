/* 10. Write a menu driven program to do following operation on two dimensional array A of size m x n. You should use user-defined methods which accept 2-D array A, and its size m and n as arguments. The options are:
● To input elements into matrix of size m x n
● To display elements of matrix of size m x n
● Sum of all elements of matrix of size m x n
● To display row-wise sum of matrix of size m x n
● To display column-wise sum of matrix of size m x n
● To create transpose of matrix of size n x m*/

import java.util.Scanner;
public class Q10 {
        public static int[][] insert(int[][]arr,int m,int n){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the array elements: ");
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            return arr;
        }
        public static void display(int[][]array,int m,int n){
            System.out.println("2-Dimensional Array: ");
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    System.out.print(array[i][j]+" ");
                }
                System.out.println();
            }
        }
        public static void calculateTotalSum(int[][]array, int m,int n){
            int sum = 0;
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    sum = sum + array[i][j];
                }
            }
            System.out.println("Total Sum: "+sum);
        }
        public static void calculateRowSum(int [][]array,int m,int n){
            for(int i=0;i<n;i++){
                int sum = 0;
                for(int j=0;j<m;j++){
                    sum = sum+array[i][j];
                }
                System.out.println("Row "+(i+1)+" Sum: "+sum);
            }
        }
        public static void calculateColumnSum(int[][] array, int m,int n){
            for(int i=0;i<m;i++){
                int sum = 0;
                for(int j=0;j<n;j++){
                    sum = sum+array[j][i];
                }
                System.out.println("Column "+(i+1)+" Sum: "+sum);
            }
        }
        public static void getTranspose( int[][] array,int m,int n){
            for(int i=0;i<m;i++){
                for(int j=0;j<i;j++){
                   int temp = array[i][j];
                   array[i][j] = array[j][i];
                   array[j][i] = temp;
                }
            }
           for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    System.out.print(array[i][j]+" ");
                }
                System.out.println();
            }
        }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("Enter the row size: ");
        int m = sc.nextInt();
        System.out.println("Enter the column size: ");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
    do{
        System.out.println("\n Options: ");
        System.out.println("1. Input elements ");
        System.out.println("2. Display elements ");
        System.out.println("3. Total Sum ");
        System.out.println("4. Row Sum ");
        System.out.println("5. Column Sum ");
        System.out.println("6. Transpose ");
        System.out.println("7. Exit ");
        
        
        System.out.println("Enter your choice: ");
         choice = sc.nextInt();
        
        

        switch(choice){
            case 1: insert(arr,m,n);
                    break;
            case 2: display(arr,m,n);
                    break;
            case 3: calculateTotalSum(arr,m,n);
                    break;
            case 4: calculateRowSum(arr,m,n);
                    break;
            case 5: calculateColumnSum(arr,m,n);
                    break;
            case 6: getTranspose(arr,m,n);
                    break;
            case 7: System.out.print("You have exited");
                    break;
            default: System.out.print("Invalid Choice");
                     break;
        }
        System.out.println("_______________________________");
    }while(choice!=7);
 }
}
