public class A1Q3 {

	public static void main(String[] args) {
		char arr[] = {'c','a', 'r', 'b', 'o','n'};
		int l = arr.length;
		int i = 0;
		for( int a = 0; a < l; a++ ) {
			for( int b = 0; b < l; b++ ) {
				for( int c = 0; c < l; c++ ) {
					for( int d = 0; d < l; d++ ) {
						for( int e = 0; e < l; e++ ) {
							for( int f = 0; f < l; f++ ) {
								if( a != b && a != c && a != d && a != e && a != f && b != c && b != d && b != e && b != f && c != d && c != e && c != f && d != e && d != f && e != f ) {
									System.out.println(arr[a]+""+arr[b]+arr[c]+arr[d]+arr[e]+arr[f]+" ");
									i++;
								}
							}
						}
					}
				}
			}
		}
		System.out.println(i);
	}
}
