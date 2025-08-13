//4. Write a program to illustrate that Classes cannot be used for multiple Inheritance.

class Employee{
	void print(){
		System.out.println("This is the base class");
	}
}
class Developer extends Employee{
	void print(){
		System.out.println("This is the Developer class derived from base class");
	}
}
class FullTime extends Employee,Developer{
	void print(){
		System.out.println("This is the Multiple inheritance because it extends from both classes");
	}
}
public class Q4{
	public static void main(String... args){
		FullTime emp1 = new FullTime();
		emp1.print();
	}
}