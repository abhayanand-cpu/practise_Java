import java.util.*;
public class A6Q9 {
	
	public static double LCD( double b, double d ) { 
		double i = b, j = d;
		while( true ) {
			if( i > j )
				j = j + d;
			else if( i < j )
				i = i + b;
			else {
				System.out.println("Lowest common denominator of "+b+" and "+d+" is "+i);
				break;
			}
		}
		return i;
	}
	
	public static double sum( double a, double b, double c, double d) {
		double LCD2 = LCD(b,d);
		return (( LCD2 / b * a ) / LCD2 ) + (( LCD2 / d * c ) / LCD2 );
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Numerator in first fraction: ");
		double a = sc.nextDouble();
		System.out.print("Enter Denominator in first fraction: ");
		double b = sc.nextDouble();
		System.out.print("Enter Numerator in second fraction: ");
		double c = sc.nextDouble();
		System.out.print("Enter Denominator in second fraction: ");
		double d = sc.nextDouble();
		
		System.out.print(a+"/"+b+" + "+c+"/"+d+" = "+sum(a,b,c,d));
		
		sc.close();
	}

}
