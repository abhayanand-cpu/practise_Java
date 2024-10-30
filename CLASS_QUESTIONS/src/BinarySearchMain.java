//import java.util.Scanner;
//class Binary_Search{
//	int BinarySearch( int []a, int s ) {
//		int l = a.length-1;
//		int i = 0;
//		int j = l;
//		while( i < j ) {
//			int m = (i + j)/2;
//			
//			if( a[m] < s )
//				i = m + 1;
//			else
//				j = m;
//			
//		}
//		if( s == a[i] )
//			return i;
//		else
//			return 0;
//	}
//}
//public class BinarySearchMain {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter the number of element: ");
//		int n = sc.nextInt();
//		
//		int []a = new int[n];
//		System.out.print("Enter "+n+" elements: ");
//		for( int i = 0; i < n; i++ ) {
//			int element = sc.nextInt();
//			a[i] = element;
//		}
//		System.out.print("Element you wanna search for: ");
//		int s = sc.nextInt();
//		Binary_Search b = new Binary_Search();
//		System.out.println("Location of "+s+" is: "+b.BinarySearch(a, s));
//		sc.close();
//	}
//
//}
import java.util.Scanner;
class Binary_Search{
	
	/*int BinarySearch( int []a, int s ) {   // binary search using loops 
		int i = 0;
		int j = a.length-1;;
		while( i <= j ) {
			int m = (i + j)/2;
			
			if( a[m] < s )
				i = m + 1;
			else if( a[m] > s )
				j = m - 1;
			else
				return m;
			
		}
		return -1; 
	}*/
	
	int s;                            // binary search using recursion
	int a[];
	
	void Gets( int s ) {
		this.s = s;
	}
	
	void Geta( int a[] ) {
		this.a = a;
	}
	
	int BinaryS( int i, int j ) {
		
		int m = (i + j)/2;
		
//		if( i < j ) {
			if( i > j )
				return -1;
			
			else if( a[m] == s )      // base case
				return m;
		
			else {                   // recursive case
				if( a[m] < s )
					i = m + 1;
				else if( a[m] > s )
					j = m - 1;
				return BinaryS(i, j);
			}
//		}
//			return -1;	
	}
}

public class BinarySearchMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of element: ");
		int n = sc.nextInt();
		
		int []a = new int[n];
		System.out.print("Enter "+n+" elements: ");
		for( int i = 0; i < n; i++ ) {
			int element = sc.nextInt();
			a[i] = element;
		}
		System.out.print("Element you wanna search for: ");
		int s = sc.nextInt();
		Binary_Search b = new Binary_Search();
		
		/* System.out.println("Location of "+s+" is: "+b.BinarySearch(a, s)); */
		
		int i = 0;
		int j = a.length;
		
		b.Gets(s);
		b.Geta(a);
		
		System.out.println("Location of "+s+" is: "+b.BinaryS(i, j));
		sc.close();
	}

}
