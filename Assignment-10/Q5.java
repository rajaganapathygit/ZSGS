/* 5. Write a Java program to,
1. create a new priority queue, add some colors (string) and print out the elements of the priority queue.
2. iterate through all elements in priority queue.
3. add all the elements of a priority queue to another priority queue.
4. insert a given element into a priority queue.
5. remove all the elements from a priority queue.
6. count the number of elements in a priority queue.
7. compare two priority queues.
8. retrieve the first element of the priority queue.
9. retrieve and remove the first element.
10. convert a priority queue to an array containing all of the elements of the queue. */

import java.util.*;

public class Q5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PriorityQueue<String> colours = new PriorityQueue<>();
		boolean flag = true;
		while(flag){
			System.out.print("""
							-----------Menu-----------
							1. Create, Add and Print
							2. Iterate
							3. Add all
							4. Insert
							5. Remove all elements
							6. Number of elements
							7. Compare
							8. Retrieve first element
							9. Retrieve and remove the first element
							10. To Array
							11. Stop
							Enter the operation you need to perform: """);
			int option = sc.nextInt();
			switch(option){
				case 1: create(colours);
						break;
				case 2: iterate(colours);
						break;
				case 3: addAll(colours);
						break;
				case 4: insert(colours);
						break;
				case 5: remove(colours);
						break;
				case 6: System.out.println("Number of elements in a Queue: "+colours.size());
						break;
				case 7: compare(colours);
						break;
				case 8: System.out.println("First Element is "+colours.peek());
						break;
				case 9: colours.poll();
						iterate(colours);
						break;
				case 10: Object[] arr = colours.toArray(); 
						 int index = 1;
						 for(int i=0;i<arr.length;i++){
						 	System.out.println(index+". "+arr[i]);
						 	index++;
						 }
						 break;
				case 11: flag = false;
						 System.out.println("Successfully finished");
						 break;
				default: flag=false;
						 System.out.println("Incorrect Operation");
			}
		}
		

	}

	public static void create(PriorityQueue<String> pq){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the queue: ");
		int size = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<size;i++){
			String colour = sc.nextLine();
			pq.add(colour);
		}
		iterate(pq);
	}

	public static void iterate(PriorityQueue<String> pq){
		Iterator<String> it = pq.iterator();
		int index = 1;
		while(it.hasNext()){
			System.out.println(index+". "+it.next());
			index++;
		}
	}

	public static void addAll(PriorityQueue<String> pq){
		PriorityQueue<String> pq1 = new PriorityQueue<>(pq);
		iterate(pq1);
	}

	public static void insert(PriorityQueue<String> pq){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String word = sc.nextLine();
		pq.add(word);
		iterate(pq);
	}

	public static void remove(PriorityQueue<String> pq){
		pq.clear();
		iterate(pq);
	}

	public static void compare(PriorityQueue<String> pq){
		PriorityQueue<String> pq1 = new PriorityQueue<>();
		create(pq1);
		System.out.println("IsEqual: "+pq1.equals(pq));
	}



}