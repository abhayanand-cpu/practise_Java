import java.util.Scanner;
public class A8Q9 {
	
	public static double deviation(double[] x, double m) {
		int l = x.length;
		double deviation = 0;
		for( int i = 0; i < l; i++ ) {
			deviation += Math.pow(x[i] - m, 2);
		}
		return Math.sqrt(deviation/(l - 1));
	}
	
	public static double mean( double[] x) {
		int l = x.length;
		double sum = 0;
		
		for( int i = 0; i < l; i++ ) {
			sum += x[i];
		}
		return sum / l;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double n [] = new double[10];
		
		System.out.print("Enter ten numbers: ");
		for( int i = 0; i < n.length; i++ ) {
			double element = sc.nextDouble();
			n[i] = element;
		}
		double mean = mean(n);
		System.out.printf("The mean is: %.2f%n",mean);
		System.out.printf("The standard deviation is: %.5f%n",deviation(n,mean));
		sc.close();
	}

}
