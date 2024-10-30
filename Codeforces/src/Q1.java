import java.util.Arrays;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//	Q1	int N = sc.nextInt();
//		int A = sc.nextInt();
//		int B = sc.nextInt();
//		int O = N-A;
//		System.out.print(O+" ");
//		System.out.print(O-B);

//	Q2	int t = sc.nextInt();
//		for( int i = 0; i < t; i++ ) {
//			int x = sc.nextInt();
//			int y = sc.nextInt();
//			int c = 0;
//			while( x < y ) {
//				
//				y = y - 8;
//				c++;
//			}
//			System.out.println(c);
//		}
		
		
//	Q3	int n = sc.nextInt();
//		int arr[][] = new int[n][2];
//		for( int i = 0; i < n; i++ ) {
//			int m = sc.nextInt();
//			int j = 0;
//			int k = 0;
//			sc.nextLine();
//			while( m != 0 ) {
//				String s = sc.next();
//				if( s.equals("START38"))
//					j++;
//				else if( s.equals("LTIME108") )
//					k++;
//				m--;
//			}
//				arr[i][0] = j;
//				arr[i][1] = k;
//		}
//		for( int i = 0; i < n; i++ ) {
//			for( int j = 0; j < 2; j++ ) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		
//	Q4	short t = sc.nextShort();
//		int arr[] = new int[t];
//		for( short i = 0; i < t; i++ ) {
//			byte x = sc.nextByte();
//			byte y = sc.nextByte();
//			int sum1 = (500-(x*2))+(1000-((x+y)*4));
//			int sum2 = (1000-(y*4))+(500-((y+x)*2));
//			arr[i] = Math.max(sum1, sum2);
//		}
//		for( int i = 0; i < t; i++ ) {
//			System.out.println(arr[i]);
//		}
//		System.out.println();
		
//	Q5	short t = sc.nextShort();
//		for( int i = 0; i < t; i++ ) {
//			int n = sc.nextInt();
//			int arr[] = new int[n];
//			for( int j = 0; j < n; j++ ) {
//				arr[j] = sc.nextInt();
//			}
//
//			for( int k = 0; k < n-1; k++ ) {
//				if( arr[k] == arr[k+1] )
//					arr[k] = 0;
//			}
//			System.out.println(Arrays.toString(arr));
//			int a = 0;
//			for( int l = 0; l < n; l++ ) {
//				if( arr[l] != 0 )
//					a++;
//			}
//			System.out.println(a);
//		}
		
		short t = sc.nextShort();
		for( int i = 0; i < t; i++ ) {
			int n = sc.nextInt();
			sc.nextLine();
			String s = sc.nextLine();
			s = s.toLowerCase();
			char c[] = s.toCharArray();
			int count = 0;
			byte z = 0;
			for( int j = 0; j < n; j++ ) {
				if( c[j] == 'a' || c[j] == 'e' || c[j] == 'i' || c[j] == 'o' ||c[j] == 'u')
					continue;
				else {
					char le = (char)c[j];
					
					for( char k = le, l = le; k >= 'a' && l <= 'z'; k--, l++ ) {
						
						if( (k == 'a' || k == 'e' || k == 'i' || k == 'o' || k == 'u') && (l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u')) {
						count += 2;
						z++;
						break;
						}
						else if((k == 'a' || k == 'e' || k == 'i' || k == 'o' || k == 'u') || (l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u'))
							break;
					}
				}
			}
			if( z > 0 )
				System.out.println(count);
			else
				System.out.println(count+1);
		}
		sc.close();
	}

}
