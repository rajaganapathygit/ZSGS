//2. Can we override private method, constructor, static method, final method? 
//Illustrate with an example.

class ZSGS{
	String name;
	String category;
	ZSGS(String name, String category){ //constructor
		this.name = name;
		this.category = category;
	}
	private void display(){ //private method
		System.out.println("Display is a private method.");
	}
	final void stipend(){ // final method
		System.out.println("10000 is the stipend for the ZSGS Schools");
	}
	static void duration(){ // static method
		System.out.println("2 Years is the duration for ZSGS");
	}
}

class Graduates extends ZSGS{
	int age;
	Graduates(String name,String category, int age){
		super(name,category);
		this.age = age;
	}
	private void display(){
		System.out.println("Graduates is the extended version of ZSGS");
	}
	void stipend(){
		System.out.println("There is no stipend for Graduates");
	}
	void duration(){
		System.out.println("6 month is the duration for Graduates");
	}

}

public class Q2{
	public static void main(String[] args){
		Graduates  student1 = new Graduates("Raja","Graduates",21);
		student1.display();
		student1.stipend();
		student1.duration();
	}
}