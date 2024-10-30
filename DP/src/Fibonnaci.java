import java.util.Scanner;
public class Fibonnaci {
	static int Fibonacci( int n ,int arr[]) { //top-up Approach
		
		if( n == 0 )
			return arr[n] = 0;
		if( n == 1 )
			return arr[n] = 1;
		
		if( arr[n] != -1 )
			return arr[n];
		
		return arr[n] = Fibonacci(n-1,arr) + Fibonacci(n-2,arr);
			
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int key = 100;
		int arr2[] = new int[10000]; //Bottom-up Approach
		arr2[0] = 0;
		arr2[1] = 1;
		for( int i = 2; i < arr2.length; i++ ) {
			arr2[i] = arr2[i-1]+arr2[i-2];
		}
		
		int arr[] = new int[100000];
		for( int i = 0; i < arr.length; i++ ) {
			arr[i] = -1;
		}
		System.out.println(Fibonacci(key,arr));
		System.out.println(arr2[key]);
		sc.close();
	}

}
