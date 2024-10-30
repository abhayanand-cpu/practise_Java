import java.util.Scanner;
public class twoDArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a[][] = new int[6][6];
		
		for( int i = 0; i < 6; i++ ) {
			for( int j = 0; j < 6; j++ ) {
				a[i][j] = sc.nextInt();
			}
		}
		
		
		sc.close();
	}

}
