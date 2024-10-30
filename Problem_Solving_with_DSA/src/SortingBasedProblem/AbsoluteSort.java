package SortingBasedProblem;

import java.util.Arrays;

public class AbsoluteSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 9, 1, 8, 2, 7, 3, 6, 4, 5 };
		AbSort( array, 5 );
		System.out.println(Arrays.toString(array));
	}
	
	static void AbSort( int a[], int value ) {
		
		for( int i = 0; i < a.length - 1; i++ ) {
			for( int j = 0; j < a.length - 1 - i; j++ ) {
				if( Ab(a , j , j + 1, value ) )
					Swap( a, j, j + 1 );
			}
		}
	}
	
	static void Swap( int a[], int b, int c ) {
		
		int temp = a[b];
		a[b] = a[c];
		a[c] = temp;
		
	}
	
	static boolean Ab( int a[] , int b, int c, int value ) {
		
		if( Math.abs(value - a[b]) > Math.abs(value - a[c]) )
			return true;
		else
			return false;
	}

}
