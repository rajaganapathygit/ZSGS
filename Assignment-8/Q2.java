//2. Develop a Java program which illustrates the usage of Comparator Interface.

import java.util.*;

class Employee{
	
	int empId;
	String name;
	double salary;
	int age;

	Employee(int empId,String name,double salary,int age){
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.age = age;
	}

	public double getSalary(){
		return salary;
	}

	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}
	public String toString(){
		return "\n  "+empId+"   "+name+"   "+age+"   "+salary;
	}
}

// class SortBySalary implements Comparator<Employee>{
	
// 	public int compare(Employee emp1,Employee emp2){
// 		return (int) (emp1.salary - emp2.salary);
// 	}
// }

public class Q2{
	public static void main(String[] args){
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(1,"Raja",50000,21));
		emp.add(new Employee(4,"Raghul",35000,21));
		emp.add(new Employee(3,"Pugal",5000,20));
		emp.add(new Employee(2,"Raghul",35000,19));

		emp.sort(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName).thenComparing(Employee::getAge));

		System.out.println("\nEmp Id: Name:   Age:   Salary: ");

		for(Employee e: emp){
			System.out.println(e);
		}

	}
}	