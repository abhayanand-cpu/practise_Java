import java.util.Scanner;
abstract class Shape{
	public abstract double Area();
}

class Square extends Shape{
	
	double SideSquare;
	
	Square(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Side of a Square: ");
		SideSquare = sc.nextDouble();
	}
	
	public double Area() {
		return SideSquare*SideSquare;
	}

}
 
class Triangle extends Shape{
	
	static Scanner sc = new Scanner(System.in);
	double SideTriangle1;
	double SideTriangle2;
	double SideTriangle3;
	double s,area;
	
	Triangle(){
		System.out.print("Enter 1st Side of a Triangle: ");
		SideTriangle1 = sc.nextDouble();
		System.out.print("Enter 2nd Side of a Triangle: ");
		SideTriangle2 = sc.nextDouble();
		System.out.print("Enter 3rd Side of a Triangle: ");
		SideTriangle3 = sc.nextDouble();
	}
	
	public double Area() {
		s = (SideTriangle1+SideTriangle2+SideTriangle3)/2;
		return area = Math.sqrt(s*(s-SideTriangle1)*(s-SideTriangle2)*(s-SideTriangle3));
	}
	
}

class Circle extends Shape{
	double radius;
	double Area;
	
	Circle(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius of a circle: ");
		radius = sc.nextDouble();
	}
	
	public double Area() {
		return Area = Math.PI*radius*radius;
	}
	
}
public class A2Q6 {
	
	public static void main(String[] args) {
		Square s = new Square();
		System.out.println("Area of square is: "+s.Area());
		
		Triangle t = new Triangle();
		System.out.println("\nArea of Triangle is: "+t.Area());
		
		Circle c = new Circle();
		System.out.println("\nArea of Circle is: "+c.Area());
	}

}
