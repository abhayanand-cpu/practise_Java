import java.util.Scanner;
public class A6Q11 {
	
	public static int count(String str, char a) {
		
		int count = 0;
		for( int i = 0; i < str.length(); i++ ) {
			if( str.charAt(i) == a )
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		String str = sc.next();
		char a = sc.next().charAt(0);
		System.out.println(count(str,a));
		
		sc.close();
	}
	
}
