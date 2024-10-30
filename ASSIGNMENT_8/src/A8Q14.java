
//import java.util.Arrays;
public class A8Q14 {
	
	static void Sorting( int [] a ) {    //performing insertion sort
		for( int i = 0; i < a.length - 2; i++ ) {
			int swap = 0;
			for( int j = i + 1; j > 0; j-- ) {
				if( a[j-1] > a[j] ) {
					swap = a[j-1];
					a[j-1] = a[j];
					a[j] = swap;
				}
				else if( a[j-1] < a[j] )
					break;
			}
		}
		
	}
	
	static int BinarySearch( int [] a, int key ) {
		int start = 0;
		int end = a.length - 1;
		while( start <= end ) {
			
			int middle = (start + end)/2;
			
			if( key < a[middle] )
				end = middle - 1;
			else if( key > a[middle] )
				start = middle + 1;
			else if( key == a[middle] )
				return middle;
			
		}
		return -1;
	}
	
	static int LinearSearch( int [] a, int key ) {
		
		for( int i = 0; i < a.length; i++ ) {
			if( a[i] == key )
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = new int[100000];
		int i = 0;
		while( i < 100 ) {
			arr[i] = 1 + (int)(Math.random()*( 100000 - 1 + 1 ));
			i++;
		}
		int key = 1 + (int)(Math.random()*( 100000 - 1 + 1 ));
		
		long LinearCurrentTime = System.currentTimeMillis();
		LinearSearch( arr, key );
		long LinearEndTime = System.currentTimeMillis();
		
		System.out.println("Sorting...");
		Sorting(arr);
		System.out.println("Sorted Successfully.\n");
		
		long BinaryCurrentTime = System.currentTimeMillis();
		BinarySearch( arr,key );
		long BinaryEndTime = System.currentTimeMillis();
		
		long EstimateLinearTime = LinearEndTime - LinearCurrentTime;
		long EstimateBinaryTime = BinaryEndTime - BinaryCurrentTime;
		System.out.println("Time taken to perform Linear Search: "+EstimateLinearTime);
		System.out.println("Time taken to perform Binary Search: "+EstimateBinaryTime);
		
	}

}
