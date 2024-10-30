
import java.util.Scanner;
class BubbleShort{
	void Shorting( int []n ,int i ) {
		int c = 0;
		for( int k = 1; k < i; k++ ) {
			for( int j = 0; j < i-k; j++ ) {
				if( n[j] > n[j+1] ) {
					c = n[j];
					n[j] = n[j+1];
					n[j+1] = c;
				}
			}
		}
	}
}
public class A8Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BubbleShort b = new BubbleShort();
		int n[] = new int[100];
		int i = 0;
		int num = 1;
		do{
			
			num = sc.nextInt();
			if( num >= 1 && num <= 100 ) {
			n[i] = num;
			}
			i++;
			
		}while( num != 0 );
		b.Shorting(n,--i);
		for( int j = 0; n[j] != 0; ) {
			int occur = 0;
			for( int k = 0; n[k] != 0 ; k++ ) {
				if( n[j] == n[k] ) {
					occur++;
				}
			}
			System.out.println(n[j]+" Occurs "+occur+" time"+(occur > 1 ? "s.":"."));
			j = j + occur;
		}
		
		sc.close();
	}

}

