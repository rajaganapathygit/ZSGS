/* 5. Develop a Java application for a Ticket Booking System that allows users to book tickets 
for different types of transportation modes such as Bus, Train, and Flight.Define a common 
interface or abstract class`Ticket with a method`bookTicket() that each transportation mode 
must implement differently.Create classes`BusTicket,`TrainTicket, and`FlightTicket that extend 
the abstract class or implement the interface.Demonstrate runtime polymorphism by calling the
`bookTicket() method using a reference of the base class/interface. */

import java.util.Scanner;

interface Ticket{
	
	abstract double bookTicket();

}

class BusTicket implements Ticket{
	
	String name;
	String from;
	String to;
	String date;
	String type;

	BusTicket(String name,String from, String to, String date,String type){
		this.name = name;
		this.from = from;
		this.to = to;
		this.date = date;
		this.type = type;
	}

	public double bookTicket(){
		if(type.equals("Normal")){
			return 250;
		}
		else if(type.equals("Semi-Sleeper")){
			return 500;
		}
		else{
			return 900;
		}
	}

	public String toString(){
		return "\nName: "+name+"\nFrom: "+from+"\nTo: "+to+"\nDate: "+date+"\nFare: "+bookTicket()+"\nTicket booked Successfully !";
	}
}

class TrainTicket extends BusTicket implements Ticket{

	TrainTicket(String name,String from, String to, String date,String type){
		super(name,from,to,date,type);
	}

	public double bookTicket(){
		if(type.equals("First Class")){
			return 1500;
		}
		else if(type.equals("Second Class")){
			return 1000;
		}
		else{
			return 500;
		}
	}


}

class FlightTicket extends BusTicket implements Ticket{

	FlightTicket(String name,String from, String to, String date,String type){
		super(name,from,to,date,type);
	}

	public double bookTicket(){
		if(type.equals("Business")){
			return 10000;
		}
		else if(type.equals("Economy")){
			return 5000;
		}
		else{
			return 3000;
		}
	}

}

public class Q5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("From: ");
		String from = sc.nextLine();
		System.out.print("To: ");
		String to = sc.nextLine();
		System.out.print("Date: ");
		String date = sc.nextLine();
		System.out.print("""
			Mode of Transport: 
			1. Bus
			2. Train
			3. Flight 
			Choose which mode you have to choose? """);
		int choice = sc.nextInt();
		sc.nextLine();
		if(choice == 1){
			System.out.print("""
				Type:
				1. Normal
				2. Semi-Sleeper
				3. Others
				Enter your convenient type to travel: """);
			String type = sc.nextLine();
			BusTicket passenger1 = new BusTicket(name,from,to,date,type);
			System.out.println(passenger1.toString());
		}
		else if(choice == 2){
			System.out.print("""
				Type:
				1. First Class
				2. Second Class
				3. Others
				Enter your convenient type to travel: """);
			String type = sc.nextLine();
			TrainTicket passenger1 = new TrainTicket(name,from,to,date,type);
			System.out.println(passenger1.toString());
		}
		else if(choice == 3){
			System.out.print("""
				Type:
				1. Business
				2. Economy
				3. Others
				Enter your convenient type to travel: """);
			String type = sc.nextLine();
			FlightTicket passenger1 = new FlightTicket(name,from,to,date,type);
			System.out.println(passenger1.toString());
		}

	}
}