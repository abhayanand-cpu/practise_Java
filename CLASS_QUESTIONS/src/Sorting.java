import java.util.Arrays;
public class Sorting {
	
	static void InsertionSort(int arr[]) {
		for( int i = 0; i < arr.length - 1; i++ ) {
			for( int j = i+1; j > 0; j-- ) {
				if( arr[j] < arr[j-1] )
					Swapping( arr, j );
				else
					break;
			}
		}
	}
	
	static void Swapping( int arr[], int j ) {
		int swap;
		swap = arr[j];
		arr[j] = arr[j-1];
		arr[j-1] = swap;
	}
	
	public static void main(String[] args) {
		int arr[] = {8,7,6,5,4,3,2,1};
		InsertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
