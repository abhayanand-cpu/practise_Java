import java.util.Scanner;
public class A8Q13 {
	
	public static boolean isSorted(int[] list) {
		int NoOfComparision = 0;
		int NoOfComparision1 = 0;
		int l = list.length;
		for( int i = 1; i < l; i++ ) {
			if( list[i] >= list[i-1] )
				NoOfComparision++;
			else if( list[i] <= list[i-1] )
				NoOfComparision1++;
		}
		if( NoOfComparision == (l - 1) || NoOfComparision1 == (l - 1) )
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of desired element: ");
		int n = sc.nextInt();
		int list[] = new int[n];
		
		System.out.print("Enter "+n+" elements: ");
		for( int i = 0; i < n; i++ ) {
			list[i] = sc.nextInt();
		}
		if( isSorted(list) )
			System.out.println("The list is already sorted.");
		else
			System.out.println("The list is not sorted.");
		sc.close();
	}

}
