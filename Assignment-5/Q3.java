//3. Create a Java application to manage employees in a company. 
//Define a base class Employee with a method calculateSalary(). Then create two subclasses FullTimeEmployee and 
//PartTimeEmployee that override calculateSalary() method based on their working type.

class Employee{
	int empId;
	String empName;
	int numberOfDaysWorked;
	String empRole;

	Employee(int empId,String empName, int numberOfDaysWorked, String empRole){
		this.empId = empId;
		this.empName = empName;
		this.numberOfDaysWorked = numberOfDaysWorked;
		this.empRole = empRole;
	}

	double calculateSalary(){
		if(empRole.equals("Developer")){
			return 2000 * numberOfDaysWorked;
		}
		else if(empRole.equals("Analyst")){
			return 1500 * numberOfDaysWorked;
		}
		return 1000 * numberOfDaysWorked;
	}

	void display(){
		System.out.println("\nEmp_Id: "+empId+"\nEmp_Name: " +empName+"\nNumber of days worked: "+numberOfDaysWorked+"\nEmp_Role: "+empRole+"\n Salary: "+calculateSalary());
	}
}

class FullTimeEmployee extends Employee{
	double bonus;
	
	FullTimeEmployee(int empId,String empName, int numberOfDaysWorked, String empRole,double bonus){
		super(empId,empName,numberOfDaysWorked,empRole);
		this.bonus = bonus;
	}

	double calculateSalary(){
		if(empRole.equals("Developer")){
			return bonus+(numberOfDaysWorked * 2000);
		}
		else if(empRole.equals("Analyst")){
			return bonus + (numberOfDaysWorked * 1500);
		}
		return bonus + (numberOfDaysWorked * 1000);
		
	}

	// void display(){
	// 	super.display();
	// 	System.out.println("Salary: "+calculateSalary());
		
	// }
}

class PartTimeEmployee extends Employee{
	int workingHours;

	PartTimeEmployee(int empId,String empName, int numberOfDaysWorked, String empRole, int workingHours){
		super(empId,empName,numberOfDaysWorked,empRole);
		this.workingHours = workingHours;
	}

	double calculateSalary(){
		return workingHours * 500;
	}

	// void display(){
	// 	super.display();
	// 	System.out.println("Salary: "+calculateSalary());
		
	// }

}

public class Q3{
	public static void main(String[] args){
		Employee emp1 = new FullTimeEmployee(100,"Raja",30,"Developer",2000);
		emp1.display();
		Employee emp2 = new PartTimeEmployee(101,"Pugal",28,"Analyst",150);
		emp2.display();
		Employee emp3 = new Employee(102,"Hema",15,"");
		emp3.display();
		Employee emp4 = new FullTimeEmployee(100,"Raghul",30,"Analyst",2000);
		emp4.display();
		Employee emp5 = new FullTimeEmployee(101,"Kishore",28,"",150);
		emp5.display();
	}
}