import java.io.*;
public class Pattern {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for (int i=1; i<=n; i++) {
			for ( int j=2; j<=i;j++) {
				System.out.print(" ");
			}
			for (int j=n; j>=i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for (int i=1; i<=n; i++) {
			for ( int j=n-1; j>=i;j--) {
					System.out.print(" ");
			}
			for ( int j=1; j<=i; j++) {
					System.out.print("* ");
			}
			
			System.out.println();
		}
		br.close();
	}

}