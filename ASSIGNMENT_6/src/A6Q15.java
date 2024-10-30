import java.util.Scanner;
public class A6Q15 {
	
	void area( float b, float h ) {
		double AreaOfTriangle = 1/2.0*b*h;
		System.out.println("Area of a triangle is: "+AreaOfTriangle);
	}
	
	void area( double s ) {
		double AreaOfSquare = s*s;
		System.out.println("Area of a square is: "+AreaOfSquare);
	}
	
    void area( float r ) {
    	double AreaOfCircle = Math.PI*r*r;
    	System.out.println("Area of a circle is: "+AreaOfCircle);
	}

	void area( double l, double w ) {
		double AreaOfRectangle = l*w;
		System.out.println("Area of a rectangle is: "+AreaOfRectangle);
	}
	
    public static void main(String[] args) {
    	A6Q15 tri = new A6Q15();
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.print("Enter the base and height of a triangle: ");
    	float base = sc.nextFloat();
    	float height = sc.nextFloat();
    	System.out.print("Enter the side of a square: ");
    	double side = sc.nextDouble();
    	System.out.print("Enter the radius of a circle: ");
    	float radius = sc.nextFloat();
    	System.out.print("Enter length and width of a rectangle: ");
    	double length = sc.nextDouble();
    	double width = sc.nextDouble();
		
		tri.area(base,height);
		tri.area(side);
		tri.area(radius);
		tri.area(length,width);
		
		sc.close();
	}

}
