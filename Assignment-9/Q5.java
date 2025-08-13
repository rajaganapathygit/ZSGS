/* 5. Create a program where try block contains a return statement. 
Ensure that finally block executes before the method returns. Show this with output. */

public class Q5{
	public static void main(String[] args){
		System.out.println(message());
	}
	public static String message(){
		try{
			System.out.println("Try block executed");
			return "Return a number";
		}finally{
			System.out.println("Final block executed");
		}
	}
}