package oneMonthPrep;
import java.util.*;

public class salesByMatch {

	public static void main(String[] args) {
		
		List<Integer> ar = new ArrayList<Integer>(Arrays.asList(1, 1, 3, 1, 2, 1, 3, 3, 3, 3));
		int n = ar.size();
		
		Collections.sort(ar);
        int pairs = 0;
        
        for( int i = 0; i < n-1; i++ ){
            if( ar.get(i) == ar.get(i+1) ){
                pairs++;
                ++i;   
            }
        }
        System.out.println(pairs);
	}

}
