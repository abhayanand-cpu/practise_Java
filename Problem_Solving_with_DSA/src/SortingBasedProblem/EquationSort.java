package SortingBasedProblem;

import java.util.Arrays;

public class EquationSort {
	
	public static void main( String [] args ) {
		int a[] = { 4,2,7,1,9 };
		int A = 2;
		
		EqSort( a, A );
		System.out.println(Arrays.toString(a));
	}
	
	static void EqSort( int a[], int A ) {
		
		int l = a.length;
		
		for( int i = 0; i < l; i++ ) {
			for( int j = i; j > 0; j-- ) {
				if( EqMore( a[j-1], a[j], A ) )
					swap( a , j-1, j );
			}
		}
	}
	
	static boolean EqMore( int a, int b, int A ) {
		
		int val1 = A * a * a;
		int val2 = A * b * b;
		
		return val1 > val2;
	}
	
	static void swap(int a[], int b, int c ) {
		
		int temp = a[b];
		a[b] = a[c];
		a[c] = temp;
		
	}
}
//import java.util.Arrays;
//import java.util.Comparator;
//
//public class EquationSort {
//    public static void insertionSort(int[] arr, int A) {
//        int n = arr.length;
//        for (int i = 1; i < n; i++) {
//            int current = arr[i];
//            int j = i - 1;
//
//            // Calculate the value A.X^2 for the current element and the previous element
//            int currentEquationValue = A * current * current;
//            int prevEquationValue = A * arr[j] * arr[j];
//
//            // Compare the equation values and move elements if necessary
//            while (j >= 0 && currentEquationValue < prevEquationValue) {
//                arr[j + 1] = arr[j];
//                j--;
//                if (j >= 0) {
//                    prevEquationValue = A * arr[j] * arr[j];
//                }
//            }
//            arr[j + 1] = current;
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {4, 2, 7, 1, 3};
//        int A = 2;
//
//        System.out.println("Original array: " + Arrays.toString(arr));
//        insertionSort(arr, A);
//        System.out.println("Sorted array by A.X^2: " + Arrays.toString(arr));
//    }
//}
