import java.util.Scanner;
public class A1Q6 {

	int SmallestNo( int arr[] ){
		int Smallest = arr[0];
		for ( int i = 1; i < arr.length; i++ ) {
			if( arr[i] < Smallest )
				Smallest = arr[i];
		}
		return Smallest;
	}

	int largestNo( int arr[] ){
		int Largest = arr[0];
		for ( int i = 1; i < arr.length; i++ ) {
			if( arr[i] > Largest )
				Largest = arr[i];
		}
		return Largest;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		A1Q6 obj = new A1Q6	();

		System.out.print("Enter the no. of element you wanna store: ");
		int n = sc.nextInt();
		int ar[] = new int[n];
		for ( int i = 0; i < n; i++ ) {
			System.out.print("Enter element: ");
			ar[i] = sc.nextInt();		
		}
		System.out.println("Smallest element of array: "+obj.SmallestNo(ar));
		System.out.println("Largest element of array: "+obj.largestNo(ar)+"\n");
		
		System.out.println("Smallest and largest number through pre-define method\n");
		int Small = ar[0];
		for ( int i = 1; i < n; i++ ) {
			Small = Math.min(Small, ar[i]);
		}
		
		int Large = ar[0];
		for ( int i = 1; i < n; i++ ) {
			Large = Math.max(Large, ar[i]);
		}
		
		System.out.println("Smallest element of array: "+Small);
		System.out.println("Largest element of array: "+Large);
		sc.close();
	}

}
