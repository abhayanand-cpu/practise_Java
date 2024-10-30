package javaDsa;

public class Hanoi {

	public static void towerOfHanoi( int n, String S, String H, String D ) {
		
		if( n == 1 ) {
			System.out.println("moving Disk "+n+" from "+S+" to "+D);
			return;
		}
	
		towerOfHanoi( n - 1, S, D, H );
		System.out.println("moving Disk "+n+" from "+S+" to "+D);
		towerOfHanoi( n - 1, H, S, D);
	}
	
	
	public static void main(String[] args) {
		
		int n = 3;
		towerOfHanoi( n, "S", "H" ,"D" );
	}

}
