/* 1. We want to store the information about different vehicles. Create a class named Vehicle with two data member named mileage and price. Create its two subclasses
---Car with data members to store ownership cost, warranty (by years), seating capacity and fuel type (diesel or petrol).
---Bike with data members to store the number of cylinders, number of gears, cooling type(air, liquid or oil), wheel type(alloys or spokes) and fuel tank size(in inches)
Make another two subclasses Audi and Ford of Car, each having a data member to store the model type.
Next, make two subclasses Bajaj and TVS, each having a data member to store the make-type.
Now, store and print the information of an Audi and a Ford car (i.e. model type, ownership cost, warranty, seating capacity, fuel type, mileage and price.) Do the same for a Bajaj and a TVS bike.*/

class Vehicle{
	double mileage;
	double price;
	Vehicle(double mileage,double price){
		this.mileage = mileage;
		this.price = price;
	}
	void display(){
		System.out.println("Mileage: "+mileage);
		System.out.println("Price: "+price);
	}
}
class Car extends Vehicle{
	double ownershipCost;
	int warrantyYears;
	int seatingCapacity;
	String fuelType;
	Car(double mileage,double price,double cost,int years, int capacity, String fuelType ){
		super(mileage,price);
		this.ownershipCost = cost;
		this.warrantyYears = years;
		this.seatingCapacity = capacity;
		this.fuelType = fuelType;
	}
	void display(){
		super.display();
		System.out.println("Ownership Cost: "+ownershipCost);
		System.out.println("Warranty Years: "+warrantyYears);
		System.out.println("Seating Capacity: "+seatingCapacity);
		System.out.println("Fuel Type: "+fuelType);
	}
}
class Bike extends Vehicle{
	int noOfCylinders;
	int noOfGears;
	String coolingType;
	String wheelType;
	double tankSize;
	Bike(double mileage,double price,int cylinder,int gear, String coolingType, String wheelType, double tankSize){
		super(mileage,price);
		this.noOfCylinders = cylinder;
		this.noOfGears = gear;
		this.coolingType = coolingType;
		this.wheelType = wheelType;
		this.tankSize = tankSize;
	}
	void display(){
		super.display();
		System.out.println("Number of Cylinders: "+noOfCylinders);
		System.out.println("Number of Gears: "+noOfGears);
		System.out.println("Cooling Type: "+coolingType);
		System.out.println("Wheel Type: "+wheelType);
		System.out.println("Tank Size: "+tankSize);
	}
}
class Audi extends Car{
	String modelType;
	Audi(double mileage,double price,double cost,int years, int capacity, String fuelType,String model){
		super(mileage,price,cost,years,capacity,fuelType);
		this.modelType = model;
	}
	void display(){
		super.display();
		System.out.println("Model Type: "+modelType);
		System.out.println("----------------------------------------------------------");
	}

}
class Ford extends Car{
	String modelType;
	Ford(double mileage,double price,double cost,int years, int capacity, String fuelType,String model){
		super(mileage,price,cost,years,capacity,fuelType);
		this.modelType = model;
	}
	void display(){
		super.display();
		System.out.println("Model Type: "+modelType);
		System.out.println("----------------------------------------------------------");
	}

}
class Bajaj extends Bike{
	String makeType;
	Bajaj(double mileage,double price,int cylinder,int gear, String coolingType, String wheelType, double tankSize,String type){
		super(mileage,price,cylinder,gear,coolingType,wheelType,tankSize);
		this.makeType = type;
	}
	void display(){
		super.display();
		System.out.println("Make Type: "+makeType);
		System.out.println("----------------------------------------------------------");
	}
}
class Tvs extends Bike{
	String makeType;
	Tvs(double mileage,double price,int cylinder,int gear, String coolingType, String wheelType, double tankSize,String type){
		super(mileage,price,cylinder,gear,coolingType,wheelType,tankSize);
		this.makeType = type;
	}
	void display(){
		super.display();
		System.out.println("Make Type: "+makeType);
		System.out.println("----------------------------------------------------------");
	}
}
public class Q1{
	public static void main(String[] args){
	Audi car1 = new Audi(500.0,10000.0,100,5,6,"Petrol","Sedans");
	car1.display();
	Ford car2 = new Ford(1000.0,100000.0,500,3,8,"Diesel","Ford-Mondeo");
	car2.display();
	Bajaj bike1 = new Bajaj(300.0,120000,3,3,"Air","Spokes",4.5,"Bajaj-Scooters");
	bike1.display();
	Tvs bike2 = new Tvs(400.0,1500000,4,3,"Liquid","Alloys",5.8,"TVS-Motors");
	bike2.display();

	}
}
