import java.util.Arrays;
import java.util.Scanner;
public class CheckPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();
        int a[] = new int[2*p];
        boolean flag = false;
        int count = 0;
            
        	for( int i = 0; i < a.length; i++ ) {
        		a[i] = sc.nextInt();
        	}
        	
        	System.out.println(Arrays.toString(a));
        	
        	for( int i = 0; i < a.length; i += 2 ) {
        		int j = i + 1;
        		int k = 0;
        		while( k < a.length ) {
        			
        			if( a[k] == a[i] )
        				a[k] = -1;
        			
        			if( a[k] == a[j] && i != a.length - 1 )
        				a[k] = -1;
        			
        			k++;
        		}
        		count++;
        		System.out.println(Arrays.toString(a));
        		int l = 0;
        		while( l < a.length ) {
        			if( a[l] != -1 ) {
        				flag = true;
        				break;
        			}
        			l++;
        		}
        		
        		if( flag == false ) {
        			break;
        		}
        		
        	}
        System.out.println(count);
	}

}
