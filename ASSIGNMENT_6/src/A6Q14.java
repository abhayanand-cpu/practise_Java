//import java.util.Scanner;
//public class A6Q14 {
//	
//	public static boolean CheckCharacterLength( String pass ) {
//		if( pass.length() < 8 )
//			return false;
//		else
//			return true;
//	}
//	
//	public static boolean CheckContent( String pass ) {
//		int digit = 0;
//		
//		for( int i = 0; i < pass.length(); i++ ) {
//			
//			char C = pass.charAt(i);
//			if( C > 47 && C < 58 )
//				digit++;
//			
//			if( (C > 32 && C < 48) || (C > 57 && C < 65) || (C > 90 && C < 97) || (C > 122 && C < 127) )
//				return false;
//
//		}
//		if( digit >= 2 )
//			return true;
//		else
//			return false;
//	}
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("* Contains at least eight characters.\n"
//				+ "* No special character allowed.\n"
//				+ "* Contain at least two digits.\n\n"
//				+ "Enter your password: ");
//		String pass = sc.nextLine();
//		
//		if( CheckCharacterLength(pass) && CheckContent(pass) )
//			System.out.println("Valid password");
//		else
//			System.out.println("Invalid password");
//		
//		sc.close();
//	}
//
//}
import java.util.Scanner;
public class A6Q14 {
	
	public static boolean CheckCharacterLength( String pass ) {
		if( pass.length() < 8 )
			return false;
		else
			return true;
	}
	
	public static boolean CheckContent( String pass ) {
		int digit = 0;
		
		for( int i = 0; i < pass.length(); i++ ) {
			
			
			if( Character.isDigit(pass.charAt(i)) ) {
				digit++;
				continue;
			}
			else if( Character.isLetter(pass.charAt(i)) )
				continue;
			else
				return false;

		}
		if( digit >= 2 )
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("* Contains at least eight characters.\n"
				+ "* No special character allowed.\n"
				+ "* Contain at least two digits.\n\n"
				+ "Enter your password: ");
		String pass = sc.nextLine();
		
		if( CheckCharacterLength(pass) && CheckContent(pass) )
			System.out.println("Valid password");
		else
			System.out.println("Invalid password");
		
		sc.close();
	}

}
