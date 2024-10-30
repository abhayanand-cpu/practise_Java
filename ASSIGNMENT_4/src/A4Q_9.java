
import java.util.Scanner;
public class A4Q_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  n = sc.nextInt();
		int i=1;
		for ( i = 1; i<=n; i++) {
			if ( ((int)(Math.pow(2, i)) > n )) 
				break;
		}
		System.out.println((int)(Math.pow(2, --i)));
		sc.close();
	}
	
	
}