/* 3. A class Point is declared as follows:
class Point{
public:
Point(){int=0;int=0;} //default constructor
void setPoint(int,int); //set coordinates
int getX() const {return x;} //get x coordinates
int getY() const {return y;} //get y coordinates
void printPoint(); // print (x,y) coordinates
private int x;
private int y;
};
Write the implementation of the class Point in the same file.
Then, declare a class called Circle that is derived from the class Point. The class Circle has public member functions Circle (constructor), setRadius(), getRadius() and area() and one private data member radius. The class Circle indirectly uses private member x and y of class Point to store the coordinate of the center of the circle. The class Circle also checks to make sure the radius value is a positive number, otherwise it is set to default value 1.
Note: The private members of class Point can only be indirectly accessed by class Circle using public methods of class point.
Implement the class Circle and write a driver program to test the class Circle. An example of the output of the driver program is.
Enter x: 2
Enter y: 2
Enter radius: 1
Circle center is (2,2)
Radius is 1
Area is 3.14*/


class Point{
	private int x;
	private int y;
	Point(){
		int x = 0;
		int y = 0;
	}
	public  void setPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	public int getX(){
		return x;
	}
	public  int getY(){
		return y;
	}
	public void printPoint(){
		System.out.println("Enter X: "+getX());
		System.out.println("Enter Y : "+getY());
	}
}

class Circle extends Point{
	private int radius;
	Circle(){
		int radius = 1;
	}

	public  void setRadius(int x,int y,int radius){
		super.setPoint(x,y);
		if(radius>0){
			this.radius = radius;
		}
		else{
			this.radius = 1;
		}
		
	}
	public int getRadius(){
			return radius;
	}

	public  double area(){
		return 3.14*radius*radius;
	}
	public void printPoint(){
		super.printPoint();
		System.out.println("Enter radius: "+radius);
		System.out.println("Circle Centre is ("+getX()+","+getY()+")");
		System.out.println("Radius is "+radius);
		System.out.println("Area is "+area());
	}
}
public class Q3{
	public static void main(String[] args){
		Circle c1 = new Circle();
		c1.setRadius(2,2,0);
		c1.printPoint();
		
		c1.setRadius(2,3,3);
		c1.printPoint();
	}
}	