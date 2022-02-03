import java.util.Scanner;
public class Q_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter three points for a triangle: ");
		float x1 = sc.nextFloat() , y1 = sc.nextFloat();
		float x2 = sc.nextFloat() , y2 = sc.nextFloat();
		float x3 = sc.nextFloat() , y3 = sc.nextFloat();
		double side1 = Math.pow(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2), 0.5);
		double side2 = Math.pow(Math.pow(x3-x2, 2)+Math.pow(y3-y2, 2), 0.5);
		double side3 = Math.pow(Math.pow(x1-x3, 2)+Math.pow(y1-y3, 2), 0.5);
		double s = (side1+side2+side3)/2;
		double area = Math.pow(s*(s-side1)*(s-side2)*(s-side3), 0.5);
		System.out.print("The area of a triangle is: "+area);
		sc.close();
	}

}
