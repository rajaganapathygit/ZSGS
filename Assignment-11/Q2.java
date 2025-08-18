/* 2. Write a Menu driven Java program a) to read content from the user and write it into another file and
b) from the file to another file c) to modify the content of a file d) to search for a particular word in a file and
display how many times it appears e) read the content(List of Electronic Products) of a .txt file and copy them to the
 .csv file.*/

import java.io.*;
import java.util.*;

public class Q2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.print("""
                -----------Menu------------------
                1. Read content from the user and write it into another file
                2. Copying from one file to another
                3. Modify content of a file
                4. Search for a particular word
                5. Convert .txt file into .csv file
                Enter the operation you need to perform: """);
            int option = sc.nextInt();
            sc.nextLine();
            switch(option){
                case 1: writeAll(sc);
                        break;
                case 2: transfer(sc);
                        break;
                case 3: modify(sc);
                        break;
                case 4: search(sc);
                        break;
                case 5: convert(sc);
                        break;
                case 6: flag = false;
                        System.out.println("Operations done successfully");
                        break;

            }
        }
    }

    public static void writeAll(Scanner sc){
        try{
            System.out.print("Enter a file name: ");
            String fileName = sc.nextLine();
            File file = new File(fileName);
            file.createNewFile();
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            System.out.print("Enter exit to end the file: ");
            while(true){
                String sentence = sc.nextLine();
                if(sentence.equals("exit")) break;
                bw.write(sentence);
                bw.newLine();
            }

            bw.close();
            fw.close();
            readAll(file,sc);

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void readAll(File file,Scanner sc){
        try{
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine())!=null){
                System.out.println(line);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void transfer(Scanner sc){
        try{
            System.out.print("Enter the file name to copy: ");
            String oldFileName = sc.nextLine();
            System.out.print("Enter the new file name: ");
            String newFileName = sc.nextLine();
            BufferedWriter bw = new BufferedWriter(new FileWriter(newFileName));
            BufferedReader br = new BufferedReader(new FileReader(oldFileName));
            String line;
            while((line=br.readLine())!=null){
                bw.write(line);
                bw.newLine();
            }
            br.close();
            bw.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void modify(Scanner sc){
        System.out.print("Enter the file name you want to modify: ");
        String fileName = sc.nextLine();
        File file = new File(fileName);
        System.out.print("Enter the content you want to change: ");
        String oldContent = sc.nextLine();
        System.out.print("Enter the new content to be paste: ");
        String newContent = sc.nextLine();
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));
            StringBuilder sb = new StringBuilder();
            String line;
            while((line=br.readLine())!=null){
                line = line.replace(oldContent,newContent);
                sb.append(line).append(System.lineSeparator());
            }
            br.close();

            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            bw.write(sb.toString());
            bw.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void search(Scanner sc){
        System.out.print("Enter the file name: ");
        String file = sc.nextLine();
        File fileName = new File(file);
        System.out.print("Enter the word to search: ");
        String word = sc.nextLine();
        int count = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String line;
            while((line=br.readLine())!=null){
                int index = line.indexOf(word);
                while(index!=-1){
                    count++;
                    index = line.indexOf(word,index+1);
                }
            }
            System.out.println(word +" appears "+count+" times");

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void convert(Scanner sc){
       System.out.print("Enter the file name(.txt) : ");
       String fileName = sc.nextLine();
       File file = new File(fileName);
       System.out.print("Enter the file name(.csv) : ");
       String newFileName = sc.nextLine();
       File file2 = new File(newFileName);
       try{
           BufferedReader br = new BufferedReader(new FileReader(file));
           BufferedWriter bw = new BufferedWriter(new FileWriter(file2));
           StringBuilder sb = new StringBuilder();
           String line;
           while((line = br.readLine())!=null){
               line = line.trim().replaceAll("\\s+",",");
               sb.append(line).append(",");
           }
           br.close();
           bw.write(sb.toString());
           bw.close();
       }catch(Exception e){
           e.printStackTrace();
       }
    }
}
