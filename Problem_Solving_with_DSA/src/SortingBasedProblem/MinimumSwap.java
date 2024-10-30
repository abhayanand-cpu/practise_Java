package SortingBasedProblem;

import java.util.Arrays;

public class MinimumSwap {
	
	static int minSwaps( int a[], int value ) {
		
		int s = 0;
		int e = a.length - 1;
		int swap = 0;
		
		while( s < e ) {
			
			while( a[s] <= value ) 
				s++;
			
			while( a[e] > value )
				e--;
			
			
			if( s < e ) {	
				int temp = a[s];
				a[s] = a[e];
				a[e] = temp;
				swap++;
			}
		}
		return swap;
	}
	
	public static void main(String[] args ) {
		
		int a[] = {8,6,7,4,9,3,2,14,63};
		int swap = minSwaps( a, 9 );
		System.out.println(Arrays.toString(a));
		System.out.println(swap);
	}
}
