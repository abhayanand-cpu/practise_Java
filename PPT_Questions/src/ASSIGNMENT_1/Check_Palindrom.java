package ASSIGNMENT_1;

public class Check_Palindrom {

	public static void main(String[] args) {
		
		int n = 12321;
		
		String k = Integer.toString(n);
		
		int l = k.length() - 1;
		
		boolean flag = false;
		
		for( int i = 0; i < k.length()/2; i++ ) {
			
			if( k.charAt(i) == k.charAt(l) ) {
				l--;
				continue;
			}
			
			else {
				flag = true;
				break;
			}
		}
		
		if( flag == true )
			System.out.println(n+" is not a Palindrom");
		else
			System.out.println(n+" is Palindrom");
	}

}
