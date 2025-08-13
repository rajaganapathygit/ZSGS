//1. Create a class named 'Student' with a string variable 'name' and an integer variable 'roll_no'. 
//Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.

class Student{
        String name;
        int roll_no;
    }
public class Q1 {
    
    public static void main(String[] args){
        Student std1 = new Student();
        std1.name="John";
        std1.roll_no=2;
        System.out.println("Student Name: "+std1.name);
        System.out.println("Student Roll_no: "+std1.roll_no);
    }
}
