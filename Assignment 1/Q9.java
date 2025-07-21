class Employee{
    int empId;
    String name;
    String department;
    double salary; //instance variables
    Employee(int empId,String name,String department,double salary){
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
   void showDetails(){
        System.out.println("Employee Details");
        System.out.println("EmpId: "+this.empId);
        System.out.println("Name: "+this.name);
        System.out.println("Department: "+this.department);
        System.out.println("Salary: "+this.salary);
    }
}
public class Q9 {
    public static void main(String[] args){
         Employee emp = new Employee(1, "Raja", "CSE", 50000);
         emp.showDetails();
    }
}
