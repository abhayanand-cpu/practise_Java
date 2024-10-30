package SortingBasedProblem;

import java.util.Arrays;

public class RangePartation {
	
	static void Rangep( int a[], int hi, int lo ) {
		
		int s = 0;
		int e = a.length - 1;
		int i = 0; 
		
		while( i <= e ) {
			
			if( a[i] < lo ) {
				swap( a, i, s );
				i++;
				s++;
			}
			
			else if( a[i] > hi ) {
				swap( a, i, e );
				e--;
			}
			
			else {
				i++;
			}
		}
		
	}
	
	static void swap( int a[], int b, int c ) {
		
		int temp = a[b];
		a[b] = a[c];
		a[c] = temp;
		
	}

	public static void main(String[] args) {
		
		int arr[] = { 1, 21, 2, 20, 3, 19, 4, 18, 5, 17, 6, 16, 7, 15, 8, 14, 9, 13, 10, 12, 11};
		Rangep( arr, 12, 9 );
		System.out.println(Arrays.toString(arr));
		
	}

}
