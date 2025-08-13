/* 2. Create a class named Student that has the following attributes:
name (String)
roll_no (int)
phone_no (int)
address (String)
Create a constructor Student(String name, int roll_no, int phone_no, String address) and 
store and display the details for two students having names "Sam" and "John" respectively.*/

class Student {
    String name;
    int roll_no;
    String phone_no;
    String address;
    Student(String name,int roll_no,String phone_no,String address){
        this.name = name;
        this.roll_no = roll_no;
        this.phone_no = phone_no;
        this.address = address;
    }
    void display(){
        System.out.println("\nStudent Details: ");
        System.out.printf("Name: "+this.name+"\nRoll_no: "+this.roll_no+"\nPhone_no: "+this.phone_no+"\nAddress: "+this.address);
    }
    public static void main(String[] args){
        Student std1 = new Student("Sam",1,"9876543210","28, Kamarajar Street, Chennai");
        Student std2 = new Student("John",2,"5678943210","17, Ranganathan theru, Mecheri");
        std1.display();
        std2.display();
    }
}
