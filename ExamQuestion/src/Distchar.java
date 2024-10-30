
public class Distchar {
	public static boolean check( ) {
		String s = "priyo";
		for( int i = 0; i < s.length(); i++ ) {
			for( int j = 0; j < s.length(); j++ ) {
				if( i == j )
					continue;
				if( s.charAt(i) == s.charAt(j) )
					return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		if( check() )
			System.out.println("true");
		else {
			System.out.println("false");
		}

	}

}
