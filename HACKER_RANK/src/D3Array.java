
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class D3Array {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> l = new ArrayList<ArrayList<Integer>>();
        
        for( int i = 0; i < 6; i++ ){
            for( int j = 0; j < 6; j++ ){ 
            	l.add(new ArrayList<Integer>());
                l.get(i).add(j,sc.nextInt());
            }
        }
        int add = 0,k = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for( int i = 0; i < 6; i++ ) {
        	for( int j = 0; j < 6; j++ ) {
        		l.add(new ArrayList<Integer>());
        		if( i > 2 && k == 0 ) {
    				add = 0;
    				k++;
        		}
        		if( l.get(i).get(j) != 0 ) {
        			add = l.get(i).get(j) + add;
        			list.add(add);
        		}
        		
        			
        	}
        }
        System.out.println("\n"+list+"\n");
        System.out.println(Collections.max(list));
        sc.close();
    }
}

