import java.util.Scanner;
class Rectangle{
	double length,width;
	
	void Getdata(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length: ");
		length = sc.nextDouble();
		System.out.print("Enter width: ");
		width = sc.nextDouble();
	}
	
	void display() {
		System.out.println("Length of a rectangle is "+length);
		System.out.println("Width of a rectangle is "+width);
	}
	
	double CalculateArea() {
		return length * width;
	}
	
	double CalculatePerimeter() {
		return 2 * ( length + width );
	}
	
}
public class DSA1 {

	public static void main(String[] args) {
		Rectangle obj = new Rectangle();
		obj.Getdata();
		obj.display();
		System.out.println(obj.CalculateArea());
		
		Rectangle obj2 = new Rectangle();
		obj2.Getdata();
		obj2.display();
		System.out.println(obj2.CalculatePerimeter());
	}

}
