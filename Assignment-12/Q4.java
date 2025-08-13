/* 4. Create a Java program with a shared counter. Spawn 3 threads, where each thread increments 
the counter 1000 times. Use synchronization to avoid race conditions and display the final value. */

class Counter{
	private int counter=0;

	public synchronized void increment(){
		for(int i=1;i<=1000;i++){
			counter++;
		}
		
	}

	public int getCount(){
		return counter;
	}
}

class Incrementation extends Thread{
	Counter count = new Counter();

	Incrementation(Counter count){
		this.count = count;
	}

	public void run(){
		count.increment();
	}
}

public class Q4{
	public static void main(String[] args){
		Counter count = new Counter();
		Incrementation i1 = new Incrementation(count);
		Incrementation i2 = new Incrementation(count);
		Incrementation i3 = new Incrementation(count);

		i1.start();
		i2.start();
		i3.start();

		try{
			i1.join();
			i2.join();
			i3.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}

		System.out.println("Final Count: "+count.getCount());
	}
}