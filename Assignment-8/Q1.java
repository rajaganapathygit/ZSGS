//1. Illustrates with an example of using Singleton class.

class Singleton{
	
	private Singleton(){}//private Constructor

	private static Singleton instance;//Declaration of the Object for the class

	public static Singleton getInstance(){
		if(instance == null){
			instance = new Singleton();
		}
		return instance;
	}

	public  void message(String message){
		System.out.println("Message: "+message);;
	}
}

public class Q1{
	public static void main(String[] args){
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		instance1.message("Instance 1 is created");
		instance2.message("Instance 2 is created");

		System.out.println(instance1==instance2);

	}
}