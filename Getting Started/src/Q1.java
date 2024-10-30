import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

//class employee{
//	
//	String name;
//	int id;
//	
//	employee( String name, int id ){
//		this.name = name;
//		this.id = id;
//	}
//	
//	
//}

/*class gene<t>{
	
	t t1;
	t t2;
	
	gene( t t1, t t2 ){
		
		this.t1 = t1;
		this.t2 = t2;
		
	}
	
	<t> boolean check(){
		
		if( t1.equals(t2) )
			return true;
		else
			return false;
		
	}
	
}*/

/*class myException extends Exception{
	
	
	myException(String s){
		super(s);
	}
	
	
}*/

public class Q1 {
	
//	 static int[] tri(int a) {
//		 int ar[] = new int[a-1];
//		 if( a == 1 ) {
//			 ar[0] = 1;
//			 return ar;
//		 }
//		 if( a == 2 )
//			 ar[0] = 
//			 
//	 }
//	static boolean isPresent( HashMap<String,Integer> h ) {
//		if( h.containsValue(0) )
//			return true;
//		else
//			return false;
//	}
	 
	public static void main(String[] args)throws IOException {
		Scanner sc = new Scanner(System.in);
//		int  t = sc.nextInt();
//        for( int  i = 0; i < t; i++ ){
//            int n = sc.nextInt();
//            String s = Integer.toString(n);
//            String s1 = "";
//            for( int j = 0; j < s.length(); j++ ) {
//            	s1 = s.charAt(j) + s1;
//            }
//            System.out.println(Integer.parseInt(s1));
//        }
//	       double x = sc.nextDouble();
//	       double y = sc.nextDouble();
//	       if( x % 5 == 0 && (y-x) >= 0.5 )
//	            System.out.println(y-x-0.50);
//	       else if( (x % 5 != 0) || (x > y) || (x == y) )
//	            System.out.println(y);
		
//		  int t = sc.nextInt();
//		  for( int i = 0; i < t; i++ ){
//		      int a = sc.nextInt();
//		      String s = Integer.toString(a);
//		      char[] z = s.toCharArray(); 
//		      int b = z[0] - '0';
//		      int c = z[z.length-1] - '0';
//		      System.out.println(b+c);
//		  }
//		int t = sc.nextInt();
//	    for( int i = 0; i < t; i++ ){
//	        int a = sc.nextInt();
//	        String s = Integer.toString(a);
//	        int count = 0;
//	        for( int j = 0; j < s.length(); j++ ){
//	            if( s.charAt(j) == '4' )
//	                count++;
//	        }
//	        System.out.println(count);
//	    }
		
//		int t = sc.nextInt();
//		for( int i = 0; i < t; i++ ){
//		    char c = sc.next().charAt(0);
//		    if( c == 'b' || c == 'B' )
//		        System.out.println("BattleShip");
//		    else if( c == 'c' || c == 'C' )
//		        System.out.println("Cruiser");
//		    else if( c == 'd' || c == 'D' )
//		        System.out.println("Destroyer");
//		    else if( c == 'f' || c == 'F' )
//		        System.out.println("Frigate");
//		}
//		int ar[] = {6,2,5,5,4,5,6,3,7,6};
//		int t = sc.nextInt();
//		for( int i = 0; i < t; i++ ){
//		    int a = sc.nextInt();
//		    int b = sc.nextInt();
//		    String s = Integer.toString(a);
//		    String s1 = Integer.toString(b);
//		    String s3 = s + s1;
//		   
//		    int sum = 0;
//		    for( int j = 0 ; j < s3.length(); j++ ){
//		    	int z = s3.charAt(j) - '0';
//		        sum = sum + ar[z];
//		    }
//		    System.out.println(sum);
//		}
//		int ar[] = {1,1};
//		int t = sc.nextInt();
//		 for( int i = 0; i < t; i++ ){
//			 int b = sc.nextInt();
//			 int array[] = new int[b];
//		     
//		     if( b == 1 )
//		    	 System.out.print(ar[0]);
//		     else if( b == 2 )
//		    	 System.out.print(ar[0]+" "+ar[1]);
//		     else {
//		    	 for( int  k = 0; k < array.length - 2; k++ ) {
//		    		 for( int j = 0; j < array.length; j++ ) {
//		    			
//		    			 
//		    			 if( j == 0 || j == ar.length )
//				    		 array[j] = 1;
//		    			 else {
//		    				 array[j] = ar[j] + ar[j-1];
//		    			 }
//		    			 ar = array;
//		    		 }
//		    		 
//		    	 }
//		    	 
//		    	for( int l = 0; l < array.length; l++ ) {
//		    		System.out.print(array[l]+" ");
//		    	}
//		     }
//		     System.out.println();
//		 }
//        sc.close();
		
//		-------------------------------------------TRANSPOSE OF A MATRIX----------------------------------
		
		//Write a java program to print transpose of 2D Array
		
		/* int ar[][] = {{1,2,3},{4,5,6},{7,8,9}}; */
		
//		for( int i = 0; i < ar.length; i++ ) {
//			System.out.print("[ ");
//			for( int j = 0; j < ar[i].length; j++ ) {
//				System.out.print(ar[i][j]+" ");
//			}
//			System.out.println("]");
//		}
		
//		System.out.println();
		
		/*
		 * int ar2[][] = new int[3][3]; for( int i = 0; i < ar.length; i++ ) { for( int
		 * j = 0; j < ar[i].length; j++ ) { if( i == j ) ar2[i][j] = ar[i][j]; else {
		 * ar2[j][i] = ar[i][j]; } } }
		 * 
		 * for( int i = 0; i < ar2.length; i++ ) {
		 * 
		 * for( int j = 0; j < ar2[i].length; j++ ) { System.out.print(ar2[i][j]+" "); }
		 * 
		 * }
		 */
		//------------------------------------- Product of 2D array -------------------------------------------
//		int ar[][] = {{1,2,3},{4,5,6},{7,8,9}};
//		int product = 1;
//		for( int i = 0; i < ar.length; i++ ) {
//			System.out.print("[ ");
//			for( int j = 0; j < ar[i].length; j++ ) {
//				System.out.print(ar[i][j]+" ");
//				product = product * ar[i][j];
//			}
//			System.out.println("]");
//		}
//		System.out.println(product);
		//---------------------------No of possible combination-----------------------------------------------------------------
//		char ar[] = {'a','e','i','o','u'};
//		int count = 0;
//		for( int i = 0; i < ar.length; i++ ) {
//			for( int j = 0; j < ar.length; j++ ) {
//				for( int k = 0; k < ar.length; k++ ) {
//					for( int l = 0; l < ar.length; l++ ) {
//						for( int m = 0; m < ar.length; m++ ) {
//							if( i != j && i != k && i != l && i != m && j != k && j != l && j != m && k != l && k != m && l != m ) {
//								System.out.println(""+ar[i]+ar[j]+ar[k]+ar[l]+ar[m]);
//								count++;
//							}
//							
//						}
//					}
//				}
//			}
//		}
//		System.out.println("\n"+count);
		//----------------------------------Hash-Map--------------------------------------------
//		HashMap<String,Integer> h = new HashMap<>();
//		
//		h.put("Abhayanand", 54);
//		h.put("Manav", 89);
//		h.put("Rishi",00);
//		h.put("Priyo", 54);
//		for( Map.Entry<String, Integer> e: h.entrySet() )
//			System.out.println( e.getKey() + " " + e.getValue() );
//		if( isPresent(h) ) {
//			System.out.println("Present");
//		}
//		else {
//			System.out.println("Not Present");
//		}
//		System.out.println(h.get("Manav"));
//		
//---------------------------------Reference of array----------------------------------------
//		int size = 6;
//		ArrayList<employee> e = new ArrayList<>(size);
//
//		for( int i = 0; i < size; i++ ) {
//			
//			int id = sc.nextInt();
//			sc.nextLine();
//			String name = sc.nextLine();
//			
//			employee e1 = new employee(name,id);
//			e.add(e1);
//		}
//
//		for( int i = 0; i < e.size(); i++ ) {
//			System.out.println(e.get(i).name+" "+e.get(i).id);
//		}
//-----------------------------String check using Generic-----------------------------------
		
//		gene<String> g = new gene("Abhay","Abhay");
//		
//		if( g.check() )
//			System.out.println("String Matched");
//		else
//			System.out.println("String Missmatched");
		
//---------------------------Check integer is positive---------------------------------------
//		try {
//			int n = sc.nextInt();
//			if( n < 0 ) {
//				throw new myException("Invalid Input");	
//			}
//			else {
//				System.out.println("Valid Input");
//				System.exit(0);
//			}
//		}
//		
//		catch(Exception e) {
//			System.out.println("Invalid Input");
//		}
//		
//		finally {
//			System.out.println("Not a positive Integer");
//		}
				
//------------------------Facebook problem(popular post)-------------------------		
//				int t = sc.nextInt();
//				for( int i = 0; i < t; i++ ){
//				    int p = sc.nextInt();
//				    int a[] = new int[p];
//				    int b[] = new int[p];
//				    int co = 0;
//				    int max = a[co];
//				    for( int j = 0; j < p; j++ ){
//				        a[j] = sc.nextInt();
//				    }
//				    for( int j = 0; j < p; j++ ){
//				        b[j] = sc.nextInt();
//				    }
//				    for( int j = 0; j < p - 1; j++ ){
//				        if( max > a[j+1] )
//				            co = j;
//				            
//				        else if( a[j] < a[j+1] )
//				            co = j+1;
//				            
//				        else{
//				             if( b[j] > b[j+1] )
//				                co = j;
//				             else if( b[j] < b[j+1] )
//				                co = j+1;
//				        }
//				    }
//				    for( int j = 0; j < p; j++ ){
//				        
//				        if( j == co )
//				            continue;
//				            
//				        else if( a[co] == a[j] ){
//				            if( b[co] < b[j] )
//				                co = j;
//				        }
//				    }
//				    System.out.println(co+1);
//				}
		
		
		int t = sc.nextInt();
		for( int i = 0; i < t; i++ ){
		    int n = sc.nextInt();
		    int ar[] = new int[n];
		    int min = 0;
		    int Aqmin = 0;
		    byte b = 0;
		    for( int j = 0; j < n; j++ ){
		        ar[j] = sc.nextInt();
		        
		        if( ar[j] > 0 && b == 0 ){
		            min = ar[j];
		            b++;
		        }
		    }
		    
		    for( int j = 0; j < n; j++ ){
		        if( min > ar[j] && ar[j] >= 0 )
		            min = ar[j];
		    }
		    Aqmin = ar[0];
		    for( int j = 0; j < n; j++ ){
		        if( Aqmin > ar[j] )
		            Aqmin = ar[j];
		    }
		    
//		    int min2 = (min-1) - ((min-1)*2);
		    min = min - 1;
		    int min2 = (min) - (min*2);
		    
//		    System.out.println(min+" "+Aqmin+" "+min2);
//		    if( min == Aqmin-1 && min >= 0) {
//		    	System.out.println(min);
//		    }
//		    else if( min2 > Aqmin && min >= 0 )
//		    	System.out.println(min);
//		    else {
//		    	System.out.println("-1");
//		    }
//		    System.out.println(min+" "+Aqmin+" "+min2);
		    
//		    if( min == Aqmin && min > 1 )
//		    	System.out.println(min-1);
//		    else if( min != Aqmin && min2 > Aqmin )
//		    	System.out.println(min-1);
//		    else if( min <= 0 )
//		    	System.out.println("-1");
//		    else {
//		    	min = min - 1;
//		    	while( min > 0 && min2 <= Aqmin ) {
//		    		min--;
//		    		min2 = min - (min*2);
//		    	}
//		    	if( min > 0 && min2 > Aqmin )
//		    		System.out.println(min);
//		    	else {
//		    		System.out.println("-1");
//		    	}
//		    }
		    
		}
	}
		
}
