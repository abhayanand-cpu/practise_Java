package leetcode;

public class noOfWays {
	
	static int Steps( int n ) {
		int a[] = new int[n+1];
		return noOfSteps( n, 0, a);
	}
	
	static int noOfSteps( int n, int i, int a[] ) {
		
		if( i > n )
			return 0;
		
		if( i == n )
			return 1;
		
		if( a[i] > 0 )
			return a[i];
		
		a[i] = noOfSteps( n, i + 1, a) + noOfSteps( n, i + 2, a);
		return a[i];
	}

	public static void main(String[] args) {
		
		System.out.println(Steps(5));

	}

}
