package oneMonthPrep;
import java.util.*;

public class pangrams {

	public static void main(String[] args) {
		
		String s = "We promptly judged antique ivory buckles for the prize";
		
		s = s.toUpperCase();
//		System.out.println(s);
		
		List<Character> alphabet = new ArrayList<Character>();
		
		char c = 'A';
		while( c <= 'Z' ) {
			alphabet.add(c);
			c++;
		}
//		System.out.println(alphabet);
		
		int i = 0;
		while( i < s.length() ) {
			char currentChar = s.charAt(i);
			
			if( alphabet.contains(currentChar) ) 
				alphabet.remove(Character.valueOf(currentChar));
			
			i++;
		}
		
		if( alphabet.isEmpty() )
			System.out.println("pangram");
		else
			System.out.println("not pangram");
	}

}
