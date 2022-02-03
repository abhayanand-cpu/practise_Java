import java.util.Scanner;
public class Q_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter investment amount: ");
		float a = sc.nextFloat();
		System.out.print("Enter annual interest rate in percentage: ");
		float b = sc.nextFloat();
		System.out.print("Enter number of years: ");
		float c = sc.nextFloat();
		b/= 1200;
	    double d = a*(Math.pow((1+b),c*12));
	    System.out.print("Accumulated value is $ "+d);
	    sc.close();
	}

}
