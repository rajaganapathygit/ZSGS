/* 7. Design a calculator application using Java Inheritance.
‌
Create the following class hierarchy:
‌
--->BasicCalculator (Base class):
Implement at least three basic arithmetic methods, such as:
‌
--->add(int a, int b)
--->subtract(int a, int b)
--->multiply(int a, int b)
--->divide(int a, int b)
‌
--->AdvancedCalculator (Inherits from BasicCalculator):
Add 3 to 4 advanced mathematical operations, such as:
‌
--->power(int base, int exponent)
--->modulus(int a, int b)
--->squareRoot(double number)
‌
--->ScientificCalculator (Inherits from AdvancedCalculator):
Add scientific functions, such as:
‌
--->sin(double angle)
--->cos(double angle)
--->log(double value)
--->exp(double value)
* Demonstrate the use of inheritance by creating an object of ScientificCalculator and calling methods from all three levels of the class hierarchy.
* Use appropriate access specifiers and method overrides where required.
* Add a main() method to test all operations.*/


class BasicCalculator{

	int add(int a, int b){
		return a+b;
	}
	int subtract(int a,int b){
		return a-b;
	}
	int multiply(int a,int b){
		return a*b;
	}
	int divide(int a, int b){
		return a/b;
	}
}
class AdvancedCalculator extends BasicCalculator{
	
		int power(int base,int exponent){ 
			int result = 1;
			for(int i=1;i<=exponent;i++){
				result = result * base;
			}
			return result;
		}
		int modulus(int a,int b){
			return a%b;
		}
		double squareRoot(double number){
			return Math.sqrt(number);
		}
}

class ScientificCalculator extends AdvancedCalculator{

	double sin(double angle){
		double radians = Math.toRadians(angle);
		return Math.sin(radians);
	}
	double cos(double angle){
		double radians = Math.toRadians(angle);
		return Math.cos(radians);
	}
	double log(double value){
		return Math.log(value);
	}
	double exp(double value){
		return Math.exp(value);
	}
}
public class Q7{
	public static void main(String[] args){
		ScientificCalculator cal = new ScientificCalculator();
		System.out.println("ADD(3,5): "+cal.add(3,5));
		System.out.println("SUB(10,2): "+cal.subtract(10,2));
		System.out.println("MULTIPLY(5,4): "+cal.multiply(5,4));
		System.out.println("DIVIDE(10,2): "+cal.divide(10,2));
		System.out.println("POWER(3,4): "+cal.power(3,4));
		System.out.println("MODULUS(31,4): "+cal.modulus(31,4));
		System.out.println("SQRT(47): "+cal.squareRoot(47));
		System.out.println("SIN(45 degree): "+cal.sin(45));
		System.out.println("COS(45 degree): "+cal.cos(45));
		System.out.println("LOG(2): "+cal.log(2));
		System.out.println("EXP(3): "+cal.exp(3));

	}
}