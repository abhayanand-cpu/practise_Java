import java.util.Scanner;
class Point{
	int x,y;
	void setPoint(int c, int d) {
		x = c;
		y = d;
	}
	void showPoint(){
		System.out.println("("+x+", "+y+")");
	}
	int findDistance(Point a) {
		return (int)Math.round(Math.sqrt(Math.pow(a.x - x, 2)+Math.pow(a.y - y, 2)));
	}
}
class PointDemo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Point point1 = new Point();
		
		System.out.print("Enter coordinates for point1: ");
		point1.setPoint(sc.nextInt(), sc. nextInt());
		System.out.print("Point 1 is ");
		point1.showPoint();
	
		Point point2 = new Point();
		
		System.out.print("Enter coordinates for point2: ");
		point2.setPoint(sc.nextInt(), sc.nextInt());
		System.out.print("Point 2 is ");
		point2.showPoint();
		System.out.println("Distance between point 2 from 1 is approximately "+point1.findDistance(point2)+" units.");
		
		sc.close();
	}
}