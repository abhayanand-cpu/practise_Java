//Write a java program that reads a 3-by-4 matrix and displays the sum of each column & row.
import java.util.Scanner;
public class A9Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte rows = 3, column = 4;
		int[][] arr = new int[rows][column];
		
		System.out.print("Enter elements: ");
		for( int i = 0; i < rows; i++ ) {
			for( int j = 0; j < column; j++ )
				arr[i][j] = sc.nextInt();
		}
		byte rno = 1;
		for( int i = 0; i < rows; i++ ) {
			int Rsum = 0;
			for( int j = 0; j < column; j++ ) {
				Rsum += arr[i][j];
			}
			System.out.println("Sum of row no."+rno+" is "+Rsum);
			rno++;
		}
		byte cno = 1;
		for( int i = 0; i < column; i++ ) {
			int Csum = 0;
			for( int j = 0; j < rows; j++ ) {
				Csum += arr[j][i];
			}
			System.out.println("Sum of column no."+cno+" is "+Csum);
			cno++;
		}
		sc.close();
	}

}
