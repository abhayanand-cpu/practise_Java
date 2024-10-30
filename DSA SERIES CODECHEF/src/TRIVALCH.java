import java.util.Scanner;

public class TRIVALCH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if( a+b > c && b+c > a && a+c > b ){
		    int s = (a+b+c)/2;
		    double area = Math.pow(s*(s-a)*(s-b)*(s-c),1/2);
		    if( area > 0 )
		        System.out.println("YES");
		    else
		    System.out.println("NO");
		}
		else
		    System.out.println("NO");
	}

}
