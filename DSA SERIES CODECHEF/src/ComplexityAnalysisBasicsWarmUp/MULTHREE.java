package ComplexityAnalysisBasicsWarmUp;
import java.util.Scanner;
public class MULTHREE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while( t --> 0 ) {
			
			long k = sc.nextLong(); int d0 = sc.nextInt(); int d1 = sc.nextInt();
			
			int lastdigit = ( d0 + d1 ) % 10;
			long sum = ( d0 + d1 ) + lastdigit;
			
			if( k == 2 ) {
				if( (d0 + d1) % 3 == 0 ) {
					System.out.println("YES");
				}
				else
					System.out.println("NO");
				continue;
			}
			k = k - 3;
			
			while( k > 0 ) {
				if( lastdigit == 6 ) {
					long s = k / 4;
					sum += 20*(s);
					
					k -= s * 4;
					
					if( k == 0 ) {
						
					}
					else if( k == 1 ) {
						sum += 2;
						
					}
					else if( k == 2 ) {
						sum += 6;
						
					}
					else if( k == 3 ) {
						sum += 14;
					
					}
					k = 0;
				}
				else if( lastdigit == 0 ) {
					break;
				}
				else {
					lastdigit = (lastdigit * 2) % 10;
					sum += lastdigit;
					k--;
				}
			}
			if( sum % 3 == 0 ) {
				System.out.println("YES");
			}
			else
				System.out.println("NO");
		}
		sc.close();
	}

}
