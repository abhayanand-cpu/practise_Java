package ASSIGNMENT_1;

public class Largest_of_three {

	public static void main(String[] args) {

		int a = 6;
		int b = 7;
		int c = 10;
		
		
		if( a > b ) {
			if( b > c ) {
				System.out.println(a+" is the largest number.");
			}
			else {
				if( a < c )
					System.out.println(c+" is the largest number.");
			}
		}
		else if( b > a ) {
			if( b > c )
				System.out.println(b+" is the largest number.");
			else
				System.out.println(c+" is the largest number.");
		}
	}

}
