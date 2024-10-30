package ComplexityAnalysisBasicsWarmUp;
import java.util.Arrays;
import java.util.Scanner;

public class LAPIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		byte t = sc.nextByte();
		sc.nextLine();
		for( byte i = 0; i < t; i++ ){
		    String s = sc.next();
		    char c[] = s.toCharArray();
		    int l = c.length;
		    
		    if( l % 2 == 0 ) {
		    	char temp;
		    	for( int j = 0; j < l/2; j++ ) {
		    		for( int k = j+1; k < l/2; k++ ) {
		    			if( c[k] < c[j] ) {
		    				temp = c[k];
		    				c[k] = c[j];
		    				c[j] = temp;
		    			}
		    		}
		    	}
		    	for( int j = l/2; j < l; j++ ) {
		    		for( int k = j+1; k < l; k++ ) {
		    			if( c[k] < c[j] ) {
		    				temp = c[k];
		    				c[k] = c[j];
		    				c[j] = temp;
		    			}
		    		}
		    	}
		    }
		    else if( l % 2 != 0 ) {
		    	char temp;
		    	for( int j = 0; j < l/2; j++ ) {
		    		for( int k = j+1; k < l/2; k++ ) {
		    			if( c[k] < c[j] ) {
		    				temp = c[k];
		    				c[k] = c[j];
		    				c[j] = temp;
		    			}
		    		}
		    	}
		    	for( int j = l/2+1; j < l; j++ ) {
		    		for( int k = j+1; k < l; k++ ) {
		    			if( c[k] < c[j] ) {
		    				temp = c[k];
		    				c[k] = c[j];
		    				c[j] = temp;
		    			}
		    		}
		    	}
		    }
//		    System.out.println(Arrays.toString(c));
		    int k;
		    if( l % 2 != 0 )
		    	k = l/2+1;
		    else
		    	k = l/2;
		    byte z = 0;
		    for( int j = 0; j < l/2; j++ ) {
		    	
		    	if( c[j] == c[k++] )
		    		continue;
		    	else {
		    		System.out.println("NO");
		    		z++;
		    		break;
		    	}
		    }
		    if( z == 0 ) {
		    	System.out.println("YES");
		    }
		}
	}
}
