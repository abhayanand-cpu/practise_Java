import java.util.Scanner;
public class A6Q13 {
	
	public static String reverseString(String s) {
		String s1 = "";
		
		for( int i = s.length()-1; i >= 0; i-- ) {
			s1 = s1+s.charAt(i);
		}
		return s1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any String to find wheather it is palindrome or not. : ");
		String s = sc.nextLine();
		s = s.toLowerCase();
		
		if( s.equals(reverseString(s)) )
			System.out.println("it is a Palindrome String");
		else
			System.out.println("it is not a Palindrome String");
		sc.close();
	}

}
