package javaDsa;

public class strictlyIncreasing {
	
	public static boolean isSorted( int a[], int indx ) {
		
		if( indx == a.length - 1 )
			return true;
		
		if( a[indx - 1] >= a[indx] )
			return false;
		
		return isSorted( a, indx+1 );
		
	}

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6};
		
		System.out.println(isSorted( a, 1 ));
	}

}
