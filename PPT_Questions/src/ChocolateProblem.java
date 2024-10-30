import java.util.Arrays;

public class ChocolateProblem {
	
	public static void Conquer( int a[], int s, int mid, int e ) {
		
		int ar[] = new int[ e - s + 1 ];
		int start = s;
		int midInd = mid + 1;
		int Ind = 0;
		
		while( start <= mid && midInd <= e ) {
			if( a[start] <= a[midInd] )
				ar[Ind++] = a[start++];
			else
				ar[Ind++] = a[midInd++];
		}
		
		while( start <= mid ) {
			ar[Ind++] = a[start++];
		}
		
		while( midInd <= e ) {
			ar[Ind++] = a[midInd++];
		}
		
		for( int i = 0, j = s; i < ar.length; i++ , j++ ) {
			a[j] = ar[i];
		}
			
	}
	
	
	public static void Divide( int a[], int s, int e ) {
		
		if( s >= e )
			return;
		
		int mid = s + ( e - s ) / 2;
		Divide( a, s, mid );
		Divide( a, mid + 1, e );
		Conquer( a, s, mid, e );
	}
	
	public static int chocolateDistribution( int arr[], int m ) {
		
		Divide( arr, 0, arr.length - 1 );
		System.out.println(Arrays.toString(arr));
		int previousDiff = arr[m] - arr[0];
		int diff = 0;
		
		for( int i = 1; i < arr.length - m; i++ ) {
			diff = arr[m+i] - arr[i];
			
			if( previousDiff <= diff ) {
				continue;
			}
			else
				previousDiff = diff;
		}
		
		return previousDiff;
	}

	public static void main(String[] args) {
		 
		int m = 5;
		int arr[] = {3, 4, 1, 9, 56, 7, 9, 12};
		int sol = chocolateDistribution( arr, m-1 );
		System.out.println(sol);
	}

}
