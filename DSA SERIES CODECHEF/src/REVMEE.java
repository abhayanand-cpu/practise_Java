import java.util.Scanner;
public class REVMEE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int a[] = new int[t];
		for( int i = 0; i < t; i++ ){
		    a[i] = sc.nextInt();
		}
		for( int i = t-1; i >= 0; i-- ){
		    System.out.print(a[i]+" ");
		}

	}

}
