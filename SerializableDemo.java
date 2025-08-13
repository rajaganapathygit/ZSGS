
import java.io.*;

class Product implements Serializable{
    int productId;
    String productName;
    int quantity;
    double price;

    Product(int productId,String productName,int quantity,double price){
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public String toString(){
        return "\nProduct Id: "+productId+"\nProduct Name: "+productName+"\nQuantity: "+quantity+"\nPrice: "+price;
    }
}
 public class SerializableDemo {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        try{
            Product p1 = new Product(1,"Shampoo",1,150);
            FileOutputStream fos = new FileOutputStream("file1.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(p1);
            oos.close();
            fos.close();
            System.out.println("Serialization done");
        }catch(Exception e){
            e.printStackTrace();
        }
        try{
            FileInputStream fis = new FileInputStream("file1.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Product p2 = (Product) ois.readObject();
            ois.close();
            fis.close();
            System.out.println("Deserialized object: "+p2.toString());
        }catch(Exception e){
                e.printStackTrace();
        }
    }
}
