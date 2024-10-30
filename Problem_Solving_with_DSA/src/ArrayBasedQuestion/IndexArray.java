package ArrayBasedQuestion;

import java.util.Arrays;

public class IndexArray {
	
	static void swap( int a[], int i, int j ) {
		
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		
	}
	
	static void Index( int a[] ) {
		
		int l = a.length;
//		boolean flag = false;
		
		for( int i = 0; i < l; i++ ) {
			
			while( a[i] != i && a[i] != -1 ) {
				if( a[i] != -1 ) {
					swap( a, i, a[i] );
				}
			}
			
//			if( a[i] == -1 ) {
//				int j = 0;
//				while( j < l && i != a[j]  ) {
//					flag = true;
//					j++;
//				}
//				
//				if( j < l && flag )
//					swap( a, i, j );
//				
//				flag = false;
//			}
		}
		
	}

	public static void main(String[] args) {
		
		int a[] = { 7, 12, -1, 5, -1, 11, -1, 15, 2, 13, 1, 9, -1, 14, -1, 6};
		Index(a);
		System.out.println(Arrays.toString(a));

	}

}
