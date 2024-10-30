package SortingBasedProblem;

import java.util.Arrays;

public class Partition01 {
	
	static int par( int a[] ) {
		
		int s = 0;
		int e = a.length - 1;
		int swaps = 0;
		
		while( s < e ) {
			while( a[s] == 1 )
				s++;
		
			while( a[e] == 0 )
				e--;
			
			if( s < e ) {
				int temp = a[s];
				a[s] = a[e];
				a[e] = temp;
				swaps++;
			}
		}
		
		return swaps;
	}

	public static void main(String[] args) {
		
		int a[] = {0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1};
		int b = par(a);
		
		for( int i: a )
			System.out.print(i+" ");
		System.out.print("No of swaps: "+b);
	}
}


//public class Partition01{
//public static int Partition(int[] arr, int size) {
//int left = 0;
//int right = size - 1;
//int count = 0;
//while (left < right) {
//while (arr[left] == 0)
//left += 1;
//while (arr[right] == 1)
//right -= 1;
//if (left < right) {
//	int temp = arr[left];
//	arr[left] = arr[right];
//	arr[right] = temp;
//count += 1;
//}} return count;
//}
//// Testing code
//public static void main(String[] args) {
//int arr[] = { 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1 };
//Partition(arr, arr.length);
//System.out.println(Arrays.toString(arr));
//}
//}
