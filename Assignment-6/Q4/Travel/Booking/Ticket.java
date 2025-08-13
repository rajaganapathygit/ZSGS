/* 4. Design a travel booking system using two packages:`travel.booking – includes a class`Ticket with ticket ID, destination, and fare.`travel.user – includes a class`User with user details and a method to book a ticket.
Illustrate accessing ticket data from within the user class.*/

package travel.booking;

public class Ticket{
	public int ticketId;
	public String destination;
	public double fare;

	public Ticket(int ticketId,String destination,double fare){
		this.ticketId = ticketId;
		this.destination = destination;
		this.fare = fare;
	}

	public void display(){
		System.out.println("Ticket Id: "+ticketId);
		System.out.println("Destination: "+destination);
		System.out.println("Fare: "+fare);
	}
}