import java.util.*;
public class Let_s_review {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	       byte t = sc.nextByte();
	       for( int i = 1; i<=t; i++ ){
	           String s = sc.next();
	           char[] mystringArry = s.toCharArray();
//	           char store1 = ' ';char store2 = ' ';
	           for( int j = 0; j<s.length(); j++){
	        	   if( j%2==0 ) {
	        		  System.out.print(mystringArry[j]);
	        	   }
	           }
	           System.out.print(" ");
	           for(int j = 0; j<s.length(); j++) {
	        	   if( j%2!=0 ) {
	        		   System.out.print( mystringArry[j]);
	        	   }
	           }   
	           
	           System.out.println();
	       }
	      sc.close();
	}

}