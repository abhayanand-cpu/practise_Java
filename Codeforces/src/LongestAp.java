import java.util.Arrays;
import java.util.Scanner;
public class LongestAp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int n = sc.nextInt();
		
		int a[] = new int[n];
		int b[] = new int[n-1];
		int c[] = new int[n-1];
		
		for( int i = 0; i < t; i++ ) {
			
			for( int j = 0; j < n; j++ ) {
				a[j] = sc.nextInt();
			}
			
			for( int j = 0; j < n - 1; j++ ) {
				b[j] = a[j+1] - a[j];
			}
//			System.out.println(Arrays.toString(b));
			int num = 0;
			int j;
			for( j = 0; j < n - 1; j++) {
				int count = 1;
				for( int k = j+1; k < n - 2; k++ ) {
					if( b[j] != b[k] ) {
						j = k-1;
						break;
					}
					else if( b[k] == b[k] )
						count++;
				}
				c[num++] = count;
			}
//			System.out.println(Arrays.toString(c));
			
		}
		
		
	}

}
