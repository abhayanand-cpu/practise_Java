import java.util.Scanner;
public class A8Q6 {
	
	static void Reversal( int [] a , int n) {
		
		int i = 0;
		int j = n-1;
		
		while( i < j ) {
			int swap = a[i];
			a[i] = a[j];
			a[j] = swap;
			i++;
			j--;
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the no. of elements: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		
		System.out.print("Enter "+n+" elements: ");
		for( int i = 0; i < n; i++ ) {
			int element = sc.nextInt();
			a[i] = element;
		}
		
		Reversal( a , n );
		System.out.print("Reversed array: ");
		for( int i = 0; i < n; i++ ) {
			System.out.print(a[i]+" ");
		}
		
		
		sc.close();
	}

}
