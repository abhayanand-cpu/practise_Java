package Sorting;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,4,3,2,1,7,6,9};
		Qs( a, 0, a.length-1 );
		System.out.println(Arrays.toString(a));

	}
	
	static void Qs( int a[], int low, int high ) {
		
		if( low >= high )
			return;
		
		int s = low;
		int e = high;
		int m = s + ( e - s ) / 2;
		int p = a[m];
		
		while( s <= e ) {
			
			while( a[s] < p )
				s++;
			
			while( a[e] > p )
				e--;
			
			if( s <= e ) {
				
				int temp = a[s];
				a[s] = a[e];
				a[e] = temp;
				s++;
				e--;
				
			}
		}
		Qs( a, low, e );
		Qs( a, s, high );
	}

}
