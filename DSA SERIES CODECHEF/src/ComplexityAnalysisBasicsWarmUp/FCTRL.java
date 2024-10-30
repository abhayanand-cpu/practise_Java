package ComplexityAnalysisBasicsWarmUp;
import java.util.Scanner;
public class FCTRL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for( int i = 0; i < t; i++ ){
		    long n = sc.nextLong();
		    long a = 0;
		    long b = 5;
		    while(b <= n){
		        a += (n/b);
		        b *= 5;
		    }
		    System.out.println(a);
		}
		
	}

}
