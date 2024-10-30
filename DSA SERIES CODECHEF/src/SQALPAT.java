import java.util.Scanner;
public class SQALPAT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		short v = 1;
		for( int i = 1; i <= n; i++ ){
		    if( i % 2 != 0 ){
		        for( int j = 1; j <= 5; j++ ){
		            System.out.print(v+" ");
		            v++;
		        }
		        System.out.println();
		    }
		    else{
		        v += 5-1;
		        for( int j = 1; j <= 5; j++ ){
		            System.out.print(v+" ");
		            v--;
		        }
		        v += 5+1;
			    System.out.println();
		    }
		}
	}
}
