/* 1. Write a Java program to demonstrate multithreading by extending the Thread class.
--->Create a class MyThread that extends Thread.
--->Override the run() method to display the thread name and a message five times with a delay of 500 milliseconds between prints.
--->In the main() method, create two objects of MyThread and start them.
--->Each thread prints its message independently, showing concurrent execution. */

class MyThread extends Thread{
	
	public void run(){	
		try{
			for(int i=1;i<=5;i++){
				System.out.println(Thread.currentThread().getName()+i+" is running");
				Thread.sleep(500);
			}
			
		}catch(InterruptedException e){
			e.printStackTrace();
		}	
			
	}
}

public class Q1{
	public static void main(String[] args){
		
	
			MyThread t1 = new MyThread();
			MyThread t2 = new MyThread();
			t1.start();
			t2.start();
			
	}
}