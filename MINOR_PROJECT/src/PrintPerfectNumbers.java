//
//public class Problem_1 {
//	
//	public static boolean isPerfectNumber(int n) {
//		int d = 0,n1 = n,n2 = n;
//		
//		while( n != 0 ) {        // finding number of digits
//			
//			int digit = n % 10;
//			n /= 10;
//			d++;
//			
//		}
//		int step = 0;
//		
//		while( n1 != 0 ) {      //calculating 1d+5d+3d = 13+53+33 = 1+125+27 = 153 = n
//			
//			int digit2 = n1 % 10;
//			step = (int)Math.pow( digit2, d ) + step;
//			n1 /= 10;
//			
//		}
//		if( step == n2 )
//			return true;
//		else
//			return false;
//	}
//	
//	public static void main(String [] args) {
//		System.out.println("perfect numbers between 1 and 1000000 are:");
//		int count = 0;
//		for( int n = 1; n <= 1000000; n++ ) {
//			if( isPerfectNumber(n) ) {
//				System.out.println(n);
//				count++;
//			}
//		}
//		System.out.print("Number perfect numbers from 1 to 1000000 is "+count);
//	}
//}



public class PrintPerfectNumbers {
	
	public static boolean isPerfectNumber(int n) {
		
		String n1 = ""+n;
		int n2 = n;
		int step = 0;
		
		while( n != 0 ) {      
			
			int digit2 = n % 10;
			step = (int)Math.pow( digit2, n1.length() ) + step;
			n /= 10;
			
		}
		
		if( step == n2 )
			return true;
		else
			return false;
	}
	
	public static void main(String [] args) {
		System.out.println("perfect numbers between 1 and 1000000 are:");
		int count = 0;
		
		for( int n = 1; n <= 1000000; n++ ) {
			
			if( isPerfectNumber(n) ) {
				
				System.out.println(n);
				count++;
			}
		}
		System.out.print("Number perfect numbers from 1 to 1000000 is "+count);
	}
}

//public class PrintPerfectNumbers {
//	
//	public static boolean isPerfectNumber(int n) {
//		
//		String n1 = ""+n;
//		int n2 = n;
//		int step = 0;
//		
//		while( n != 0 ) {      
//			
//			int digit2 = n % 10;
//			step = (int)Math.pow( digit2, n1.length() ) + step;
//			n /= 10;
//			
//		}
//		
//		if( step == n2 )
//			return true;
//		else
//			return false;
//	}
//	
//	public static void main(String [] args) {
//		System.out.println("perfect numbers between 1 and 1000000 are:");
//		int count = 0;
//		
//		for( int n = 1; n <= 1000000; n++ ) {
//			
//			if( isPerfectNumber(n) ) {
//				
//				System.out.println(n);
//				count++;
//			}
//		}
//		System.out.print("Number perfect numbers from 1 to 1000000 is "+count);
//	}
//}