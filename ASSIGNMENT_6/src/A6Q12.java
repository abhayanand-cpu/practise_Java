import java.util.Scanner;
public class A6Q12 {
	
	public static int count(String s) {
		int count = 0;
		for( int i = 0; i < s.length(); i++ ) {
			char v = s.charAt(i);
			if( v == 'A' || v == 'E' || v == 'I' || v == 'O' || v == 'U')
				count++;
			else if ( v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u')
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String to find number of vowel in it: ");
		String s = sc.next();
		System.out.println("Number of vowel in a String "+"\""+s+"\""+" is "+count(s));
		sc.close();
	}

}
