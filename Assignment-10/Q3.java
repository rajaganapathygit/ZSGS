/* 3. Write a Java program to,
a. append the specified element to the end of a hash set.
b. iterate through all elements in a hash list.
c. get the number of elements in a hash set.
d. empty the hash set.
e. test a hash set is empty or not.
f. clone a hash set to another hash set.
g. convert a hash set to an array.
h. convert a hash set to a tree set.
i. convert a hash set to a List/ArrayList.
j. compare two hash set. */

import java.util.*;

public class Q3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		HashSet<String> set = new HashSet<>();
		
		boolean flag = true;
		while(flag){
			System.out.print("""
								----------Menu-------------
								1. Add
								2. Iterate
								3. Size
								4. Empty
								5. IsEmpty
								6. Clone
								7. ToArray
								8. TreeSet
								9. ArrayList
								10. Equals
								11. Stop
								Enter the Operation you need to perform: """);
			int option = sc.nextInt();
			switch(option){
				case 1: add(set);
						break;
				case 2: iterate(set);
						break;
				case 3: size(set);
						break;
				case 4: empty(set);
						break;
				case 5: isEmpty(set);
						break;
				case 6: clone(set);
						break;
				case 7: toArray(set);
						break;
				case 8: treeSet(set);
						break;
				case 9: list(set);
						break;
				case 10: equal(set,set2);
						 break;
				case 11: flag = false;
						 System.out.println("Successfully Finished");
						 break;
				default: flag = false;
						 System.out.println("Incorrect Operation");
			}
		}
	}

	public static void add(HashSet<String> arr){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the elements: ");
		for(int i=0;i<size;i++){
			String word = sc.nextLine();
			arr.add(word);
		}
		
		iterate(arr);
	}

	public static void iterate(HashSet<String> arr){
		System.out.println("Set Contains: ");
		int index = 1;
		Iterator<String> itr = arr.iterator();
		while(itr.hasNext()){
			System.out.println(index+". "+itr.next());
			index++;
		}
	}

	public static void size(HashSet<String> arr){
		System.out.println("Number of elements in the hashset is "+arr.size());
	}

	public static void empty(HashSet<String> arr){
		System.out.println("Before Emptying: ");
		iterate(arr);
		arr.clear();
		System.out.println("After emptying: ");
		iterate(arr);
	}

	public static void isEmpty(HashSet<String> arr){
		System.out.println("IsEmpty: "+arr.isEmpty());
	}

	public static void clone(HashSet<String> arr){
		HashSet<String> cloned = (HashSet<String>) arr.clone();
		System.out.println("Cloned HashSet: ");
		iterate(cloned);
	}

	public static void toArray(HashSet<String> arr){
		Object[] array = arr.toArray();
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+ " ");
		}
	}

	public static void treeSet(HashSet<String> arr){
		TreeSet<String> set = new TreeSet<>(arr);
		System.out.println(set);
	}

	public static void list(HashSet<String> arr){
		List<String> set = new ArrayList<>(arr);
		System.out.println(set);
	}

	public static void equal(HashSet<String> arr,HashSet<String> arr2){
		HashSet<String> set2 = new HashSet<>();
		add(set2);
		System.out.println("Equals: "+arr2.equals(arr));

	}

}