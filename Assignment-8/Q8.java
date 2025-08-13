/* 8. Write a Java program to demonstrate the concept of object cloning using the clone() method.
--->Create a class Student with fields like name, rollNo, and department.
--->Attempt to clone an object of this class using the clone() method.
--->Catch and handle the CloneNotSupportedException if thrown.
***Also find out and explain why the class must implement the Cloneable interface to avoid CloneNotSupportedException.
-->Your program should clearly illustrate:
a. What happens if Cloneable is not implemented
b. How the error is resolved by implementing Cloneable */

class Student {
	String name;
	int rollNo;
	String department;

	Student(String name,int rollNo,String department){
		this.name = name;
		this.rollNo = rollNo;
		this.department = department;
	}

	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

	public String toString(){
		return "\n Name: "+name+"\n Roll No: "+rollNo+"\n Department: "+department;
	}
}

public class Q8{
	public static void main(String[] args) {
		Student std = new Student("Raja",36,"CSE");
		
		try{
			Student std1 = (Student)std.clone();
			System.out.println(std.toString());
			System.out.println(std1.toString());
		
		std.rollNo = 35;
		System.out.println(std.toString());
		System.out.println(std1.toString());	
		}catch(CloneNotSupportedException e){
			System.out.println("Clone Not Supported Exception: "+e.getMessage());
		}
		

	}
}