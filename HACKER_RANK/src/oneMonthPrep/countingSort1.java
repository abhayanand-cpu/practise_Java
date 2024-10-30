package oneMonthPrep;
import java.util.List;
import java.util.ArrayList;
//import java.util.Iterator;

public class countingSort1 {

	public static void main(String[] args) {
		
		List<Integer> arr = new ArrayList<Integer>();
		List<Integer> result = new ArrayList<>(100);
		
		int i = 0;
		while( i < 100 ) {
			int random = (int) (Math.random() * 100);
			arr.add(random);
			i++;
		}
		
		int j = 0;
		while( j < arr.size() ) {
			result.add(0);
			j++;
		}
		
		
		int k = 0;
		while( k < arr.size() ) {
			int ele = arr.get(k);
			int count = result.get(ele);
			result.set(ele, ++count);
			k++;
		}
		
		int l = arr.size()-1;
		
		while( true && result.size() >= 101 ) {
			if( result.get(l) == 0 )
				result.remove(l);
			else
				break;
			l=l-1;
		}
		
		System.out.println(k);
		System.out.println(arr);
		System.out.println();
		System.out.println(result);
	}

}
