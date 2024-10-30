package oneMonthPrep;

public class flippingBits {

	public static void main(String[] args) {
		
		int a = 0;
		
//		int normalValue;
////		
//		if( ((~a) & ( 1 << 31 )) != 0 ) {
//			
//			normalValue = ~a + ( 1 << 31 );
////			normalValue = -normalValue;
//		
//		}
//		else {
//			normalValue = ~a;
//		}
		
		System.out.println(Integer.toUnsignedLong(~a));
//		System.out.println(normalValue);
	}

}
