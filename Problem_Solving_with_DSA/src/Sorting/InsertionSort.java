package Sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		
		int a[] = {5,6,2,4,7,3,1,9};
		
		int l = a.length;
		for( int i = 0; i < l; i++ ) {
			for( int j = i; j > 0; j-- ) {
				if( a[j-1] > a[j] ) {
					int temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
				}
			}
		}
			System.out.println(Arrays.toString(a));
	}

}
