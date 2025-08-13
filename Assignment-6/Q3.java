// 3. Design a class`Employee with private data members: employee ID, name, designation, department, and monthly salary. Use proper getter and setter methods to access and update these fields. Add a method to calculate and return the annual salary of the employee.

class Employee{
	private int empId;
	private String name;
	private String designation;
	private String department;
	private double salary;

	void setEmpId(int empId){
		this.empId = empId;
	} 

	int getEmpId(){
		return empId;
	}

	void setName(String name){
		this.name = name;
	}

	String getName(){
		return name;
	}

	void setDesignation(String designation){
		this.designation = designation;
	}

	String getDesignation(){
		return designation;
	}

	void setDepartment(String department){
		this.department = department;
	}

	String getDepartment(){
		return department;
	}

	void setSalary(double salary){
		this.salary = salary;
	}

	double getSalary(){
		return salary;
	}

	double calculateAnnualSalary(){
		return 12 * getSalary();
	}

	void display(){
		System.out.println("Emp Id: "+getEmpId());
		System.out.println("Name: "+getName());
		System.out.println("Designation: "+getDesignation());
		System.out.println("Department: "+getDepartment());
		System.out.println("Monthly Salary: "+getSalary());
		System.out.println("Annual Salary: "+calculateAnnualSalary());
	}
}

public class Q3{
	public static void main(String[] args){
		Employee emp = new Employee();
		emp.setEmpId(100);
		emp.setName("Raja");
		emp.setDesignation("Developer");
		emp.setDepartment("IT");
		emp.setSalary(50000);
		emp.display();
	}
}