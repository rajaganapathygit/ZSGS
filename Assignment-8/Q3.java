//3. Develop a Java program which illustrates the usage of Comparable Interface.

import java.lang.*;
import java.util.*;

class Student implements Comparable<Student>{
	String name;
	int marks;

	Student(String name,int marks){
		this.name = name;
		this.marks = marks;
	}

	public String toString(){
		return "\n "+name+"  "+marks;
	}

	public int compareTo(Student std){
		return this.marks - std.marks;
	}
}

public class Q3{
	public static void main(String[] args){
		List<Student> std = new ArrayList<>();
		std.add(new Student("Raja",85));
		std.add(new Student("Pugal",96));
		std.add(new Student("Raghul",67));
		std.add(new Student("Deva",78));

		Collections.sort(std);

		for(Student s: std){
			System.out.println(s);
		}
	}
}