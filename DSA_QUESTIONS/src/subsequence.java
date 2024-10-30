import java.util.HashSet;

public class subsequence {

	public static void sequence( String str, int idx, String newStr ) {
		
		if( idx == str.length() ) {
			System.out.println(newStr);
			return;
		}
		
		char ch = str.charAt(idx);
		
		//where we want the string 
		sequence( str, idx+1 , newStr+ch );
		
		//where we didn't want the string
		sequence( str, idx+1, newStr );
	}
	
	public static void uniqueSequence( String str, int idx, String newStr, HashSet<String> set ) {
		
		if( idx == str.length() ) {
			
			if( set.contains(newStr) ) {
				return;
			}
			else {
				System.out.println(newStr);
				set.add(newStr);
				return;
			}
			
		}
		
		char ch = str.charAt(idx);
		
		//where we want the string 
		uniqueSequence( str, idx+1 , newStr+ch, set );
		
		//where we didn't want the string
		uniqueSequence( str, idx+1, newStr, set );
	}
	
	public static void main(String[] args) {
		
		sequence("abcd",0,"");
		
		HashSet<String> set = new HashSet<>();
		uniqueSequence("aaa",0,"",set);
	}

}
