//import java.util.Scanner;
//public class A5Q17 {
//	public static void squareroot(int a) {
//		double error = 0.000001;
//		double pre_guess = 1;
//		double diff = 1, guess = 1;
//		
//		while( error < diff ){
//			
//			guess = pre_guess-((pre_guess*pre_guess-a)/(2*pre_guess));
//			
//			diff = Math.abs( guess - pre_guess );
//			
//			pre_guess = guess;
//			
//		}
//		
//		System.out.println(guess);
//		
//	}
//	public static void main(String[] args) {
//		Scanner sc  = new Scanner(System.in);
//		System.out.print("Enter a number to find their square root: ");
//		
//		int a = sc.nextInt();
//		squareroot(a);
//		
//		sc.close();
//	}
//
//}
import java.util.Scanner;
public class A5Q17{
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		double g1, g2;
		System.out.println("Enter a number");
		double num = sc.nextDouble();
		g2 = num/2;
		do {
			g1 = g2;
			System.out.print(g1+"\t"+g2+"\n");
			g2 = (g1+(num/g1))/2;
		}while(g1 - g2 > 0.0000001);
		System.out.println("Square root is "+g2);
		sc.close();
	}
}