/* 5. Design a Java application to manage a product inventory system using file handling and object serialization.
Create a class Product with the following attributes:
--->int productId
--->String name
--->double price
--->int quantity
a. Ensure the class implements the Serializable interface.
b. Methods:
--->Add a Product: Accept product details from the user and write the object to a file (products.dat).
--->View All Products: Read all product objects from the file and display them.
--->Search Product by ID: Search for a product by productId in the file and display its details if found.
--->Update Product: Locate a product in the file using the ID, update its price or quantity, and save the changes back to the file.
--->Delete Product: Remove a product object from the file by ID (involves rewriting the file).
--->Use proper exception handling and ensure that object serialization and deserialization are handled safely and efficiently.*/

import java.util.*;
import java.io.*;

class Product implements Serializable{
    int productId;
    String name;
    double price;
    int quantity;


    Product(int productId,String name,double price, int quantity){
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String toString(){
        return "Product Id: "+productId+"\n Product Name: "+name+"\n Price: "+price+"\n Quantity: "+quantity;
    }
}

class ProductManager{
    private static final String FILE_NAME = "product.dat";

    public List<Product> readProducts(){
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))){
            return (ArrayList<Product>)ois.readObject();
        }catch(Exception e){
            return new ArrayList<>();
        }
    }

    public void writeProducts(List<Product> list){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))){
            oos.writeObject(list);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void addProduct(Product p){
        List<Product> list = readProducts();
        list.add(p);
        writeProducts(list);
    }

    public void displayProduct(){
        List<Product> list = readProducts();
        for(Product p:list){
            System.out.println(p);
            System.out.println("----------------------------------------------");
        }
    }

    public void search(int id){
        List<Product> list = readProducts();
        for(Product p: list){
            if(p.productId==id){
                System.out.println(p);
                return;
            }
        }
        System.out.println("No Product Found");
    }

    public void update(int id,double price, int quantity){
        List<Product> list = readProducts();
        for(Product p: list){
            if(p.productId==id){
                p.price = price;
                p.quantity = quantity;
            }
        }
        writeProducts(list);
    }

    public void delete(int id){
        List<Product> list = readProducts();
        list.removeIf(p->(p.productId==id));
        writeProducts(list);
    }
}

public class Q5{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        ProductManager pm = new ProductManager();
        boolean flag = true;
        while(flag){
            System.out.print("""
                    ------------------Menu--------------
                    1. Add Products
                    2. Display Products
                    3. Search Product
                    4. Update Product
                    5. Delete Product
                    6. Exit
                    Enter the operation you need to perform: """);
            int option = sc.nextInt();
            switch(option){
                case 1: System.out.print("Enter the ProductId: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter the ProductName: ");
                        String name = sc.nextLine();
                        System.out.print("Enter the price: ");
                        double price = sc.nextDouble();
                        System.out.print("Enter the quantity: ");
                        int quantity = sc.nextInt();
                        Product p = new Product(id,name,price,quantity);
                        pm.addProduct(p);
                        break;
                case 2: pm.displayProduct();
                        break;
                case 3: System.out.print("Enter the id to search: ");
                        int pid = sc.nextInt();
                        pm.search(pid);
                        break;
                case 4: System.out.print("Enter the id to update: ");
                        int upid = sc.nextInt();
                        System.out.print("Enter the new Price: ");
                        double newPrice = sc.nextDouble();
                        System.out.print("Enter the new Quantity: ");
                        int newQuantity = sc.nextInt();
                        pm.update(upid,newPrice,newQuantity);
                        break;
                case 5: System.out.print("Enter the id to delete: ");
                        int rid = sc.nextInt();
                        pm.delete(rid);
                        break;
                case 6: System.out.println("Successfully done");
                        System.exit(0);
                        break;
                default: flag = false;
                        System.out.println("Invalid Operations");
            }
        }
    }
}

