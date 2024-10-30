//import java.util.Arrays;
import java.util.Scanner;
public class A8Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.print("Enter number of element: ");
		int [] n = new int[sc.nextInt()];
		
		for( int i = 0; i < n.length; i++) {
			n[i] = sc.nextInt();
			sum += n[i];
		}
		double average = sum/n.length;
		
		System.out.println("Sum = "+sum);
		System.out.println("Average = "+average);
//		System.out.println(Arrays.toString(n));
		
		sc.close();
	}

}
