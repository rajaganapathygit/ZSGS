/* 5. Design a simple inventory system in Java using object-oriented principles that 
demonstrates the use of static variables and object containment.
‌
Create two classes:
---Store
---Product
‌
Requirements:
The Store class should have:
a. storeName and storeLocation as static variables since they are common to all products 
in the store.
b. A static method setStoreDetails(String name, String location) to initialize the static variables.
c. A static method displayStoreDetails() to print store details.
d. A list to maintain multiple Product objects (i.e., the store contains many products).
e. A method addProduct(Product product) to add products to the store.
f. A method displayAllProducts() to display details of all products.
‌
The Product class should have:
a. Product ID, name, price, and quantity as instance variables.
b. A constructor to initialize these fields.
c. A method displayProduct() to show product details.
‌
Task:
Implement the above classes and demonstrate their use in the main() method by:
a. Setting store details once.
b. Creating multiple product objects.
c. Adding them to the store.
d. Displaying store and product information.
‌
Also Check how many .class files are generated.*/


import java.util.ArrayList;
import java.util.List;
class Store{
	static String storeName;
	static String storeLocation;
	List<Product> products = new ArrayList<>();
	static void setStoreDetails(String name, String location){
		storeName = name;
		storeLocation = location;
	}

	static void displayStoreDetails(){
		System.out.println("Store Details: ");
		System.out.println("Store Name: "+storeName);
		System.out.println("Store Location: "+storeLocation);
	}
	

	void addProduct(Product product){
		products.add(product);
	}

	void displayAllProducts(){
		for(Product p: products){
			System.out.println("Id: "+p.product_id);
			System.out.println("Name: "+p.name);
			System.out.println("Price: "+p.price);
			System.out.println("Quantity: "+p.quantity);
		}
	}
}

class Product{
	int product_id;
	String name;
	double price;
	int quantity;
	Product(int id, String name, double price, int quantity){
		this.product_id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	void displayProduct(){
		System.out.println("Product Details: ");
		System.out.println("Product Id: "+product_id);
		System.out.println("Name: "+name);
		System.out.println("Price: "+price);
		System.out.println("Quantity: "+quantity);
	}
}

public class Inventory{
	public static void main(String[] args){
		Store s1 = new Store();
		s1.setStoreDetails("RAJA's BAZAAR","CHENNAI");
		Product p1 = new Product(100,"SHAMPOO",500,2);
		Product p2 = new Product(200,"EAR BUDS",1000,1);
		s1.displayStoreDetails();
		s1.addProduct(p1);
		s1.addProduct(p2);
		s1.displayAllProducts();
		System.out.println("From Product Class: ");
		p1.displayProduct();
		p2.displayProduct();
	}
}