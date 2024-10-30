package SortingBasedProblem;

import java.util.Arrays;

public class Partation012 {

	static void Par012( int a[] ){
		
		int s = 0;
		int e = a.length - 1;
		int i = 0;
		
		while( i <= e ) {
			
			if( a[i] == 0 ) {
				swap( a, s, i );
				s++;
				i++;
			}
			
			else if( a[i] == 2 ) {
				swap( a, e, i );
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
		
		int a[] = {0, 1, 1, 0, 0, 2, 1, 2, 0, 0, 2, 1};
		Par012( a );
		System.out.println(Arrays.toString(a));
		
	}

}
