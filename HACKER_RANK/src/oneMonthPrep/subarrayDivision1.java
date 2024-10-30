package oneMonthPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subarrayDivision1 {

	public static void main(String[] args) {
		List<Integer> s = new ArrayList<Integer>(Arrays.asList(2,2,1,3,2));
		int d = 4;
		int m = 2;
		int answerCount = 0;
		List<Integer> answer = new ArrayList<Integer>();
		int length = s.size();
		for( int i = 0; i < length; i++ ) {
			int sum = s.get(i);
			answer.add(sum);
			for( int j = i + 1; j < length; j++ ) {
				int l = answer.size();
				if( m <= l ) {
					break;
				}
				sum += s.get(j);
				answer.add(s.get(j));
			}
			if( sum == d )
				answerCount++;
			answer.clear();
		}
		System.out.println(answerCount);
	}

}
