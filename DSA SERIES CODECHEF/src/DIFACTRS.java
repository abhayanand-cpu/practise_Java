import java.util.Scanner;
public class DIFACTRS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for( int i = 1; i <= n; i++ ){
		    if( n % i == 0 )
		        count++;
		}
		System.out.print(count+" ");
		for( int i = 1; i <= n; i++ ){
		    if( n % i == 0 )
		        System.out.print(i+" ");
		}
		System.out.println();
	}

}
