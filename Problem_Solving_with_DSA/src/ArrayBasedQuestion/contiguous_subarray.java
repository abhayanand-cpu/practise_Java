package ArrayBasedQuestion;

public class contiguous_subarray {
	
	static int LargestSubArray( int a[] ) {
		
		int max = 0;
		int maxnow = 0;
		
		for( int i = 0; i < a.length; i++ ) {
			maxnow = maxnow + a[i];
			
			if( maxnow < 0 )
				maxnow = 0;
			
			if( max < maxnow )
				max = maxnow;
		}
		return max;
	}

	public static void main(String[] args) {
		
		int a[] = {1,-2,3,4,-4,6,-4,3,2};
		System.out.println(LargestSubArray(a));
		
	}

}
