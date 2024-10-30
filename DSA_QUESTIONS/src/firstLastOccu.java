
public class firstLastOccu {
	
	public static void result( String str, int first, int end, int idx1,int idx2, char key ) {
		
		if( first != -1 && end != -1 ) {
			System.out.println(first+" "+end);
			return;
		}
		
		if( idx1 > (str.length()-1) / 2 ) {
			System.out.println(first+" "+end);
			return;
		}
		
		if( idx1 == idx2 ) {
			
			if( str.charAt(idx1) == key )
				first = idx1;
			
			else if( str.charAt(idx2) == key)
				end = idx2;
			
			System.out.println(first+" "+end);
			return;
		}
		
		if( str.charAt(idx1) == key && first == -1 )
			first = idx1;
		
		if( str.charAt(idx2) == key && end == -1)
			end = idx2;
			
		result( str, first, end, idx1+1,idx2-1, key);
			
	}
	
	public static void main(String[] args) {
		
		result("abaacdaef",-1,-1,0,8,'a');
		
	}

}
