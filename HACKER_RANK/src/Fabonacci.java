import java.io.*;
public class Fabonacci {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int a = 0;
		int b = 1;
		
		for ( int i=2; i<=n; i++) {
			int p = b;
			b = b+a;
			a = p;
		}
		System.out.println(b);
		br.close();
	}

}
