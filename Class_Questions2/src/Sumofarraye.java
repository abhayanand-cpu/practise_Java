
//public class Sumofarraye {
//	int arr[];
//	
//	void GetData( int arr[] ){
//		this.arr = arr;
//	}
//	
//	int sumArray( int n ) {
//		if( n == 0 )
//			return arr[0];
//		else
//			return arr[n] + sumArray(n-1);
//	}
//	
//	public static void main(String[] args) {
//		Sumofarraye o = new Sumofarraye();
//		int arr[] = {1,2,3,4,5,6};
//		o.GetData(arr);
//		int c = o.sumArray(arr.length-1);
//		System.out.println(c);
//	}
//
//}
public class Sumofarraye {
	int arr[];
	
	void GetData( int arr[] ){
		this.arr = arr;
	}
	
	int sumArray( int s, int e ) {
		if( s > e )
			return 0;
		
		else if( arr[s] == arr[e] )
			return arr[s];
		
		else {
			int m = ( s + e )/2;
			return sumArray( m + 1, e ) + sumArray( s , m );
		}
			
	}
	
	public static void main(String[] args) {
		Sumofarraye o = new Sumofarraye();
		int arr[] = {1,2,3,4,5,6};
		o.GetData(arr);
		int s = 0;
		int e = arr.length-1;
		int c = o.sumArray( s, e );
		System.out.println(c);
	}

}