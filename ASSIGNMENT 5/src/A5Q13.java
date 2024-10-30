import java.util.*;
public class A5Q13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of terms: ");
		int n = sc.nextInt();
		System.out.print("Enter the value of x: ");
		double x = sc.nextDouble();
	    
		double sum = 1; double series = 0;
		
	    for(int i = 1; i<=n; i++) {
			series = Math.pow(x, i);
			
			int fact = 1;
			
			for(int j = 1; j<=i; j++) {
				fact *= j;
			}
			
			double term = series/fact;
		    sum += term;
		}
		System.out.println(sum);
		sc.close();
	}

}
