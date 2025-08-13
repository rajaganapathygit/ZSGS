/* 2. Write a Java program to,
a. append the specified element to the end of a linked list.
b. iterate through all elements in a linked list.
c. iterate through all elements in a linked list starting at the specified position.
d. iterate a linked list in reverse order.
e. insert the specified element at the specified position in the linked list.
f. insert elements into the linked list at the first and last position.
g. insert the specified element at the front of a linked list.
h. insert the specified element at the end of a linked list.
i. insert some elements at the specified position into a linked list.
j. get the first and last occurrence of the specified elements in a linked list. */

import java.util.*;

public class Q2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		LinkedList<String> name = new LinkedList<>();
		boolean flag = true;
		while(flag){
			System.out.print("""
								--------Menu--------
								1. Add
								2. Iterate through all elements
								3. Iterate through all elements starting at specific position
								4. Reverse Order Iteration
								5. Insert
								6. InsertFirst 
								7. InsertLast
								8. Insert at Specific Position
								9. First Occurrence of element
								10. Last Occurrence of element 
								11. Stop
								Enter the operation you have to perform: """);
			int option = sc.nextInt();

			switch(option){
				case 1: append(name);
						break;
				case 2: iterate(name);
						break;
				case 3: System.out.print("Enter the index: ");
						int index = sc.nextInt();
						iterate(name,index);
						break;
				case 4: reverse(name);
						break;
				case 5: insert(name);
						break;
				case 6: insertAtFirst(name);
						break;
				case 7: insertAtLast(name);
						break;
				case 8: insertAtPosition(name);
						break;
				case 9: firstOccur(name);
						break;
				case 10: lastOccur(name);
						 break;
				case 11: flag = false;
						 System.out.println("Successfully Finished");
						 break;
				default: flag = false;
						 System.out.println("Incorrect Operation");
			}
		}
		
	}

	public static void append(LinkedList<String> arr){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the LinkedList: ");
		int size = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the elements: ");
		for(int i=0;i<size;i++){
			String el = sc.nextLine();
			arr.add(el);
		}
		iterate(arr);
	}

	public static void iterate(LinkedList<String> arr){
		Scanner sc = new Scanner(System.in);
		int size = arr.size();
		int index = 1;
		for(int i=0;i<size;i++){
			System.out.println(index+". "+arr.get(i));
			index++;
		} 
	}

	public static void iterate(LinkedList<String> arr, int start){
			int index = 1;
			for(int i= start;i<arr.size();i++){
				System.out.println(index +". "+arr.get(i));
				index++;
			}
	}

	public static void reverse(LinkedList<String> arr){
		int index = 1;
		for(int i = arr.size()-1;i>=0;i--){
			System.out.println(index+". "+arr.get(i));
			index++;
		}
	}

	public static void insert(LinkedList<String> arr){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the position: ");
		int index = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the element: ");
		String el = sc.nextLine();
		arr.set(index,el);
	}

	public static void insertAtFirst(LinkedList<String> arr){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the element to insert at the First Position: ");
		String first = sc.nextLine();
		arr.addFirst(first);
	}

	public static void insertAtLast(LinkedList<String> arr){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the element to insert at the Last Position: ");
		String last = sc.nextLine();
		arr.addLast(last);
	}

	public static void insertAtPosition(LinkedList<String> arr){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the index to insert: ");
		int index = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the element: ");
		String word = sc.nextLine();
		arr.add(index,word);
	}
	
	public static void firstOccur(LinkedList<String> arr){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the element to find the first Occurence: ");
		String first = sc.nextLine();
		System.out.println("First Occurence of "+first+ " is: "+arr.indexOf(first));
	}

	public static void lastOccur(LinkedList<String> arr){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the element to find the last Occurrence: ");
		String last = sc.nextLine();
		System.out.println("Last Occurrence of "+last+" is: "+arr.lastIndexOf(last));
	}

}