/* 4. Write a Java program to,
a. create a new tree set, add some colours (string) and print out the tree set.
b. iterate through all elements in a tree set.
c. add all the elements of a specified tree set to another tree set.
d. create a reverse order view of the elements contained in a given tree set.
e. get the first and last elements in a tree set.
f. clone a tree set list to another tree set.
g. get the number of elements in a tree set.
h. compare two tree sets.
Create a TreeSet that stores a set of numbers,   
i. find the numbers less than 7 in a tree set.
j. get the element in a tree set which is greater than or equal to the given element.
k. get the element in a tree set which is less than or equal to the given element.
l. get the element in a tree set which is strictly greater than or equal to the given element.
m. get an element in a tree set which is strictly less than the given element.
n. retrieve and remove the first element of a tree set.
o. retrieve and remove the last element of a tree set.
p. remove a given element from a tree set. */

import java.util.*;

public class Q4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		TreeSet<String> colours = new TreeSet<>();
		TreeSet<Integer> numbers = new TreeSet<>();
		boolean flag = true;
		while(flag){
			System.out.print("""
								--------Menu--------
								1. Create, add, print
								2. Iterate
								3. Copy
								4. Reverse Order 
								5. First and Last Element
								6. Clone
								7. Number of elements
								8. Compare two tree sets
								9. Greater than or equal to
								10. Less than or equal to
								11. Strictly Greater than
								12. Strictly Less than
								13. Remove First element
								14. Remove Last element
								15. remove
								16. Stop
								Enter the Operation you need to perform: """);
			int option = sc.nextInt();
			switch(option){
				case 1: create(colours);
						break;
				case 2: iterate(colours);
						break;
				case 3: copy(colours);
						break;
				case 4: reverse(colours);
						break;
				case 5: firstAndLast(colours);
						break;
				case 6: clone(colours);
						break;
				case 7: System.out.println("Number of elements in the set is "+colours.size());
						break;
			    case 8: equals(colours);
			    		break;
			    case 9: createInteger(numbers);
			    		greaterThanOrEqualTo(numbers);
			    		break;
			    case 10: lessThanOrEqualTo(numbers);
			    		 break;
			    case 11: strictlyGreaterThan(numbers);
			    		 break;
			    case 12: strictlyLessThan(numbers);
			    		 break;
			    case 13: System.out.println("First element is "+numbers.pollFirst());
			    		 iterate(numbers);
			    		 break;
			    case 14: System.out.println("Last element is "+numbers.pollLast());
			    		 iterate(numbers);
			    		 break;
			    case 15: remove(numbers);
			    		 break;
			    case 16: System.out.println("Successfully Finished");
			    		 flag = false;
			    		 break;
				default: flag = false;
						 System.out.println("Incorrect Operation");
			}
		}
	}

	public static void create(TreeSet<String> set){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the set: ");
		int size = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<size;i++){
			String colour = sc.nextLine();
			set.add(colour);
		}
		iterate(set);
	}

	public static void createInteger(TreeSet<Integer> set){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the set: ");
		int size = sc.nextInt();
		for(int i=0;i<size;i++){
			int num = sc.nextInt();
			set.add(num);
		}
		iterate(set);
	}

	public static void iterate(TreeSet<?> set){
		System.out.println("Set Contains: ");
		int index = 1;
		for(Object obj: set){
			System.out.println(index+". "+obj);
			index++;
		}
	}


	public static void copy(TreeSet<String> set){
		TreeSet<String> set2 = new TreeSet<>(set);
		System.out.println("Copied set: ");
		iterate(set2);
	}

	public static void reverse(TreeSet<String> set){
		Iterator<String> it = set.descendingIterator();
		int index = 1;
		while(it.hasNext()){
			System.out.println(index+". "+it.next());
			index++;
		}
	}

	public static void firstAndLast(TreeSet<String> set){
		System.out.println("First element in the set: "+set.first());
		System.out.println("Last element in the set: "+set.last());
	}

	public static void clone(TreeSet<String> set){
		TreeSet<String> set2 = (TreeSet<String>) set.clone();
		System.out.println("Cloned Set: ");
		iterate(set2);
	}

	public static void equals(TreeSet<String> set){
		TreeSet<String> set2 = new TreeSet<>();
		create(set2);
		System.out.println("IsEqual: "+set2.equals(set));
	}


	public static void greaterThanOrEqualTo(TreeSet<Integer> set){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		System.out.println("Number greater than or equal to "+num+" is "+set.ceiling(num));
	}

	public static void lessThanOrEqualTo(TreeSet<Integer> set){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		System.out.println("Number less than or equal to "+num+" is "+set.floor(num));
	}

	public static void strictlyGreaterThan(TreeSet<Integer> set){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		System.out.println("Number Greater than "+num+" is "+set.higher(num));
	}

	public static void strictlyLessThan(TreeSet<Integer> set){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		System.out.println("Number less than "+num+" is "+set.lower(num));
	}

	public static void remove(TreeSet<Integer> set){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to remove: ");
		int num = sc.nextInt();
		set.remove(num);
		iterate(set);

	}

}