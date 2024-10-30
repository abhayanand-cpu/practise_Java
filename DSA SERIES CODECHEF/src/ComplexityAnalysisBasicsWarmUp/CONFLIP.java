package ComplexityAnalysisBasicsWarmUp;
//import java.util.Arrays;
import java.util.Scanner;
public class CONFLIP {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		int t = sc.nextInt();
//		while( t --> 0 ){
//		    int G = sc.nextInt();
//		    while( G --> 0 ){
//		    int I = sc.nextInt();
//		    int N = sc.nextInt();
//		    int Q = sc.nextInt();
//		    int a[] = new int[N];
//		    if( I == 1 ){
//		    	int k = 0;
//		        while( k < N ){
//		            a[k++] = I;
//		        }
////		        System.out.println(Arrays.toString(a));
//		        for( int i = 0; i < N; i++ ){
//		            for( int j = 0; j <= i; j++ ){
//		                if( a[j] == 2 )
//		                    a[j] = 1;
//		                else
//		                    a[j] = 2;
//		            }
//		        }
////		        System.out.println(Arrays.toString(a));
//		    }
//		    else{
//		    	int k = 0;
//		        while( k < N ){
//		            a[k++] = I;
//		        }
////		        System.out.println(Arrays.toString(a));
//		        for( int i = 0; i < N; i++ ){
//		            for( int j = 0; j <= i; j++ ){
//		            	if( a[j] == 2 )
//		                    a[j] = 1;
//		                else
//		                    a[j] = 2;
//		            }
//		        }
////		        System.out.println(Arrays.toString(a));
//		    }
//		    int count = 0;
//		    if( Q == 1 ) {
//		    	for( int i = 0; i < N; i++ ) {
//		    		if( a[i] == 1 )
//		    			count++;
//		    	}
//		    }
//		    else {
//		    	for( int i = 0; i < N; i++ ) {
//		    		if( a[i] == 2 )
//		    			count++;
//		    	}
//		    }
//		    System.out.println(count);
//		}
//	}
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while( t --> 0 ){
		    int G = sc.nextInt();
		    while( G --> 0 ){
		    int I = sc.nextInt();
		    int N = sc.nextInt();
		    int Q = sc.nextInt();
		    
		    if( I == 1 ){
		        if( N % 2 == 0 ) {
		        	if( Q == 1 )
		        		System.out.println(N/2);
		        	
		        	else 
		        		System.out.println(N/2);
		        	
		        }
		        else {
		        	if( Q == 1 )
		        		System.out.println(N/2);
		        	else
		        		System.out.println((N/2)+1);
		        }
		    }
		    else{
		    	if( N % 2 == 0 ) {
		        	if( Q == 1 )
		        		System.out.println(N/2);
		        	
		        	else 
		        		System.out.println(N/2);
		        	
		        }
		        else {
		        	if( Q == 1 )
		        		System.out.println((N/2)+1);
		        	else
		        		System.out.println(N/2);
		        }
		    }
		}
	}
		sc.close();
	}
}
