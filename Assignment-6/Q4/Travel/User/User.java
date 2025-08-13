/* 4. Design a travel booking system using two packages:`travel.booking – includes a class`Ticket with ticket ID, 
destination, and fare.`travel.user – includes a class`User with user details and a method to book a ticket.
Illustrate accessing ticket data from within the user class.*/

package travel.user;
import travel.booking.Ticket;

public class User{
	String name;
	int age;
	String gender;

	public User(String name, int age, String gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public void bookTicket(){
		Ticket ticket = new Ticket(1,"Chennai",250);
		System.out.println("Ticket booked Successfully");
		ticket.display();
	}
}