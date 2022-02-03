
import java.util.Scanner;
public class Qmanav {
	public static void main(String args[]) {

		
		Scanner sc=new Scanner(System.in);
		System.out.println ("ENGLISH MARKS");
		int a=sc.nextInt();
		System.out.println ("HINDI MARKS");
		int b=sc.nextInt();
		System.out.println ("PHYSICS MARKS");
		int c=sc.nextInt();
		System.out.println ("CHEMISTRY MARKS");
		int d=sc.nextInt();
		System.out.println ("MATHEMATICS MARKS");
		int e=sc.nextInt();
		sc.close();
		System.out.println ("PERCENTAGE");
		System.out.println (((a+b+c+d+e)/5)+"%");
	}

}
