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
