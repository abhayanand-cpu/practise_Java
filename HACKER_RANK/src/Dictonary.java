
	import java.util.*;

	public class Dictonary{

		    public static void main(String[] args) {
		       Scanner sc = new Scanner(System.in);
		       HashMap<String,Integer> phone = new HashMap<String,Integer>();
		       int n = sc.nextInt();
		       for( int i = 0; i < n; i++ ){
		           String name = sc.next();
		           int number = sc.nextInt();
		           phone.put(name,number);
		       }
		      /* for( int i = 0; i < n; i++ ){
		           String name = sc.next();
		          if( phone.containsKey(name) )
		            System.out.println(name+"="+phone.get(name));
		            else
		            System.out.println("Not found");
		       }*/
		       while( sc.hasNext() ){
		           String name = sc.next();
		          if( phone.containsKey(name) )
		            System.out.println(name+"="+phone.get(name));
		            else
		            System.out.println("Not found");
		       }
		       sc.close();
		    }
		}

	


