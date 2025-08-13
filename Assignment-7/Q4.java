/* 4. Create a Java application to manage employees in a company. Define an Interface Employee with a method calculateSalary(). Then create two subclasses FullTimeEmployee and PartTimeEmployee that override calculateSalary() method based on their working type. Demonstrate runtime polymorphism by calling calculateSalary() on different types of employees using the Employee reference. */

interface Employee{

	 double calculateSalary(double monthlySalary);	
}

class FullTimeEmployee implements Employee{

	String name;
	String designation;
	double monthlySalary;
	
	FullTimeEmployee(String name, String designation, double monthlySalary){
		System.out.println("FullTimeEmployee");
		this.name = name;
		this.designation = designation;
		this.monthlySalary = monthlySalary;

	}
	public double calculateSalary(double monthlySalary){
		return 12*monthlySalary;
	}

	void display(){
		System.out.println("Name: "+name);
		System.out.println("Designation: "+designation);
		System.out.println("Monthly Salary: "+monthlySalary);
		System.out.println("Annual Salary: "+calculateSalary(monthlySalary));
	}

}

class PartTimeEmployee implements Employee{

	String name;
	String designation;
	double monthlySalary;
	
	PartTimeEmployee(String name, String designation, double monthlySalary){
		System.out.println("PartTimeEmployee");
		this.name = name;
		this.designation = designation;
		this.monthlySalary = monthlySalary;

	}

	public double calculateSalary(double monthlySalary){
		return (12*monthlySalary)/2;
	}

	void display(){
		System.out.println("Name: "+name);
		System.out.println("Designation: "+designation);
		System.out.println("Monthly Salary: "+monthlySalary);
		System.out.println("Annual Salary: "+calculateSalary(monthlySalary));
	}

}

public class Q4{
	public static void main(String[] args){
		FullTimeEmployee emp1 = new FullTimeEmployee("Raja","Developer",50000);
		emp1.calculateSalary(50000);
		emp1.display();
		PartTimeEmployee emp2 = new PartTimeEmployee("Pugal","Developer",50000);
		emp2.calculateSalary(50000);
		emp2.display();
	}
}