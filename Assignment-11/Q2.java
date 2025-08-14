/* 2. Write a Menu driven Java program a) to read content from the user and write it into another file and 
b) from the file to another file c) to modify the content of a file d) to search for a particular word in a file and 
display how many times it appears e) read the content(List of Electronic Products) of a .txt file and copy them to the .csv file.*/

import java.util.Scanner;
import java.io.*;
public class Q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("""
 							-------------------------Menu-----------------------
 							1. Read Content from user and write in another file
 							2. From one file to another file
 							3. Modify the content of a file
 							4. Search for a particular word and how many times it appears
 							5. Read the content list of a.txtfile and copy them to the csv.file 
 							Enter the operation you need to perform: """
        );
        int option = sc.nextInt();
        sc.nextLine();
        switch(option){
            case 1: readContent(sc);
                break;
            case 2: transfer();
            		System.out.println("Another file created with same content ");
                	break;
//            case 3: modify();
//                break;
//            case 4: search();
//                break;
//            case 5: change();
//                break;
        }

    }

    public static void readContent(Scanner sc){
       
        try{
            File file = new File("Q2.txt");
            file.createNewFile();
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            System.out.println("Enter the content you need to write: ");
            String sentence = sc.nextLine();
            bw.write(sentence);
            bw.close();
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine())!=null){
                System.out.println(line);

            }
            br.close();

        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void transfer() {

        try{
            File file2 = new File("File.txt");
            file2.createNewFile();
            FileWriter fw = new FileWriter(file2);
            BufferedWriter bw = new BufferedWriter(fw);
            FileReader fr = new FileReader(new File("Q2.txt"));
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line=br.readLine())!=null){
                bw.write(line);
                bw.newLine();
            }
            bw.close();
            br.close();
        }catch(Exception e){
            e.printStackTrace();
        }


    }



}


