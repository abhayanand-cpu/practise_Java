package ASSIGNMENT_1;

public class Check_Armstrong {

	public static void main(String[] args) {
		
		int n =  912985153;
		
		int k = n;
		
		int l = Integer.toString(n).length();
		
		int sum = 0;
		
		for( int i = 0; i < l; i++ ) {
			
			sum += Math.pow( n % 10 , l );
			
			n = n/10;
			
		}
		
		if( k == sum )
			System.out.println(k+" is Armstrong Number");
		else
			System.out.println(k+" is Not a Armstrong Number");
	}

}
