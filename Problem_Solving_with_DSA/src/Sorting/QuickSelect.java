package Sorting;

public class QuickSelect {
	
	static int Partition( int a[], int lower, int higher, int k ) {
		
		int start = lower;
//		int end = higher;
		int piv = a[lower];
		
		while( lower <= higher ) {
			
			while( a[lower] <= piv && lower < higher )
				lower++;
			
			while( a[higher] > piv && lower <= higher )
				higher--;
			
			if( lower < higher ) {
				int temp = a[lower];
				a[lower] = a[higher];
				a[higher] = temp;
			}
			
			int temp = a[higher];
			a[start] = a[higher];
			a[higher] = temp;
			
		}
		return higher;
		
	}
	
	static int Kthelement( int a[], int lower, int higher, int k ) {
		
		int partition  = Partition( a, lower, higher, k );
		
		if( partition == k - 1 )
			return a[partition];
		
		else if( partition > k - 1 )
			return Partition( a, lower, partition - 1 , k);
		
		else
			return Partition( a, partition + 1, higher, k);
	}

	public static void main(String[] args) {
		
		int a[] = {8,5,3,4,9,7,1,2};
		
		System.out.println(Kthelement( a, 0, a.length - 1, 3 ));

	}

}
