package leetcode;

public class rotatedArray {
	
	public static int sortedRotated( int a[], int key, int left, int right ) {
		
		if( left > right )
			return -1;
		
		int mid = left + ( right - left ) / 2;
		
		if( a[mid] == key )
			return mid;
		
		if( a[left] <= a[mid] ) {
			if( key >= a[left] && key <= a[mid] ) {
				return sortedRotated( a, key, left, mid - 1 );
			}
			return sortedRotated( a, key, mid + 1, right );
		}
		
		if( key >= a[mid] && key <= a[right] ) {
			return sortedRotated( a, key, mid + 1, right );
		}
		
		return sortedRotated( a, key, left, mid - 1 );
	}

	public static void main(String[] args) {
		int a[] = {6,7,1,2,3,4,5};
		int key = 6;
		int result = sortedRotated( a, key, 0, a.length - 1 );
		
		System.out .println(result);

	}

}
