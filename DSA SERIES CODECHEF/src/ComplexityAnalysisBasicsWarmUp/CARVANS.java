package ComplexityAnalysisBasicsWarmUp;
import java.util.Scanner;
public class CARVANS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		short t = sc.nextShort();
		
		for( short i = 0; i < t; i++ ) {
			int n = sc.nextInt();
			long a[] = new long[n];
			
			for( int j = 0; j < n; j++ ) {
				a[j] = sc.nextLong();
			}
			int j = 1;
			int count = 1;
			while( j < n ) {
				if( a[j] <= a[j-1] )
					count++;
				else
					a[j] = a[j-1];
				j++;
			}
			System.out.println(count);
		}
	}
}
