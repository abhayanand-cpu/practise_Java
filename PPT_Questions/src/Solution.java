
class Solution {
	
	public static void Conquer( int[] nums , int s, int mid, int e ){
        
        int ar[] = new int[e - s + 1];
        int start = s;
        int midInd = mid + 1;
        int indar = 0;

        while( start <= mid && e >= midInd ){
            if( nums[start] >= nums[midInd] ){
                ar[indar++] = nums[midInd++];
            }
            else{
                ar[indar++] = nums[start++];
            }
        }

        while( start <= mid ){
            ar[indar++] = nums[start++];
        }

        while( midInd <= e ){
            ar[indar++] = nums[midInd++];
        }
        
        for( int i = 0, j = s;i < ar.length; i++, j++) {
        	nums[j] = ar[i];
        }

    }
	
	public static void Divide( int[] nums , int s , int e ){
    	
        if( s >= e )
            return;

        int mid = s + ( e - s )/2;
        Divide( nums , s , mid );
        Divide( nums, mid + 1 , e );
        Conquer( nums, s, mid, e);
    }

	public static boolean containsDuplicate(int[] nums) {

	        Divide(nums, 0, nums.length - 1);

	        for( int i = 0; i < nums.length - 1; i++ ){
	            if( nums[i] == nums[i+1] ){
	                return true;
	            }
	        }
	    return false;
   
	}
	

	public static void main(String[] args) {
		int a[] = {3,5,8,4,0,2,1};
		int b[] = {3,5,8,4,1,2,1};
		
		if( containsDuplicate(a) ) {
			System.out.println("True");
		}
		else
			System.out.println("false");
		
		if( containsDuplicate(b) ) {
			System.out.println("True");
		}
		else
			System.out.println("false");
	}

}
