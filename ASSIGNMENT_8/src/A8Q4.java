
import java.util.Scanner;
public class A8Q4 {
	public static double min(double[] array) {
		
		double min = array[0];
		
		for( int i = 0; i < array.length; i++ ) {
			if( array[i] < min )
				min = array[i];
		}
		return min;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double array[] = new double[10];
		System.out.print("Enter 10 elements: ");
		for( int i = 0; i < array.length; i++ ) {
			double element = sc.nextDouble();
			array[i] = element;
		}
		
		System.out.println("Minimum value among the array: "+(min(array)));
		sc.close();
	}

}
