package oneMonthPrep;
import java.util.*;

public class diagonalDifference {

	public static void main(String[] args) {
		
		List<List<Integer>> arr = new ArrayList<>();
		
		List<Integer> innerList1 = new ArrayList<>();
		innerList1.add(1);
		innerList1.add(2);
		innerList1.add(3);
		
		List<Integer> innerList2 = new ArrayList<>();
		innerList2.add(4);
		innerList2.add(5);
		innerList2.add(6);
		
		List<Integer> innerList3 = new ArrayList<>();
		innerList3.add(9);
		innerList3.add(8);
		innerList3.add(9);
		
		arr.add(innerList1);
		arr.add(innerList2);
		arr.add(innerList3);
		
		int lrSum = 0; int rlSum = 0; int length = arr.size() - 1; int sum = 0;
		for( int i = 0, j = length; i <= length; i++, j-- ) {
			lrSum += arr.get(i).get(i);
			rlSum += arr.get(i).get(j);
		}
		
		sum = Math.abs( lrSum - rlSum );
		System.out.println(sum);
	}

}
