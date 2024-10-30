
public class stringPermutation {
	
	public static void permutation( String str, String combinations ) {
		
		if( str.length() == 0 ) {
			System.out.println(combinations);
			return;
		}
		
		for( int i = 0; i < str.length(); i++ ) {
			char curr = str.charAt(i);
			
			String permutation = str.substring(0, i) + str.substring(i+1);
			permutation( permutation, combinations+curr);
		}
	}
	
	public static void main( String []args ) {
		permutation("raj","");
	}
}
