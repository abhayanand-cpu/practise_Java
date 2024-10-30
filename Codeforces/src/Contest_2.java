import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Contest_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//	Q1	short t = sc.nextShort();
//		for( short i = 0; i < t; i++ ) {
//			short x = sc.nextShort();
//			short y = sc.nextShort();
//			int result = 10*x+90*y;
//			System.out.println(result);
//		}
//		
		
//	Q2	int arr[] = new int[4];
//		for( int i = 0; i < 4; i++ ) {
//			arr[i] = sc.nextInt();
//		}
//		int a = 0;
//		for( int i = 0; i < 4; i++ ) {
//			if(arr[i] >= 10 )
//				a++;
//		}
//		System.out.println(a);
		
//	Q3	short t = sc.nextShort();
//		for( int i = 0; i < t; i++ ) {
//			int n = sc.nextInt();
//			int que = 3;
//			int arr[] = new int[4];
//			while( que != -1 ) {
//				arr[que] = sc.nextInt();
//				que--;
//			}
//			
//			int max = arr[0];
//			for( int j = 1; j < 4; j++ ) {
//				if( max < arr[j] )
//					max = arr[j];
//			}
//			System.out.println(max);
//		}
//	Q4	byte t = sc.nextByte();
//		for( int i = 0; i < t; i++ ) {
//			short s = sc.nextShort();
//			int ar[] = new int[s];
//			for( short j = 0; j < s; j++ ) {
//				ar[j] = sc.nextInt();
//			}
//			int k;
//			for( k = s-1; k >= 0; k-- ) {
//				if(ar[k] != 0) {
//					break;
//				}
//				else
//					continue;
//			}
//			System.out.println(k);
//		}
//		short t = sc.nextShort();
//		for( int i = 0; i < t; i++ ) {
//			int s = sc.nextInt();
//			sc.nextLine();
//			String s1 = sc.nextLine();
//			char s3[] = s1.toCharArray();
//			int op = 0;
//			for( int j = 0,k = s-1; j < s && k >= 0; j++, k-- ) {
//				if( s3[j] == s3[k] )
//					continue;
//				else {
//					int s4 = (s3[j] ^ s3[k]);
//					s3[j] = '1';
//					s3[k] = '1';
//					op++;
//				}
//			}
////			System.out.println(Arrays.toString(s3));
//			System.out.println(op);
//		}
		
//	Q8	int t = sc.nextInt();
//		for( int i = 0; i < t; i++ ) {
//			int n = sc.nextInt();
//			int arr[] = new int[n];
//			StringBuilder s = new StringBuilder();
//			int count = 0;
//			
//			for( int j = 0; j < n; j++ ) {
//				arr[j] = sc.nextInt();
//				s.append(arr[j]);
//				if( arr[j] % 7 == 0 )
//					count++;
//			}
//			int o = Integer.parseInt(s.toString());
//			if(  o % 7  == 0 )
//				count++;
//			
//			int e = (n*(n-1))/2;
//			String a[] = new String[e];
//			
//			int l = 0;
//			for( int j = 0; j < n; j++ ) {
//				if( n == 2 )
//					break;
//				for( int k = j + 1; k < n; k++ ) {
//					a[l] = ""+arr[j]+arr[k];
//					int m = Integer.parseInt(a[l]);
//					if( m % 7 == 0 )
//						count++;
//					l++;
//				}
//			}
//			System.out.println(count);
//		}
		
//	Q7	int t = sc.nextInt();
//		for( int i = 0; i < t; i++ ) {
//			int n = sc.nextInt();
//			int arr[] = new int[n];
//			for( int j = 0; j < n; j++ ) {
//				arr[i] = sc.nextInt();
//			}
//			int l = 0;
//			int count = 1;
//			for( int k = 0; k < n; k++ ) {
//				for( int m = k + 1; m < n; m++ ) {
//					
//				}
//			}
//		}
//		int t = sc.nextInt();
//		for( int i = 0; i < t; i++ ) {
//			int n = sc.nextInt();
//			long arr[] = new long[n];
//			
//			for( int j = 0; j < n; j++ ) {
//				arr[j] = sc.nextLong();
//			}
//			int count = 0;
//			for( int l = 0; l < n; l++ ) {
//				if( arr[l] == 0 ) {
//					continue;
//				}
//				else {
//					count++;
//				for( int k = 0; k < n; k++ ) {
//					if( (arr[k] & 1) == 1 && arr[k] != 0 ) {
//						arr[k] = arr[k] - 2;
//					}
//					else if( arr[k] != 0 ) {
//						arr[k] = arr[k] - 1;
//					}
//				}
//				}
//			}
//			System.out.println(count);
//		}
		int t = sc.nextInt();
		for( int i = 0; i < t; i++ ) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			
			ArrayList<Integer> a = new ArrayList<Integer>();
			for( int j = 0; j < n - 1; j++ ) {
				int u = sc.nextInt();
				int v = sc.nextInt();
				int x = sc.nextInt();
				if(	x == 1 ) {
					a.add(u);
					a.add(v);   //1 3 6 5 4 7 8
				}
				System.out.println(a);
			}
			
		}
		sc.close();
		
	}

}
