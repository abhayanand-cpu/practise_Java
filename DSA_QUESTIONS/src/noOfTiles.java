
public class noOfTiles {
	
	public static int ways( int n, int m ) {
		
		if( m == n )
			return 2;
		
		if( n < m )
			return 1;
		
		//horizontally
		int horizontally = ways( n - 1, m );
		
		//vertically
		int vertically = ways( n - m, m );
		
		return horizontally + vertically;
		
	}

	public static void main(String[] args) {
		int totalWays = ways(4,2);
		System.out.println(totalWays);

	}

}
