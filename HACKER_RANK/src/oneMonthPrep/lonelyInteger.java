package oneMonthPrep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class lonelyInteger {

	public static void main(String[] args) {
		
		List<Integer> a = new ArrayList<Integer>();
		a.add(1); a.add(2); a.add(3); a.add(4); a.add(3); a.add(2); a.add(1);
		
		Iterator<Integer> iterator = a.iterator();
		int lonely = 0;
		
		while( iterator.hasNext() ) {
			lonely ^= iterator.next();
		}
		
		System.out.println(lonely);
	}

}
