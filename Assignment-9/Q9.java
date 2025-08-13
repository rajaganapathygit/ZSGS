/* 9. Create a method to read a file from disk. 
Handle FileNotFoundException and IOException using try-catch-finally. */

import java.io.*;

public class Q9{
	public static void main(String[] args) throws Exception{
		try{
			read();
		}catch(FileNotFoundException e){
			System.out.println("FileNotFoundException: "+e.getMessage());
		}finally{
			System.out.println("Finally executed");

		}
		
	}

	public static String read() throws Exception{
		try{
			File file = new File("file1.txt");
			FileReader fr = new FileReader(file);
			throw new Exception("FileNotFoundException");

		}
		finally{
			System.out.println("Finally executed");

		}
		
	}
}