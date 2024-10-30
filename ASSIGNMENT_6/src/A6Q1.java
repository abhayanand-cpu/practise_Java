import java.util.Scanner;
public class A6Q1 {
	public static int additionSimple(int x, int y) {
		return x+y;
	}
	public static int subtractionSimple(int x, int y) {
		return y-x;
	}
	public static int multiplicationSimple(int x, int y) {
		return x*y;
	}
	public static double divisionSimple(int x, int y) {
		double res = 0;
		if( x != 0 ) {
			res =  y/x;
		}
		return res;
	}
	public static int remainderSimple(int n, int m) {
		return n%m;
	}
	public static double squareRootSimple(int n) {
		double sqroot = 0;
		if( n > 0 ) {
		sqroot =  Math.sqrt(n);
		}
		return sqroot;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ch;
		
		do {
			System.out.println("1. Addition");
			System.out.println("2. Substraction");
			System.out.println("3. multiplication");
			System.out.println("4. division");
			System.out.println("5. remainder");
			System.out.println("6. Square root");
			System.out.println("7. Exit");
			System.out.print("Enter your choice: ");
			ch = sc.nextInt();
			
			switch( ch ) {
			case 1:
				System.out.print("Enter first number: ");
				int x = sc.nextInt();
				System.out.print("Enter Second number: ");
				int y = sc.nextInt();
				System.out.println(x +" + "+ y+ " = "+additionSimple(x,y));
				break;
			case 2:
				System.out.print("Enter first number: ");
				 x = sc.nextInt();
				System.out.print("Enter Second number: ");
				 y = sc.nextInt();
				System.out.println(y +" - "+ x+" = "+subtractionSimple(x,y));
				break;
			case 3:
				System.out.print("Enter first number: ");
				 x = sc.nextInt();
				System.out.print("Enter Second number: ");
				 y = sc.nextInt();
				System.out.println(x +" * "+ y+" = "+multiplicationSimple(x,y));
				break;
			case 4:
				System.out.print("Enter first number: ");
				 x = sc.nextInt();
				System.out.print("Enter Second number: ");
				 y = sc.nextInt();
				System.out.println(y +" / "+ x+" = "+divisionSimple(x,y));
				break;
			case 5:
				System.out.print("Enter first number: ");
				int n = sc.nextInt();
				System.out.print("Enter Second number: ");
				int m = sc.nextInt();
				System.out.println(n +" % "+ m+" = "+remainderSimple(n,m));
				break;
			case 6:
				System.out.print("Enter number you want to do square root: ");
				n = sc.nextInt();
				System.out.println("Square root of "+n+" = "+squareRootSimple(n));
				break;
			}
		}while( ch != 7 );
		
		
		
		sc.close();
	}

}
