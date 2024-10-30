
import java.util.*;
public class A5Q12 {
	public static int factorial(int count) {
		int fact = 1;
		for(int j=1; j<=count; j++) {
			fact *= j;
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of x: ");
		float x = sc.nextFloat();
		x = (float)Math.toRadians(x);
		
		int sign = -1;
	    float error = 0.000001f,series = 0,Final = 0,countFact;
		int count = 0;
		do {
			countFact = factorial(count);
			sign *= -1;
			series = sign*(float)(Math.pow(x, count)/countFact);
			Final += series;
			count += 2;
		}while( error <= Math.abs( Math.cos(x) - Final ));
		System.out.println(Final);
		
		sc.close();
	}

}


