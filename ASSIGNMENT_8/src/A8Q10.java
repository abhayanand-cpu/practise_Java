import java.util.Scanner;
public class A8Q10 {

	public static int[] eliminateDuplicates(int[] list) {
		int arr[] = new int[10];
		
		for( int i = 0; i < list.length; i++ ) {
			int count = 0;
			for( int j = i-1; j >= 0; j-- ) {
				if( list[j] == list[i] ) {
					count++;
					break;
				}
			}
			if( count == 0 )
				arr[i] = list[i];
		}
		return arr;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n [] = new int[10];
		System.out.print("Enter ten elements: ");
		for( int i = 0; i < n.length; i++ ) {
			int element = sc.nextInt();
			n[i] = element;
		}
		int arr[] = eliminateDuplicates(n);
		System.out.print("Your distincts elements are: ");
		for( int i = 0; i < arr.length; i ++ ) {
			if( arr[i] != 0 )
				System.out.print(arr[i]+" ");
		}
		sc.close();
	}

}
