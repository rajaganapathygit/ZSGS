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