import java.util.Arrays;

public class ArrayWaveForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {8,1,2,3,4,5,6,10,2};
		for( int i = 1; i < a.length; i+=2 ) {
			int temp;
			if( a[i-1] < a[i] ) {
				temp = a[i];
				a[i] = a[i-1];
				a[i-1] = temp;
			}
			if( a[i] < a.length && a[i] > a[i+1] ) {
				temp = a[i];
				a[i] = a[i+1];
				a[i+1] = temp;
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
