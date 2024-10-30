
public class A6Q6 {
	public static int isPrime(int i) {
		
		for( int k = 2; ; k++) {
			if( i%k == 0 && i != k )
				break;
			else if( i == k )
				return i;
		}
		return 0;
	}
	
	public static int reverse(int i) {
		int rev = 0;
		
		while( i != 0 ) {
			int rem = i % 10;
			rev = rev * 10 + rem;
			i /= 10;
		}
		return rev;
	}
	
	public static int ispalindromic(int i) {
		if( reverse(i) == i )
			return i;
		else
			return 0;
	}
	
	public static int PalindromicPrime(int i) {
		if( (i ==  isPrime(i)) && (i == ispalindromic(i)) )
			return i;
		else
			return 0;
	}
	
	public static void main(String[] args) {
		int i = 2,j = 0;
		
		while( i > 0 && j < 100 ) {
			
			if( i == PalindromicPrime(i) ) {
				System.out.print(i+" ");
				j++;
				
				if( j%10 == 0 ) 
					System.out.println();
				
			}
			i++;
		}
	}
}
