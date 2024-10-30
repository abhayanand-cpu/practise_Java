package ComplexityAnalysisBasicsWarmUp;
import java.util.Arrays;
import java.util.Scanner;
public class LADDU {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int t = sc.nextInt();
//		while( t --> 0 ){
//		    int a = sc.nextInt();
//		    String o = sc.nextLine();
//		    int Laddu = 0;
//		    
//		    while( a --> 0 ){
//		    	
//		        String s = sc.next();
//		        
//		        if( s.equals("TOP_CONTRIBUTOR") )
//		        	Laddu += 300;
//		        
//		        else if( s.equals("CONTEST_WON") ) {
//		        	int i = sc.nextInt();
//		        	if( i < 20 )
//		        		Laddu += 300 + 20 - i;
//		        	else
//		        		Laddu += 300;
//		        }
//		        
//		        else if( s.equals("BUG_FOUND") ) {
//		        	int i = sc.nextInt();
//		        	Laddu += i;
//		        }
//		        
//		        else
//		        	Laddu += 50;
//		    }
////		    System.out.println(Laddu);
//		    int count = 0;
//		    
//		    	if( o.equals(" INDIAN") )
//		    		count = Laddu/200;
//		    	else
//		    		count = Laddu/400;
//		    	
//		    
//		    System.out.println(count);
//		    
//		}
//Scanner in = new Scanner(System.in);
//        
//        // Declare the variable
//int n = in.nextInt();
//int x = in.nextInt();
//int a[] = new int[n];
//int j = 0;
//for( int i = 1; i <= n; i++ ){
//    a[j++] = i;
//}
//System.out.println(Arrays.toString(a));
		int n = sc.nextInt();
		for( int i = 1; i <= 2*n-1; i++ ) {
			if( i <= n ) {
			int k = n;
			for( int j = 0; j <= 2*n-1; j++ ) {
				if( i == 1 || i == n*2-1 )
					System.out.print(n);
				else if( j < i )
					System.out.print(k--);
				else if( j >= i && j < n*2-i )
					System.out.print(n-i+1);
				else
					System.out.print(++k);
			}
			System.out.println();
			}
			else {
				
			}
		}
	}

}
