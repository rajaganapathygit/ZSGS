/* 3. Write a program to illustrate how to throw a ClassNotFoundException. */
import java.util.*;
public class Q3{
	public static void main(String[] args){

		try{
			Class.forName("Q3");
			System.out.println("Class is found");
		}catch(Exception e){
			System.out.println("Exception: "+e.getMessage());
		}
	}
}