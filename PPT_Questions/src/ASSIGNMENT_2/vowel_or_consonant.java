package ASSIGNMENT_2;
import java.util.Scanner;
public class vowel_or_consonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String c = sc.next();
		c = c.toLowerCase();
		
		if( c.equals("a") || c.equals("e") || c.equals("i") || c.equals("o") || c.equals("u"))
			System.out.println("VOWEL");
		else
			System.out.println("CONSONANT");

	}

}
