package ArrayBasedQuestion;

import java.util.Arrays;

import Sorting.QuickSort;

public class WaveArray {     
	
	static void OddLess( int a[] ){      //1St way of solving it
		
		int l = a.length;
		for( int i = 1; i < l - 1; i+=2 ) {
			
			if( a[i] > a[i-1] )
				swap( a, i, i-1 );
			
			if( a[i] > a[i+1] )
				swap( a, i, i+1 );
		}
		
	}
	
	static void OddLess2( int a[] ) {
		
		int l = a.length;
		Arrays.sort(a);
		
		for( int i = 0; i < l - 1; i+=2 ) {
			swap( a, i, i+1 );
		}
	}
	
	static void swap( int a[], int i, int j ) {
		
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		
	}
	
	

	public static void main(String[] args) {
		
		int a[] = {8, 1, 2, 3, 4, 5, 6, 4, 2};
		OddLess(a);
		System.out.println(Arrays.toString(a));
		int a2[] = {8, 1, 2, 3, 4, 5, 6, 4, 2};
		OddLess(a2);
		System.out.println(Arrays.toString(a2));

	}

}
