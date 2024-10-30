package ArrayBasedQuestion;

public class Missing_number {

	public static int SmallestPositiveMissingNumber(int[] arr, int size){
		
		for( int i = 1; i < size; i++ ) {
			
			boolean flag = false;
			for( int j = 0; j < size; j++ ) {
				if( i == arr[j] )
					flag = true;
			}
			if( flag == false )
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = {8, 5, 6, 1, 9, 11, 3, 7, 4, 10};
		int size = arr.length;
		System.out.println("Smallest Positive Missing Number:" + SmallestPositiveMissingNumber(arr, size));
	}

}
