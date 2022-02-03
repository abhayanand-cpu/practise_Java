
public class Q_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);
		if((a<b&&b<c)||(a>b&&b>c))
			System.out.println("TRUE");
		else
			System.out.println("FALSE");
			
	}

}
