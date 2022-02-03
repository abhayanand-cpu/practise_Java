import java.util.Scanner;
public class A3Q_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter three integers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if( a>b && a>c && b>c && b<a && c<a && c<b)
			System.out.println(c+" "+b+" "+a);
		else if( b>a && b>c && a>c && b>a && c<b && c<a)
			System.out.println(c+" "+a+" "+b);
		else if( b>c && b>a && c<b && c>a && a<b && a<c)
			System.out.println(a+" "+c+" "+b);
		else if( a>c && a>b && c<a && c>b && b<a && b<c)
			System.out.println(b+" "+c+" "+a);
		else if( c>a && c>b && a>b && a<c && b<c && b<a)
			System.out.println(b+" "+a+" "+c);
		else
			System.out.println(a+" "+b+" "+c);
		
		sc.close();
	}

}
