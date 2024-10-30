
public class A6Q7 {
	static int i = 2;
	static int j = 3;
	public static int isPrime1() {
		
		for( ; i < 1000; i++) {
			for( int k = 2; ; k++ ) { 
				if( i % k == 0 && i != k )
				break;
				else if( i == k )
				return i;
			}
		}
		return 0;
	}
	
	public static int isPrime2() {
		
		for( ; j < 1000; j++) {
			for( int l = 2; ; l++ ) {
				if( j % l == 0 && j != l )
				break;
				else if( j == l )
				return j;
			}
		}
		return 0;
	}
	
	public static boolean TwinPrime() {
		
		if( (isPrime2() - isPrime1()) == 2 )
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		
		while( i < 1000 && j < 1000 ) {
			if( TwinPrime() ) {
				System.out.printf("(%d, %d)%n",i,j);
			}
			i++;
			j++;
		}
	}
}
