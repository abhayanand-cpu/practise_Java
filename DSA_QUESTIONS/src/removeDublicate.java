
public class removeDublicate {
	
	public static boolean store[] = new boolean[26];
	
	public static void remove( String str, int idx, String newStr ) {
		
		if( idx == str.length() ) {
			System.out.println(newStr);
			return;
		}
		
		char curr = str.charAt(idx);
		if( store[curr-'a'] ) {
			remove( str, idx+1, newStr );
		}
		else {
			newStr += curr;
			store[curr-'a'] = true;
			remove( str, idx+1, newStr );
		}
	}

	public static void main(String[] args) {
		
		remove("abbccdaljkdghfhiwuakajjhdgdfghajsgayudhkjsg",0,"");
	}

}
