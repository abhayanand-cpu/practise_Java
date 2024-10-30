//import java.util.Arrays;
import java.util.Scanner;
public class A8Q12 {
	static void Selection( double[] arr ) {
		int l = arr.length;
		
		for( int i = 0; i < l - 1; i++ ) {
			double smallest = arr[i];
			double swap = 0;
			int jval = 0;
			for( int j = i; j < l; j++ ) {
				if( arr[j] <= smallest ) {
					smallest = arr[j];
					jval = j;
				}
			}
			swap = arr[i];
			arr[i] = smallest;
			arr[jval] = swap;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of desired element: ");
		int n = sc.nextInt();
		double arr[] = new double[n];
		System.out.print("Enter "+n+" elements: ");
		for( int i = 0; i < n; i++ ) {
			double element = sc.nextDouble();
			arr[i] = element;
		}
		Selection(arr);
//		System.out.println(Arrays.toString(arr));
		System.out.print("Your sorted elements are: ");
		for( int i = 0; i < n; i++ ) {
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}

}
