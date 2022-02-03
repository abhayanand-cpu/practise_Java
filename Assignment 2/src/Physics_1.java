import java.util.Scanner;
import java.lang.Math;
public class Physics_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       double time,equation;
       System.out.print("Enter time in Second: ");
       time = sc.nextDouble();
       equation = 0.090*Math.pow(time, 2)-0.899*Math.pow(time, 1)+2.817;
       System.out.print("Position in meter is "+equation);
       sc.close();
	}

}
