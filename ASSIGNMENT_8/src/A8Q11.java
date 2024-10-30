import java.util.Scanner;
public class A8Q11 {
	
	static void Sorting( double[] n ) {
		int l = n.length - 1;
		for( int i = 0; i < l; i++ ) {
			double swap = 0;
			for( int j = 0; j < l - i; j++ ) {
				if( n[j] > n[j+1] ) {
					swap = n[j];
					n[j] = n[j+1];
					n[j+1] = swap;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double n[] = new double[10];
		
		System.out.print("Enter ten elements: ");
		for( int i = 0; i < n.length; i++ ) {
			double element = sc.nextDouble();
			n[i] = element;
		}
		Sorting(n);
		System.out.print("Your sorted elements are: ");
		for( int i = 0; i < n.length; i++ ) {
			System.out.print(n[i]+" ");
		}
		
		sc.close();
	}

}
