import java.util.*;
public class A6Q3 {
	
	public static int reverse(int number) {
		int rev = 0;
		
		while( number != 0 ) {
		    
			int rem = number % 10;
		    rev = rev*10+rem;
			number /= 10;
			
		}
		return rev;
	}
	
	public static boolean isPalindrome(int number) {
		if( reverse(number) == number )
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number to find whether the number is palindrome or not: ");
		int number = sc.nextInt();

		if( isPalindrome(number) == true )
			System.out.println(number+" is Palindrome number.");
		else
			System.out.println(number+" is not a Palindrome number.");
		
		sc.close();
	}

}
