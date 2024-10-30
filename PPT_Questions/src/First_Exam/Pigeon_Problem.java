package First_Exam;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Pigeon_Problem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
       
        while( t --> 0 ) {
        	
        	int m = sc.nextInt();
            int n = sc.nextInt();
            int a[] = new int[n];
        	
        	for( int i = 0; i < a.length; i++ ) {
            	a[i] = sc.nextInt();
            }
        	
        	Arrays.sort(a);
//            System.out.println(Arrays.toString(a));
        	
        	int i = 0;
        	int j = a.length - 1;
        	int count = 0; 
        	boolean flag1 = false;
//        	boolean flag2 = false; 
        	
        	while( i < j ) {
        		
        		if( a[j] == m ) {
        			count++;
        			j--;
        		}
        		else if( a[j] > m ) {
        			j--;
        		}
        		
        		else {
        			
        			while( a[j] == -1 ) {
        				j--;
        				if( j == 0 )
        					break;
        			}
        				
        			int sum = m - a[j];
        			
        			while( a[i] <= sum && i < j ) {
        				flag1 = true;
        				i++;
        			}
        			
        			if( flag1 == true ) {
        				--i;
        				flag1 = false;
        			}
        			
        			while( a[i] <= sum && a[i] == -1  ) {
        				i--;
//        				flag2 = true;
        				if( i < 0 ) {
        					++i;
        					break;
        				}
        					
        			}
        			
//        			if( flag2 == true ) {
//        				++i;
//        				flag2 = false;
//        			}
        			
        			a[i] = -1;
        			a[j] = -1;
        			count++;
        			j--;
        			i = 0;
        		}
        	}
        	System.out.println(count);
        }
	}

}
