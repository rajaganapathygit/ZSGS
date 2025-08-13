// 5. Write a program to illustrate the usage of clone() and find out what kind of copy it will make.

class Employee implements Cloneable{
	String name;
	String designation;
	int age;
	int[] marks = {1,2,3};

	Employee(String name, String designation,int age){
		this.name = name;
		this.designation = designation;
		this.age = age;
	}

	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

	public String toString(){
		return "\n Name: "+name+"\n Designation: "+designation+"\n Age: "+age+"\n Marks: "+marks[0];
	}
}

public class Q5{
	public static void main(String[] args) throws CloneNotSupportedException{
		Employee emp1 = new Employee("Raja","Developer",21);
		Employee emp2 = (Employee)emp1.clone();

		System.out.println("Original Employee: "+emp1.toString());
		System.out.println("Cloned Employee: "+emp2.toString());

		emp2.marks[0]= 22;

		System.out.println("Original Employee: "+emp1.toString());
		System.out.println("Cloned Employee: "+emp2.toString());
	}
}