package leetcode;

public class validPalindrome {
	
	public static boolean palindrome( String str, int s, int e ) {
		
		if( str == "" )
			return true;
		
		if( s == e )
			return true;
		
		if( str.charAt(s) != str.charAt(e) )
			return false;
		
		return palindrome( str, ++s, --e );
		
	}
	
	 public static boolean isPalindrome(String s) {
		 
		 s = s.toLowerCase();
		 s = s.replaceAll("[^A-Za-z0-1]", "");
		 
		 System.out.println(palindrome( s, 0, s.length() - 1));
		 
		 int l = s.length() - 1;
		 
		 for( int i = 0, j = l; i <= j; i++, j-- ) {
			 if( s.charAt(i) != s.charAt(j) )
				 return false;
		 }
	     return true;  
	 }

	public static void main(String[] args) {
		System.out.println(isPalindrome("0P"));
	}

}
