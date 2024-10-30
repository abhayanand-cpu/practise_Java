
public class A6Q5 {
	public boolean isPrime(int i) {
		
		for( int j = 2; j <= 10000; j++) {
			
			if( i%j == 0 && i != j )
				break;
			
			else if( i == j ) {
				return true;
			}
		}
		return false;
	}
		
	
	
	public static void main(String[] args) {
		A6Q5 s = new A6Q5();
		
		int prime = 0;
		
		for(int i = 2; i < 10000; i++) {
			if( s.isPrime(i) == true )
				prime++;
		}
		System.out.println(prime);
	}

}

