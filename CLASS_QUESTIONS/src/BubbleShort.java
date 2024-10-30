
//import java.util.Scanner;
//class Shorting{
//	void SetShorting( int []n ) {
//		for( int i = 1; i < n.length; i++ ) {
//			for( int j = 0; j < n.length-i; j++ ) {
//				if( n[j] < n[j+1] )
//					continue;
//				else {
//					int c = n[j];
//					n[j] = n[j+1];
//					n[j+1] = c;
//				}
//			}
//		}
//		System.out.print("After Shorting elements are: ");
//		for(int i = 0; i < n.length; i++ ) {
//			System.out.print(n[i]+" ");
//		}
//	}
//}
//public class BubbleShort {
//	
//	public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	
//	System.out.print("Enter the number of element: ");
//	int n [] = new int[sc.nextInt()];
//	
//	System.out.print("Enter "+n.length+" elements: ");
//	for(int i = 0; i < n.length; i++ ) {
//		int elements = sc.nextInt();
//		n[i] = elements;
//	}
//	
//	System.out.print("Before Shorting elements are: ");
//	for( int i = 0; i < n.length; i++ ) {
//		System.out.print(n[i]+" ");
//	}
//	System.out.println();
//	Shorting b = new Shorting();
//	b.SetShorting(n);
//	sc.close();
//	}
//
//}
import java.util.Scanner;
class Shorting{
	void SetShorting( int []n ) {
		int l = n.length;
		for( int i = 1; i < l; i++ ) {
			for( int j = 0; j < l-i; j++ ) {
				if( n[j] > n[j+1] ) {
					int c = n[j];
					n[j] = n[j+1];
					n[j+1] = c;
				}
			}
		}
		System.out.print("After Shorting elements are: ");
		for(int i = 0; i < n.length; i++ ) {
			System.out.print(n[i]+" ");
		}
	}
}
public class BubbleShort {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the number of element: ");
	int s = sc.nextInt();
	int n [] = new int[s];
	
	System.out.print("Enter "+s+" elements: ");
	for(int i = 0; i < s; i++ ) {
		int elements = sc.nextInt();
		n[i] = elements;
	}
	
	System.out.print("Before Shorting elements are: ");
	for( int i = 0; i < s; i++ ) {
		System.out.print(n[i]+" ");
	}
	System.out.println();
	Shorting b = new Shorting();
	b.SetShorting(n);
	sc.close();
	}

}