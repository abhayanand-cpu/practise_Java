
//public class PrimeCounter {
//
//	public static void main(String[] args) {
//
//		int n = Integer.parseInt(args[0]);
//		
//		for( int i = 2; i <= n; i++) {
//			for( int j = 2; j <= n; j++) {
//				if( i % j == 0 && i != j )
//					break;
//				else if ( i == j ) {
//					System.out.print(i+" ");
//					break;
//				}
//			}
//		}
//	}
//
//}
public class PrimeCounter {

	public static void main(String[] args) {

		int n = Integer.parseInt(args[0]);
		int num = 0;
		for( int i = 1; i <= n; i++) {
			for( int j = 2; j <= n; j++) {
				if( i % j == 0 && i != j )
					break;
				else if ( i == j ) {
					num++;
					break;
				}
			}
		}
		System.out.print("Number of primes from 1 to "+n+" is "+num);
	}

}
