import java.io.*;
import java.util.Scanner;
public class FileHandling {
    public static void main(String[] args) throws IOException{
        File file = new File("file1.txt");
        Scanner read = new Scanner(file);
        while(read.hasNext()){
            String data1 = read.nextLine();
            System.out.println((char)data1);
        }

       /* if(file.exists()){
            System.out.println("File exists: "+file.getName());
        }else{
            System.out.println("File not found");
            file.createNewFile();
            System.out.println("File created");
        }
        FileWriter fw = new FileWriter(file);
        fw.write("Welcome to file handling");
        fw.close();

        FileReader fr = new FileReader(file);
        int data;
        while((data=fr.read())!=-1)
        {
            System.out.print((char)data);
        }*/

    }
}
