
public class Q_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = Math.random();
		double b = Math.random();
		double c = Math.random();
		double d = Math.random();
		double e = Math.random();
		double f = (a+b+c+d+e)/5;
		double min = Math.min(a, Math.min(b, c));
		min = Math.min(min, Math.min(d, e));
		double max = Math.max(a, Math.max(b, c));
		max = Math.max(max,Math.max(d, e));
		System.out.print("Average is = "+f+" Minimum is = "+min+" Maximum is = "+max);
		
	}

}
