//4. Design a Java Ticket Booking System using polymorphism where Bus, Train, and Flight tickets share a common method but implement booking differently.

class Booking{
	String currentLocation;
	String destinationLocation;
	String passengerName;
	double price;

	Booking(String currentLocation,String destinationLocation, String passengerName){
		this.currentLocation = currentLocation;
		this.destinationLocation = destinationLocation;
		this.passengerName = passengerName;
	}


	void display(){
		System.out.println("Passenger Name: "+passengerName);
		System.out.println("Current Location: "+currentLocation);
		System.out.println("Destination Location: "+destinationLocation);
		System.out.println("Price: "+ price);
	}
}

class Bus extends Booking{
	
	Bus(String currentLocation,String destinationLocation, String passengerName){
		super(currentLocation,destinationLocation,passengerName);
	}
	void ticketBooking(){
		 price = 500;
	}

	
}

class Train extends Booking{

	Train(String currentLocation,String destinationLocation, String passengerName){
		super(currentLocation,destinationLocation,passengerName);
	}
	
	void ticketBooking(){
		 price = 250;
	}
}

class Flight extends Booking{

	Flight(String currentLocation,String destinationLocation, String passengerName){
		super(currentLocation,destinationLocation,passengerName);
	}
	
	void ticketBooking(){
		 price = 1000;
	}
}

public class Q4{
	public static void main(String[] args){
		Bus t1 = new Bus("Chennai","Kanchipuram","Raja");
		t1.ticketBooking();
		t1.display();

		Train t2 = new Train("Salem","Kanchipuram","Pugal");
		t2.ticketBooking();
		t2.display();

		Flight t3 = new Flight("Pune","Chennai","Sweetha");
		t3.ticketBooking();
		t3.display();
	}
}