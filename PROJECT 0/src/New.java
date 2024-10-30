import java.util.Scanner;
public class New {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double x,y;
		System.out.println("Enter the x and y coordinate respectively");
		x=sc.nextDouble();
		y=sc.nextDouble();
		if(x==0&&y>0)
		System.out.println("("+x+","+y+")is on the positive y-axis");
		else if(y==0&&x>0)
		System.out.println("("+x+","+y+") is on the positive x-axis");
		else if(y==0&&x<0)
			System.out.println("("+x+","+y+") is on the negative x-axis");
		else if(x==0&&y<0)
			System.out.println("("+x+","+y+") is on the negative y-axis");
		else if(x>0 && y>0)
		System.out.println("("+x+","+y+") is on the first quadrant");
		else if(x<0 && y>0)
		System.out.println("("+x+","+y+") is on the second quadrant");
		else if(x<0 && y<0)
		System.out.println("("+x+","+y+" is on the third quadrant");
		else if(x<0 && y>0)
		System.out.println("("+x+","+y+") is on the fourth quadrant");
		else
		System.out.println("("+x+","+y+") is at center");
		sc.close();
		}
		
	
	}


