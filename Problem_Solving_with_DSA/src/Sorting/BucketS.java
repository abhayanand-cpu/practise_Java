package Sorting;

//Bucket sort in Java

import java.util.ArrayList;
import java.util.Collections;

public class BucketS {
	public void bucketSort(float[] arr, int n) {
		
		if( n < 0 )
			return;
		
		 @SuppressWarnings("unchecked")
		ArrayList<Float>[] bucket = new ArrayList[n];
		
		for( int i = 0; i < n; i++ )
			bucket[i] = new ArrayList<Float>();
		
		for( int i = 0; i < n; i++ ) {
			int BucketIndex = (int)arr[i] * n;
			bucket[BucketIndex].add(arr[i]);
		}
		
		for( int i = 0; i < n; i++ )
			Collections.sort(bucket[i]);
		
		int index = 0;
		for( int i = 0; i < n; i++ ) {
			for( int j = 0; j < bucket[i].size(); j++ ) {
				arr[index++] = bucket[i].get(j);
			}
		}
	}

// Driver code
public static void main(String[] args) {
 BucketS b = new BucketS();
 float[] arr = { (float) 0.42, (float) 0.32, (float) 0.33, (float) 0.52, (float) 0.37, (float) 0.47,
     (float) 0.51 };
 b.bucketSort(arr, 7);

 for (float i : arr)
   System.out.print(i + "  ");
}
}
