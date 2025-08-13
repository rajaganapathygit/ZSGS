/* 2. Construct a base class called twoD contains x and y and methods to read and write the x and y. Create another class called threeD which is derived from twoD and also contains z and write methods to read and write z. Also write a method to find the distance of two threeD Points.
sqrt((x2-x1)^2+(y2-y1)^2+(z2-z1)^2)
In main:
Create one ThreeD object using the default constructor.
Use the setters to set x, y, and z.
Create the second ThreeD object using the constructor with three arguments.
in the TwoD class:
Add a cout statement to the TwoD default constructor with a message "TwoD default constructor"
Add a cout statement to other TwoD constructor with a message "TwoD constructor with two arguments"*/

class TwoD{
	private int x;
	private int y;
	TwoD(){
		System.out.println("TwoD default constructor");
	}
	TwoD(int x, int y){
		this.x = x;
		this.y = y;
		System.out.println("TwoD Constructor with two arguments"+x+ y);
	}
	void set(int x, int y){// need to write separate setX and setY
		this.x = x;
		this.y = y;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
}
class ThreeD extends TwoD{
	int z;
	ThreeD(){}
	ThreeD(int x, int y, int z){
		super();
		this.z = z;
	}
	void set(int x, int y, int z){
		super.set(x,y);
		this.z = z;
	}
	public int getZ(){
		super.getX();
		super.getY();
		return z;
	}
	void distance(int x1,int y1,int z1, int x2, int y2, int z2){
		int x = x2-x1;
		int y = y2-y1;
		int z = z2-z1;
		System.out.println("Distance between two threeD Points: "+ ((x*x)+(y*y)+(z*z)));
	}
}
public class Q2{
	public static void main(String[] args){
		ThreeD obj1 = new ThreeD();
		
		obj1.set(3,4,5);
		ThreeD obj2 = new ThreeD(2,3,4);
		System.out.println(obj2.getZ());
		TwoD obj3 = new TwoD();
		TwoD obj4 = new TwoD(6,8);
		obj1.distance(2,3,4,5,6,7);


	}
}