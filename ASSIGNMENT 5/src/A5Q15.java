
public class A5Q15 {
	public static void main(String[] args) {
		int p = 1000,n = 1;
		float r = 0.10f,V = 1;
		while( p<=10000 && r<=0.20 && n<=10 ){
			V = p*(float)Math.pow(r+1,n);
			System.out.printf("P = %d%nR = %.2f%nN = %d%nV = %.3f%n"
					+ "--------------%n",p,r,n,V);
			p+=1000;
			r+=0.01;
			n++;
		}
	}
}