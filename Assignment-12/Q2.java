/* 2. Write a Java program to create a thread using the Runnable interface.
--->Create a class TaskRunner that implements Runnable.
--->Inside the run() method, print the current thread name and a task-specific message 10 times with a delay of 1000ms.
--->In the main() method, create two Thread objects passing different TaskRunner instances and start both threads.
--->The console should reflect the concurrent execution of both tasks. */

class TaskRunner implements Runnable{

	String message;

	TaskRunner(String message){
		this.message = message;
	}
	
	public void run(){
		try{
			for(int i=1;i<=10;i++){
				System.out.println(Thread.currentThread().getName()+" - "+message+i+" is executing");
				Thread.sleep(1000);
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}

public class Q2{
	public static void main(String[] args){
		TaskRunner t1 = new TaskRunner("Adding");
		TaskRunner t2 = new TaskRunner("Deleting");
		Thread t3 =  new Thread(t2);
		Thread t4 = new Thread(t1);
		t3.start();
		t4.start();
	}
}