package SortingBasedProblem;

import java.util.Arrays;

public class Reverse_till_K {
	
	static void Reverse( int a[], int i, int j ) {
		
		while( i < j ) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
		
	}

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,8,9};
		
		System.out.println(Arrays.toString(a));
		Reverse( a, 0, 3 );
		Reverse( a, 4, a.length - 1 );
		Reverse( a, 0, a.length - 1 );
		System.out.println(Arrays.toString(a));

	}

}
