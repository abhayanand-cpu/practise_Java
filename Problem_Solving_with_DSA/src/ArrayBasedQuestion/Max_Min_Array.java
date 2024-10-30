package ArrayBasedQuestion;

import java.util.Arrays;

public class Max_Min_Array {
	
	static void Reverse( int a[], int start, int stop ) {
		
		while( start < stop ) {
			int temp = a[start];
			a[start] = a[stop];
			a[stop] = temp;
			start++;
			stop--;
		}
		
	}
	
	static void Max_Min( int a[] ) {
		
		int size = a.length;
		
		for( int i = 0; i < size - 1; i++ ) {
			Reverse( a, i, size - 1 );
			System.out.println(Arrays.toString(a));
		}
		
	}

	public static void main(String[] args) {
		
		int a[] = {1, 2, 3, 4, 5, 6, 7};
		Max_Min(a);
		System.out.println(Arrays.toString(a));

	}

}
