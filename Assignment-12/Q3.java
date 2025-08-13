/* 3. Write a Java program where one thread prints only even numbers and another prints only 
odd numbers from 1 to 20. Synchronize the threads so that they print alternately (i.e., 1 2 3 4 ...). */

class PrintNumbers{
	private int num = 1;
	private  final int  MAX;

	PrintNumbers(int MAX){
		this.MAX = MAX;
	}

	public synchronized void oddNumbers(){
		while(num<=MAX){
			try{
				while(num%2==0){
					wait();
				}
			}catch(Exception e){
				e.printStackTrace();
			}
			if(num<=MAX){
				System.out.print(num+" ");
				num++;
				notify();
			}
			
		}
	}

	public synchronized void evenNumbers(){
		while(num<=MAX){
			try{
				while(num%2==1){
					wait();
				}
			}catch(Exception e){
				e.printStackTrace();
			}

			System.out.print(num+" ");
			num++;
			notify();
		}
	}
}

public class Q3{
	public static void main(String[] args){
		PrintNumbers numbers = new PrintNumbers(20);

		Thread oddThread = new Thread(numbers::oddNumbers,"OddThread");
		Thread evenThread = new Thread(numbers::evenNumbers,"EvenNumbers");
		oddThread.start();
		evenThread.start();
	}
}






