import java.util.Scanner;
public class EXTRICHK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if( a+b > c && b+c > a && a+c > b ){
		    int s = (a+b+c)/2;
		    double area = Math.pow(s*(s-a)*(s-b)*(s-c),1/2);
		    if( area > 0 ){
		        if( (a == b && a == c) )
		        	System.out.println("1");
		        else if( (a == b && c != a) || (a == c && b != a) || (b == c && a != b) )
		        	System.out.println("2");
		        else
		        	System.out.println("3");
		    }
		    else
		    	System.out.println("-1");
		}
		else
			System.out.println("-1");
	}
}
