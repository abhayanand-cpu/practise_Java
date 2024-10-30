import java.util.Scanner;
public class SUMEVOD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long odd = 0;
		long even = 0;
		for( long i = 1; i <= n*2; i++ ) {
			if( i % 2 == 0 )
				even += i;
			else if( i % 2 != 0 )
				odd += i;
		}
		System.out.println(odd+" "+even);
	}

}
