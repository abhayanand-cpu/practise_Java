
public class GfG {

	public static void main(String[] args) {
		int arr[] = {13,84,6,4};
		int x = 0;
		int n = arr.length;
		for( int i = 0; i < n; i++ ) {
			if( n != 1 ) {
				if( i == 0  ) {
					if( arr[i] > arr[i+1] )
						x = i;
				}
			
				else if( i == n - 1 ) {
					if( arr[i] > arr[i-1])
						x = i;
				}
			}
			
			else if( n == 1 )
				x = i;
			
			else {
				if( (arr[i] > arr[i+1]) && (arr[i] > arr[i-1] ) )
					x = i;
			}
		}
		System.out.println(x);
	}

}

/*int x = 0;
for( int i = 0; i < n; i++ ) {
    
	if( i == 0 && n != 1 ) {
		if( arr[i] > arr[i+1] )
			x = i;
	}
	
	else if( i == n-1 && n != 1 ) {
		if( arr[i] > arr[i-1])
			x = i;
	}
	
	else if( n == 1 )
	    x = i;
	    
	else {
		if( arr[i] > arr[i+1] && arr[i] > arr[i-1] )
			x = i;
	}
}
return x;
*/