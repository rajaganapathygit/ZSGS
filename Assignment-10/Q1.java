/* 1. Write a Java program
a. to create a new array list, add some colours (string) and print out the collection.
b. to iterate through all elements in an array list.
c. to insert an element into the array list at the first position.
d. to retrieve an element (at a specified index) from a given array list.
e. to update specific array element by given element.
f. to remove the third element from an array list.
g. to search an element in an array list.
h. to sort a given array list.
i. to copy one array list into another.
j. to shuffle elements in an array list. */


import java.util.*;

public class Q1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<String> colours = new ArrayList<>();
		boolean flag = true;

	 while(flag){

		System.out.println("""
							--------Menu: ------------
							 1. Add 
							 2. Iterate
							 3. Insert
							 4. Retrieve
							 5. Update
							 6. Remove
							 7. Search
							 8. Sort
							 9. Copy
					  10. Shuffle
					  11. Stop""");
		System.out.print("Enter the operation you want to perform: ");
		int option = sc.nextInt();

		switch(option){
			case 1: add(colours);
					break;
			case 2: iterate(colours);
					break;
			case 3: insert(colours);
					break;
			case 4: retrieve(colours);
					break;
			case 5: update(colours);
					break;
			case 6: remove(colours);
					break;
			case 7: search(colours);
					break;
			case 8: sort(colours);
					break;
			case 9: copy(colours);
					break;
		   case 10: shuffle(colours);
		   			break;
		   case 11: flag = false;
		   			System.out.println("Successfully Finished");
		   			break;
		   default: System.out.println("Incorrect Operation");
		   			flag = false;

		}
	 }	
		
    }

	public static void add(ArrayList<String> arr){
		arr.add("Green");
		arr.add("Blue");
		arr.add("Red");
		arr.add("Violet");
		arr.add("Pink");
		iterate(arr);
	}

	public static void iterate(ArrayList<String> arr){
		System.out.println("ArrayList Contains:");
		int index = 1;
		for(String it: arr){
			System.out.println(index+". "+it);
			index++;
		}
	}

	public static void insert(ArrayList<String> arr){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the element to insert: ");
		String newWord = sc.nextLine();
		arr.add(0,newWord);
		iterate(arr);
	}

	public static void retrieve(ArrayList<String> arr){
		Scanner sc = new Scanner(System.in);
		try{
			System.out.print("Enter the specified index to retrieve an element: ");
			int index = sc.nextInt();
			System.out.println("Element at index "+index+" is "+arr.get(index));
		}catch(Exception e){
			System.out.println("Index is out of range");
			System.out.println("Exception: "+e.getMessage());
		}
	}

	public static void update(ArrayList<String> arr){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the index to update: ");
		int index = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the new element to update: ");
		String el = sc.nextLine();
		arr.set(index,el);
		iterate(arr);
	}

	public static void remove(ArrayList<String> arr){
			Scanner sc = new Scanner(System.in);
			try{
				System.out.print("Enter the index to remove an element: ");
				int index = sc.nextInt();
				arr.remove(index);
				iterate(arr);
			}catch(Exception e){
				System.out.println("Index is out of range");
				System.out.println("Exception: "+e.getMessage());
			}		
	}

	public static void search(ArrayList<String> arr){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the element to search: ");
		String el = sc.nextLine();
		if(arr.indexOf(el)!=-1){
			System.out.println("Element found at index: "+arr.indexOf(el));
		}
		else{
			System.out.println("Element not found in the arraylist");
		}
		

	}

	public static void sort(ArrayList<String> arr){
		System.out.println("Sorted ArrayList: ");
		arr.sort(Comparator.naturalOrder());
		System.out.println(arr);
	}

	public static void copy(ArrayList<String> arr){
		ArrayList<String> list = new ArrayList<>(arr);
		iterate(list);
	}

	public static void shuffle(ArrayList<String> arr){
		Collections.shuffle(arr);
		iterate(arr);
	}


}