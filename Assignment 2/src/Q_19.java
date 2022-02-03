
public class Q_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = Double.parseDouble(args[0]);
		double DA = (a/100)*40;
		double HRA = (a/100)*20;
		double gs = a-(DA+HRA);
		System.out.println("Gross salary is "+gs);
		
	}

}
