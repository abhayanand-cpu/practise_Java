
public class A3Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a = Float.parseFloat(args[0]);
		float b = Float.parseFloat(args[1]);
		float c = Float.parseFloat(args[2]);
		float d = Float.parseFloat(args[3]);
		float e = Float.parseFloat(args[4]);
		float f = Float.parseFloat(args[5]);
		float g = a*d-b*c;
		float x = (e*d-b*f)/(a*d-b*c);
		float y = (a*f-e*c)/(a*d-b*c);
		if(g==0)
			System.out.println("The equation has no solution");
		else
			System.out.println("x is "+x+" and y is "+y);
	}

}
