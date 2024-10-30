
public class Q5b {

	public static void main(String[] args) {
		char ar[] = {'a','e','i','o','u'};
		
		for( int i = 0; i < ar.length; i++ ) {
			for( int j = 0; j < ar.length; j++ ) {
				for( int k = 0; k < ar.length; k++ ) {
					for( int l = 0; l < ar.length; l++ ) {
						for( int m = 0; m < ar.length; m++ ) {
							if( i != j && i != k && i != l && i != m && j != k && j != l && j != m && k != l && k != m && l != m ) {
								System.out.println(""+ar[i]+ar[j]+ar[k]+ar[l]+ar[m]);
							}
						}
					}
				}
			}
		}

	}

}
