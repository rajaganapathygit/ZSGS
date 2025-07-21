class Employee{
	String name;
	long yearOfJoining;
	double salary;
	String address;
	Employee(String name,long yearOfJoining,String address){
		this.name = name;
		this.yearOfJoining = yearOfJoining;
		this.address = address;
	}
	void display(){
		
		System.out.printf("%-8s| %-8d| %-8s",name,yearOfJoining,address);
		System.out.println();
	}
	public static void main(String[] args){
		Employee emp1 = new Employee("Robert",1994,"64C-WallsStreat");
		Employee emp2 = new Employee("Sam",2000,"68D-WallsStreat");
		Employee emp3 = new Employee("John",1999,"26B-WallsStreat");
		System.out.println("Name  | YOJ  | Address ");
		emp1.display();
		emp2.display();
		emp3.display();
	}
}