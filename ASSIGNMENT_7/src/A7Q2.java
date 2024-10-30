class Rectangle{
	double width;
	double height;
	
	Rectangle(){
		 width = 1;
		 height = 1;
	}
	
	Rectangle( double w, double h ){
		 width = w;
		 height = h;
	}
	
	double getArea( double width , double height ) {
		return width * height;
	}
	
	double getPerimeter( double w, double h ) {
		return 2 * ( width + height );
	}
	
	
}
public class A7Q2 {

	public static void main(String[] args) {
		Rectangle obj1 = new Rectangle( 4.0 , 40.0 );
		System.out.printf("RECTANGLE 1%nWidth = %s%nHeigth = %s%n",obj1.width,obj1.height);
		System.out.println("Area of rectangle: "+obj1.getArea( 4 , 40 ));
		System.out.println("Perimeter of rectangle: "+obj1.getPerimeter( 4 , 40 ));
		
		Rectangle obj2 = new Rectangle( 3.5, 35.9 );
		System.out.printf("%nRECTANGLE 2%nWidth = %s%nHeigth = %s%n",obj2.width,obj2.height);
		System.out.println("Area of rectangle: "+obj2.getArea(3.5, 35.9));
		System.out.println("Perimeter of rectangle: "+obj2.getPerimeter(3.5, 35.9));
		
	}

}
