import java.util.Scanner;
//import java.lang.Math;
public class Q_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner hexagonal = new Scanner(System.in);
       double side,area;
       System.out.print("Enter the side: ");
       side = hexagonal.nextDouble();
       area = (3*1.732*side*side)/2;
       //area = (3*Math.sqrt(3)*Math.pow(side,2))/2;
       System.out.println("The area of hexagon is "+area);
       hexagonal.close();
	}

}
