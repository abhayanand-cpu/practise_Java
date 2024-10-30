import java.lang.Math;
public class Q_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a = 1;
//       int b = 2;
       System.out.println("a\tb\tpow(a,b)");
       System.out.println(a+"\t"+(++a)+"\t   "+(--a));
       System.out.println((++a)+"\t"+(++a)+"\t   "+(int)Math.pow(--a,3));
       System.out.println((++a)+"\t"+(++a)+"\t   "+(int)Math.pow(--a, 4));
       System.out.println((++a)+"\t"+(++a)+"\t  "+(int)Math.pow(--a, 5));
       System.out.println((++a)+"\t"+(++a)+"\t  "+(int)Math.pow(--a, 6));
       
//      for( int i = 1; i <= 5; i++ ) {
//    	  System.out.println(a+"\t"+b+"\t"+(int)Math.pow(a, b));
//    	  a++; b++;
//      }
	}

}
