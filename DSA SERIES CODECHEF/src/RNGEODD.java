import java.util.Scanner;
public class RNGEODD {
	
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int R = sc.nextInt();
		for( int i = L; i <= R; i++ ){
		    if( i % 2 != 0 )
		        System.out.print(i+" ");
		}
	}

}
