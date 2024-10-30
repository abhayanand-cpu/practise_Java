package oneMonthPrep;

import java.util.ArrayList;
import java.util.List;

public class list {

	public static void main(String[] args) {
		
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(0);
		arr.add(5);
		arr.add(3);
		arr.add(0);
		arr.add(-1);
		arr.add(-67);
		arr.add(-7);
		
		int positive = 0,negative = 0,zero = 0;
		double size = 0;
		
		for( Integer i : arr ){
            if( i == 0 )
                zero++;
            else if( i < 0 )
                negative++;
            else
                positive++;
                
            size++;
        }
        
        double positiveRa = positive / size;
        double negativeRa = negative / size;
        double zeroRa = zero / size;
        
        System.out.printf("%f\n%f\n%f\n",positiveRa,negativeRa,zeroRa);
    }
	

}
