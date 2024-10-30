package Sorting;

import java.util.Arrays;

public class MergeSort {
	
	static void Mg( int a[], int s, int e ) {
		
		if( e - s == 1 )
			return;
		
		int mid = ( s + e ) / 2;
		
		Mg( a, s, mid );
		Mg( a, mid, e );
		
		Merge( a, s, mid, e );
	}
	
	static void Merge( int a[], int s, int m, int e ) {
		
		int ar[] = new int[ e - s ];
		
		int i = s;
		int j = m;
		int k = 0;
		
		while( i < m && j < e ) {
			if( a[i] < a[j] ) {
				ar[k] = a[i];
				i++;
			}
			else {
				ar[k] = a[j];
				j++;
			}
			k++;
		}
		
		while( i < m ) {
			ar[k] = a[i];
			i++;
			k++;
		}
		
		while( j < e ) {
			ar[k] = a[j];
			j++;
			k++;
		}
		
		for( int l = 0; l < ar.length; l++ ) {
			a[s+l] = ar[l];
		}
	}
	
	
	
	//MERGE SORT WITHOUT CHANGING ORIGINAL ARRAY
	
	/*static int[] Mg( int a[] ) {
		
		if( a.length == 1 )
			return a;
		
		int mid = a.length/2;
		
		int left[] = Mg( Arrays.copyOfRange(a, 0, mid));
		int right[] = Mg( Arrays.copyOfRange(a, mid, a.length ));
		
		return Merge( left, right );
	}
	
	static int[]  Merge( int l[] , int []r ) {
		
		int ar[] = new int[l.length+r.length];
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		while( i < l.length && j < r.length ) {
			if( l[i] < r[j] ) {
				ar[k] = l[i];
				i++;
			}
			else {
				ar[k] = r[j];
				j++;
			}
			k++;
		}
		
		while( i < l.length ) {
			ar[k] = l[i];
			k++;
			i++;
		}
		
		while( j < r.length ) {
			ar[k] = r[j];
			k++;
			j++;
		}
		
		return ar;
	}*/

	public static void main(String[] args) {
		
		int arr[] = {8,6,4,9,7,3,2,1};
//		arr = Mg(arr);
//		System.out.println(Arrays.toString(arr));
		
		Mg( arr, 0 , arr.length );
		System.out.println(Arrays.toString(arr));
	}

}
