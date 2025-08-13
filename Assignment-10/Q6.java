/* 6. Write a Java program to,
1. associate the specified value with the specified key in a Tree Map.
2. copy a Tree Map content to another Tree Map.
3. search a key in a Tree Map.
4. search a value in a Tree Map.
5. get all keys from the given a Tree Map.
6. delete all elements from a given Tree Map.
7. sort keys in Tree Map by using comparator.
8. get a key-value mapping associated with the greatest key and the least key in a map.
9. get the first (lowest) key and the last (highest) key currently in a map.
10. get a reverse order view of the keys contained in a given map. */

import java.util.*;


class Methods{
	Scanner sc = new Scanner(System.in);
	TreeMap<Integer, String> tm = new TreeMap<>();

	void create(){
		System.out.print("Enter the size of the map: ");
		int size = sc.nextInt();
		for(int i=0;i<size;i++){
			System.out.print("Enter the key: ");
			int key = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter the value: ");
			String value = sc.nextLine();
			tm.put(key,value);
		}
	}

	void display(){
		for(Map.Entry<Integer,String> map:tm.entrySet()){
			System.out.println(map.getKey()+" -> "+map.getValue());
		}
	}

	void copy(){
		TreeMap<Integer,String> tm1 = new TreeMap<>(tm);
		display();

	}

	void containsKey(){
		System.out.print("Enter the key: ");
		int key = sc.nextInt();
		sc.nextLine();
		System.out.println("IsKey Contains: "+tm.containsKey(key));
	}

	void containsValue(){
		System.out.print("Enter the value: ");
		String value = sc.nextLine();
		System.out.println("IsValue Contains: "+tm.containsValue(value));
	}

	void getAllKeys(){
		System.out.println("Keys: ");
		for(Integer key: tm.keySet()){
			System.out.print(key+" ");
		}
	}

	void deleteAll(){
		tm.clear();
		display();
	}

	void sort(){
		TreeMap<Integer,String> tm1 = new TreeMap<>(Comparator.reverseOrder());
		tm1.putAll(tm);
		System.out.println(tm1);
	}

	void greatestKeyEntry(){
		Map.Entry<Integer,String> entry = tm.lastEntry();
		System.out.println(entry.getKey()+" -> "+entry.getValue());
	}

	void leastKeyEntry(){
		Map.Entry<Integer,String> entry = tm.firstEntry();
		System.out.println(entry.getKey()+" -> "+entry.getValue());
	}

	void greatestKey(){
		System.out.println("Highest Key is "+tm.lastKey());
	}

	void lowestKey(){
		System.out.println("Lowest Key is "+tm.firstKey());
	}

	void reverse(){
		NavigableSet<Integer> reversed = tm.descendingKeySet();
		for(Integer key: reversed){
			System.out.print(key+" ");
		}
	}
}
public class Q6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		Methods obj = new Methods();
		while(flag){
			System.out.print("""
							----------Menu------------
							1. Create map
							2. Display map
							3. Copy
							4. Search a key
							5. Search a value
							6. Get all keys
							7. Delete all elements
							8. Sort using comparator
							9. Greatest key entry
							10. Least key entry
							11. Greatest key
							12. Lowest key
							13. Reverse Order 
							14. Stop
							Enter the operation you need to perform: """);
			int option = sc.nextInt();
			sc.nextLine();
			switch(option){
				case 1: obj.create();
						break;
				case 2: obj.display();
						break;
				case 3: obj.copy();
						break;
				case 4: obj.containsKey();
						break;
				case 5: obj.containsValue();
						break;
				case 6: obj.getAllKeys();
						break;
				case 7: obj.deleteAll();
						break;
				case 8: obj.sort();
						break;
				case 9: obj.greatestKeyEntry();
						break;
				case 10: obj.leastKeyEntry();
						 break;
				case 11: obj.greatestKey();
						 break;
				case 12: obj.lowestKey();
						 break;
				case 13: obj.reverse();
						 break;
				case 14: flag = false;
						 System.out.println("Successfully Finished");
						 break;
				default: flag = false;
					     System.out.println("Incorrect Operation");
			}
		}
	}
}