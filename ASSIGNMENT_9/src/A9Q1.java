//1. Write a java program to print M-by-N array in the tabular format.
//import java.util.Arrays;
import java.util.Scanner;
public class A9Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No. of rows and column: ");
		int M = sc.nextInt();
		int N = sc.nextInt();
		int[][] arr = new int[M][N];
		System.out.print("Enter elements: ");
		for( int i = 0; i < arr.length; i++ ) {
			for( int j = 0; j < arr[i].length; j++ ) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("your desired array is:--");
		for( int i = 0; i < arr.length; i++ ) {
			for( int j = 0; j < arr[i].length; j++ ) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
//		for( int i = 0; i < arr.length; i++ ) {
//			System.out.println(Arrays.toString(arr[i]));
//		}
//		for( int[] i : arr ) {
//			System.out.println(Arrays.toString(i));
//		}
		sc.close();
	}

}
