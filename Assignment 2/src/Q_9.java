import java.util.Scanner;
import java.lang.Math;
public class Q_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       double x1,y1,x2,y2,d;
      
       System.out.print("Enter x1 and y1: ");
       x1 = sc.nextDouble();
       y1 = sc.nextDouble();
       System.out.print("Enter x2 and y2: ");
       x2 = sc.nextDouble();
       y2 = sc.nextDouble();
       d = Math.pow((Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2)),0.5);
       System.out.print("The distance between two points is "+d);
       sc.close();
	} 

}
