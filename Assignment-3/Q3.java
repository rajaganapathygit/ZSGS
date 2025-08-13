/*3. Write a Java program where you define a class named Employee. Inside the class, define fields to hold an employee’s name, employee ID, designation, and salary.
a. First, create a no-argument constructor that prints a message saying the object has been created, and sets default values for all the fields.
b. Write a parametrized constructor that allows you to set values for all the fields when an object is created.
c. Add another constructor — a copy constructor — that takes an existing employee object and creates a new one with the same values.
In the main method, create:
a. One object using the no-argument constructor,
b. One object using the parametrized constructor,
c. And a third object using the copy constructor.
Finally, display the details of all three employees.*/

class Employee {
    String name;
    int id;
    String designation;
    double salary;
    Employee(){
        System.out.println("Object has been created");
        name="";
        id=0;
        designation="";
        salary=0.0;
    }
    Employee(String name, int id, String designation,double salary){
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.salary = salary;
    }
    Employee(Employee emp){
        name = emp.name;
        id = emp.id;
        designation = emp.designation;
        salary = emp.salary;
    }
    void display(){
        System.out.println("\nEmployee Details: ");
        System.out.println("Name: "+name+"\nId: "+id+"\nDesignation: "+designation+"\nSalary: "+salary);
    }
    public static void main(String[] args){
        Employee emp1 = new Employee();
        Employee emp2 = new Employee("Raja",100,"SDE",60000);
        Employee emp3 = new Employee(emp2);
        emp1.display();
        emp2.display();
        emp3.display();
    }
}
