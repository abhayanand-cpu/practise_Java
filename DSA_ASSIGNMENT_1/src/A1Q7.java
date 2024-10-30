import java.util.Scanner;
public class A1Q7 {

	void check( int arr[] ){
		System.out.println("Pair of distinct elements of the array whose product is odd");
		for ( int i = 0; i < arr.length; i++ ) {
			for ( int j = 1; j < arr.length; j++ ) {
				if ( ((arr[i]*arr[j]) % 2 ) != 0 ) {
					System.out.println("("+arr[i]+","+arr[j]+")");
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		A1Q7 o = new A1Q7();

		System.out.print("Enter no. of element you wanna enter: ");
		int n = sc.nextInt();

		int arr[] = new int[n];
		for ( int i = 0; i <  n; i++ ) {
			System.out.print("Enter element: ");
			arr[i] = sc.nextInt();
		}
		o.check(arr);
		sc.close();
	}

}
