/*5. Create a class named Shape with a method that prints "This is a shape". 
Create another class named Polygon inheriting the Shape class with the same method 
that prints "Polygon is a shape". Create two other classes named Rectangle and Triangle having 
the same method which prints "Rectangle is a polygon" and "Triangle is a polygon" respectively. 
Again, make another class named Square having the same method which prints 
"Square is a rectangle".
Now, try calling the method by the object of each of these classes.*/

class Shape{
	void print(){
		System.out.println("This is a Shape");
	}
}
class Polygon extends Shape{
	void print(){
		System.out.println("Polygon is a Shape");
	}
}
class Rectangle extends Polygon{
	void print(){
		System.out.println("Rectangle is a Polygon");
	}
}
class Triangle extends Polygon{
	void print(){
		System.out.println("Triangle is a Polygon");
	}
}
class Square extends Rectangle{
	void print(){
		System.out.println("Square is a Rectangle");
	}
}
public class Q5{
	public static void main(String[] args){
		Shape s1 = new Shape();
		s1.print();
		Shape s2 = new Polygon();
		s2.print();
		Shape s3 = new Rectangle();
		s3.print();
		Shape s4 = new Triangle();
		s4.print();
		Shape s5 = new Square();
		s5.print();
	}
}