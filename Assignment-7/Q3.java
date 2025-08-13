/* 3. Create a Java application to manage employees in a company. Define an abstract class Employee 
with a method calculateSalary(). Then create two subclasses FullTimeEmployee and PartTimeEmployee 
that override calculateSalary() method based on their working type. Demonstrate runtime polymorphism 
by calling calculateSalary() on different types of employees using the Employee reference. */

abstract class Employee{
	String name;
	String designation;
	double monthlySalary;

	Employee(String name,String designation,double monthlySalary){
		this.name = name;
		this.designation = designation;
		this.monthlySalary = monthlySalary;
	}

	abstract double calculateSalary();

	void display(){
		System.out.println("Name: "+name);
		System.out.println("Designation: "+designation);
		System.out.println("Monthly Salary: "+monthlySalary);
		System.out.println("Annual Salary: "+calculateSalary());
	}
}

class FullTimeEmployee extends Employee{
	
	FullTimeEmployee(String name, String designation, double monthlySalary){
		super(name,designation,monthlySalary);
		System.out.println("FullTimeEmployee");
	}

	double calculateSalary(){
		return 12*monthlySalary;
	}

}

class PartTimeEmployee extends Employee{
	
	PartTimeEmployee(String name, String designation, double monthlySalary){
		super(name,designation,monthlySalary);
		System.out.println("PartTimeEmployee");

	}

	double calculateSalary(){
		return (12*monthlySalary)/2;
	}

}

public class Q3{
	public static void main(String[] args){
		FullTimeEmployee emp1 = new FullTimeEmployee("Raja","Developer",50000);
		emp1.calculateSalary();
		emp1.display();
		PartTimeEmployee emp2 = new PartTimeEmployee("Pugal","Developer",50000);
		emp2.calculateSalary();
		emp2.display();
	}
}