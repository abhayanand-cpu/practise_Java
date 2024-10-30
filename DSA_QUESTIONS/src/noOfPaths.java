
public class noOfPaths {
	
	public static int paths( int n,int m, int i, int j ) {
		
		if( i == n || j == m )
			return 0;
		
		if( i == n - 1 && j == m - 1 ) {
			return 1;
		}
		
		int right = paths( n,m, i+1, j );
		int down = paths( n,m, i, j+1 );
		
		return right+down;
	}
	public static void main( String args[] ) {
		int path = paths(3,3,0,0);
		System.out.println(path);
	}
}
