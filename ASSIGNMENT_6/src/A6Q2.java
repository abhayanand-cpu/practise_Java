
public class A6Q2 {
	public static int getPentagonalNumber(int count) {
		 
		return count*(3*count-1)/2;
	
	}
	
	public static void main(String[] args) {
		int count = 0;
		while( count < 100 ) {
			getPentagonalNumber(count);
			count++;
			
			System.out.print(getPentagonalNumber(count)+" ");
			if( count % 10 == 0 ) {
				System.out.println();
			}
		}
	}

}
