import java.io.*;
public class Pattern_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 1; i<=n; i++) {
			for (int j = n-1; j>=i; j--) {
				System.out.print(" ");
			}
			for( int k = 1; k<=2*i-1; k++) {
				if ( k==1 || i==n || k==(2*i-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		br.close();
	}

}
