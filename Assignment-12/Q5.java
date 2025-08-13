/* 5. Implement a basic producer-consumer problem using wait() and notify().
--->Producer thread should add items to a shared buffer.
--->Consumer thread should remove items.
Ensure the buffer size is limited to 5 items. */

class Problem{
	 int items = 0;
	private int size;

	Problem(int size){
		this.size = size;
	}

	public synchronized void produce(){
	
		while(items==size+1){
			try{
				wait();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		try{
			items++;
			System.out.println(items+" is added");
			
			Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		notify();
	}

	public synchronized void consume(){

		while(items==0){
			try{
				wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		try{
			
			System.out.println(items+" is deleted");
			items--;
			Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		notify();
	}
}

class Producer extends Thread{
	Problem producer;

	Producer(Problem producer){
		this.producer = producer;
	}

	public void run(){
		for(int i=0;i<5;i++){
				producer.produce();			
		}
	}
}

class Consumer extends Thread{
	Problem consumer;

	Consumer(Problem consumer){
		this.consumer = consumer;
	}

	public void run(){
		for(int i=0;i<5;i++){
			consumer.consume();			
		}
	}
}

public class Q5{
	public static void main(String[] args){
		Problem obj = new Problem(5);
		Producer produce = new Producer(obj);
		Consumer consume = new Consumer(obj);
	

		produce.start();
		consume.start();
	}
}








