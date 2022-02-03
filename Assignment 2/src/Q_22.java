
public class Q_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       double p = Double.parseDouble(args[0]);
       double r = Double.parseDouble(args[1]);
       double t = Double.parseDouble(args[2]);
       double payment = p*Math.exp(r*t);
       System.out.println("monthly payment is = "+payment);
	}

}
