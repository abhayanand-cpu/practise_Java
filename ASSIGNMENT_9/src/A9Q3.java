//3. Write a java program that reads a 4-by-4 matrix and displays the sum of all its elements on the diagonals.
import java.util.Scanner;
public class A9Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte rows = 4, column = 4;
		int[][] arr = new int[rows][column];
		
		System.out.print("Enter elements: ");
		for( int i = 0; i < rows; i++ ) {
			for( int j = 0; j < column; j++ )
				arr[i][j] = sc.nextInt();
		}
		int D1sum = 0;
		for( int i = 0; i < rows; i++ ) {
			for( int j = 0; j < column; j++ ) {
				if( arr[i] == arr[j] )
					D1sum += arr[i][j];
			}
		}
		System.out.println("Sum of 1st diagonal element is: "+D1sum);
		
		int D2sum = 0; byte Ocolumn = column;
		for( int i = 0; i < rows; i++ ) {
			D2sum += arr[i][--Ocolumn];	
		}
		
		System.out.println("Sum of 2nd diagonal element is: "+D2sum);
		
		sc.close();
	}
}
