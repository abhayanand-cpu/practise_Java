import java.util.Scanner;
public class FINDMELI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int k = sc.nextInt();
		int a[] = new int[t];
		byte b = 0;
		for( int i = 0; i < t; i++ ){
		    a[i] = sc.nextInt();
		    if( a[i] == k ){
		        System.out.println("1");
		        b++;
		        break;
		    }
		}
		if( b == 0 )
		    System.out.println("-1");

	}

}
