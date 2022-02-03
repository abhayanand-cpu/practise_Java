import java.util.Scanner;
import java.lang.Math;
public class Cylinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner cylinder = new Scanner(System.in);
        System.out.println("Enter the radius and length of a cylinder: ");
        double radius,length;
        radius = cylinder.nextFloat();
        length = cylinder.nextFloat();
        double area = radius*radius*(Math.PI),volume = (area*length);
        System.out.println("The area is "+area+"\nThe volume is "+volume);
        cylinder.close();
    }

}
