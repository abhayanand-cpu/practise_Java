package javaDsa;

public class occuranceA {
	
	public static int first = -1;
	public static int last = -1;
	
	public static void Occurance( String a, int indx, char element ) {
		
		if( indx == a.length() - 1 )
			return;
		
		if( a.charAt(indx) == element && first == -1 ) {
			first = indx;
		}
		else if( a.charAt(indx) == element && first != -1 ) {
			last = indx;
		}
		
		indx++;
		Occurance( a, indx, element );
	}

	public static void main(String[] args) {
		
		String a = "hndlajdhaolrjaolaajkdjajl";
		Occurance( a, 0, 'a' );
		System.out.println("first = "+first+" last = "+last);
	}

}
