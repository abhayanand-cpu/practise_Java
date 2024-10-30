import java.util.Scanner;
public class A6Q8 {
	
	public static double area(int n, double side) {
		return (n*side*side)/(4*Math.tan(Math.PI/n));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of sides: ");
		int n = sc.nextInt();
		System.out.print("Enter the side: ");
		double side = sc.nextDouble();
		
		System.out.print("The area of the polygon is "+area( n , side ));
		sc.close();
	}

}
