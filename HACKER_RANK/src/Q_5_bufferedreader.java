//import java.io.*;
//public class Q_5_bufferedreader {
//
//	public static void main(String[] args)throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int a = Integer.parseInt(br.readLine());
//		for (int i = 1; i<=10; i++) 
//			System.out.printf("%d x %d = %d%n",a,i,(a*i));
//		
//		br.close();
//	}
//
//}
import java.io.*;
public class Q_5_bufferedreader{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		
		int sum = n+m;
		System.out.printf("%d + %d = %d", n,m,sum);
		br.close();
	}
}