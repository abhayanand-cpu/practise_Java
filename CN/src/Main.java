
import java.util.Arrays;
import java.util.Scanner;
class Main{
  public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Cipher code to decrypt: ");
	String s = sc.nextLine();
	s = s.toLowerCase();
	s = s.replace(" ","");
	  
    char a[] = s.toCharArray();
    char b[] = new char[26];
    int c[] = new int[a.length];
    int j = 0;
    for(char i='a'; i<='z'; i++){
      b[j++]=i;
    }
    for(int i=0; i<a.length; i++){
      c[i] = (int)a[i] % 97;
    }
    
    int k = 1;
    while( k < 30  ){
      char d[] = new char[a.length];
      
      for(int i=0; i<a.length; i++){
    	  int e = c[i] - k;
    	  
    	  if( e < 0 ) {
    		  e = e * -1;
    		  
    		  if( e <= 26 ) {
    			  e = 26 - e;
    		  }
    		  else if( e > 26 ) {
    			  e = e % 26;
    			  e = 26 - e;
    		  }
    	  }
    	  d[i] = b[e];
      }
      System.out.println("for k = "+k+" => "+Arrays.toString(d));
      k++;
    }
    sc.close();
  }
}
