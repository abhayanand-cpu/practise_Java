package ASSIGNMENT_1;

public class Prime_or_not {

	public static void main(String[] args) {
		
		int n = 11;
		boolean flag = false;
		
		for( int i = 2; i < n; i++ ) {
			
			if( n % i == 0 ) {
				System.out.println(n+" "+" is not a Prime Number");
				flag = true;
				break;
			}
			
			
		}
		if( flag == false )
			System.out.println(n+" is a Prime number");
	}

}
