package oneMonthPrep;

import java.util.ArrayList;
import java.util.List;

public class flipTheMatrix {
	static int max( int a, int b, int c, int d ) {
		
		int arr[] = { a, b, c, d };
		int max = arr[0];
		for( int i = 1; i < arr.length; i++ ) {
			if( max < arr[i] ) 
				max = arr[i];
		}
		
		return max;
	}

	public static void main(String[] args) {
		
		List<List<Integer>> matrix = new ArrayList<>();
//		
//		107 54 128 15
//		12 75 110 138
//		100 96 34 85
//		75 15 28 112
		
		matrix.add(new ArrayList<>(List.of(107,54,128,15)));
        matrix.add(new ArrayList<>(List.of(12,75,110,138)));
        matrix.add(new ArrayList<>(List.of(100,96,34,85)));
        matrix.add(new ArrayList<>(List.of(75,15,28,112)));
		
		int l = matrix.size();
//        int m = l / 2;
//        
//        for( int i = 0; i < l; i++ ) {
//        	int m1 = 0;int largest = matrix.get(0).get(i);
//        	for( int j = 0; j < l; j++ ) {
//        		
//        		if( largest < matrix.get(j).get(i) ) {
//        			largest = matrix.get(j).get(i);
//        			m1 = j;
//        		}
//        	}
//        	if( m1 >= m ) {
//        		for( int n = 0; n < m; n++ ) {
//        			int temp = matrix.get(n).get(i);
//        			matrix.get(n).set(i, matrix.get( l - 1 - n ).get(i) );
//        			matrix.get(l - 1 - n).set(i, temp);
//        		}
//        	}
//        }
//        for( List<Integer> lis : matrix )
//        	System.out.println(lis);
//        
//        System.out.println();
//        
//        for( int i = 0; i < m; i++ ) {
//        	int largest = matrix.get(i).get(0);int m1 = 0;
//        	for( int j = 0; j < l; j++ ) {
//        		if( largest < matrix.get(i).get(j) ) {
//        			largest = matrix.get(i).get(j);
//        			m1 = j;
//        		}
//        	}
//        	if( m1 >= m ) {
//        		for( int n = 0; n < m; n++ ) {
//        			int temp = matrix.get(i).get(n);
//        			matrix.get(i).set(n, matrix.get(i).get(l - 1 - n) );
//        			matrix.get(i).set(l - 1 - n, temp);
//        		}
//        	}
//        }
//        
//        for( List<Integer> lis : matrix )
//        	System.out.println(lis);
//        
//        int sum = 0;
//        for( int i = 0; i < m; i++ ) {
//        	for( int j = 0; j < m; j++ ) {
//        		sum += matrix.get(i).get(j);
//        	}
//        }
//        System.out.println(sum);
		int sum = 0;
		for( int i = 0; i < l/2; i++ ) {
			for( int j = 0; j < l/2; j++ ) {
				sum += max( matrix.get(i).get(j), matrix.get(i).get(l-1-j), matrix.get(l-1-i).get(l-1-j), matrix.get(l-1-i).get(j) );
			}
		}
		System.out.println(sum);
	}

}
