import java.util.Scanner;

class point{
	int x, y;
	
	static byte i = 1;
	
	void setPoint() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter x"+(i)+": ");
		x = sc.nextInt();
		System.out.print("Enter y"+(i)+": ");
		y = sc.nextInt();
		i++;
	}
	
	int findDistance( point p, point p2 ) {
		return (int)Math.sqrt(Math.pow( p2.x - p.x, 2)+Math.pow(p2.y - p.x, 2));
	}
}

public class A1Q11 {

	public static void main(String[] args) {
		point p = new point();
		point p2 = new point();
		point p3 = new point();
		p.setPoint();
		p2.setPoint();
		System.out.println("Distance between given two points are: "+p3.findDistance( p, p2 ));
		
	}

}
