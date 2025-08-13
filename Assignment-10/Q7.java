/* 7. Write a Java program to,
1. associate the specified value with the specified key in a HashMap.
2. count the number of key-value (size) mappings in a map.
3. copy all of the mappings from the specified map to another map.
4. remove all of the mappings from a map.
5. check whether a map contains key-value mappings (empty) or not.
6. get a shallow copy of a HashMap instance.
7. test if a map contains a mapping for the specified key.
8. test if a map contains a mapping for the specified value.
9. create a set view of the mappings contained in a map.
10. get the value of a specified key in a map. */

import java.util.*;

public class Q7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Methods obj = new Methods();
		boolean flag = true;
		while(flag){
			System.out.print("""
							--------Menu-------
							1. Create map
							2. Display map
							3. Size
							4. Copy
							5. Remove
							6. Shallow Copy
							7. Specific Key
							8. Specific Value
							9. Set View
							10. getValue
							11. Stop
							Enter the operation you need to perform: """);
			int option = sc.nextInt();
			switch(option){
				case 1: obj.create();
						break;
				case 2: obj.display();
						break;
				case 3: obj.size();
						break;
				case 4: obj.copy();
						break;
				case 5: obj.remove();
						break;
				case 6: obj.shallowCopy();
						break;
				case 7: obj.specificKey();
						break;
				case 8: obj.specificValue();
						break;
				case 9: obj.set();
						break;
				case 10: obj.getValue();
						 break;
				case 11: flag = false;
						 System.out.println("Successfully Finished");
						 break;
				default: flag = false;
						 System.out.println("Incorrect Operation");
			}
		}
	}
}

 class Methods{

	HashMap<Integer,String> map = new HashMap<>();	
	Scanner sc = new Scanner(System.in);
	void create(){
		System.out.print("Enter the size of the map: ");
		int size = sc.nextInt();
		for(int i=0;i<size;i++){
			System.out.print("Enter the key: ");
			int key = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter the value: ");
			String value = sc.nextLine();
			map.put(key,value);
		}
	}

	void display(){
		for(Map.Entry<Integer,String> m : map.entrySet() ){
			System.out.println(m.getKey()+" -> "+m.getValue());
		}
	}

	void size(){
		System.out.println("Number of key-value pairs: "+map.size());
	}

	void copy(){
		Map<Integer,String> map2 = new HashMap<>();
		map2.putAll(map);
		display();
	}

	void remove(){
			map.clear();
			display();
	}

	void shallowCopy(){
		Map<Integer,String> map2 = (Map<Integer,String>)map.clone();
		display();
	}

	void specificKey(){
		System.out.print("Enter the key to check: ");
		int key = sc.nextInt();
		System.out.println("Contains Key: "+map.containsKey(key));
	}

	void specificValue(){
		System.out.print("Enter the value to check: ");
		String value = sc.nextLine();
		System.out.println("Contains Value: "+map.containsValue(value));
	}

	void set(){
		Set<Map.Entry<Integer,String>> set = map.entrySet();
		display();
	}

	void getValue(){
		System.out.print("Enter the key to obtain the value: ");
		int key = sc.nextInt();
		System.out.println("Value: "+map.get(key));

	}
}