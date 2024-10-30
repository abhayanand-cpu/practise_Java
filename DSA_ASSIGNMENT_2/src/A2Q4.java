import java.util.Scanner;
class PointType{
	double x,y;

	void setX( double x ) {
		this.x = x;
	}
	
	void setY( double y ) {
		this.y = y;
	}
	
	double getX() {
		return x;
	}
	
	double getY() {
		return y;
	}
	
	void SetCoordinates() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x: ");
		x = sc.nextInt();
		System.out.print("Enter y: ");
		y = sc.nextInt();
		setX(x);
		setY(y);
	}
	
	void ShowCoordinates() {
		System.out.println("X-Coordinate: "+x);
		System.out.println("Y-Coordinate: "+y);
	}
	
}

class CircleType extends PointType{
	double radius;
	double area;
	double circumference;
	
	void SetRadius( PointType p1, PointType p2 ) {
		radius = Math.sqrt(Math.pow(p2.x-p1.x, 2) + Math.pow(p2.y-p1.y, 2));
	}
	
	void ShowRadius() {
		System.out.println("Radius: "+radius);
	}
	
	void area() {
		area = Math.PI*radius*radius;
		System.out.println("Area: "+area);
	}
	
	void circumference() {
		circumference = 2*Math.PI*radius;
		System.out.println("Circumference: "+circumference);
	}
}

public class A2Q4 {

	public static void main(String[] args) {
		CircleType c = new CircleType();
		c.SetCoordinates();
		PointType p = new PointType();
		p.SetCoordinates();
		c.SetRadius(c, p);
		c.area();
		c.circumference();
	}

}
