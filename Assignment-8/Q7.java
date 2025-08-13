// 7. Develop a Java program to illustrate the usage of toString() method.

class Product{
	int productId;
	String productName;
	double price;

	Product(int productId,String productName,double price){
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}

	public String toString(){
		return "\n Product Id: "+productId+"\n Product Name: "+productName+"\n Price: "+price;
	}
}

public class Q7{
	public static void main(String[] args){
		Product p1 = new Product(1,"Mosquito Bat",590);
		System.out.println(p1.toString());
	}
}