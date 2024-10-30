//import java.util.*;
//public class QuadraticEquation {
//	
//	private double a;
//	private double b;
//	private double c;
//	
//	Scanner sc = new Scanner(System.in);
//	
//	QuadraticEquation(){
//		
//	}
//	
//	void GetDataA() {
//		a = sc.nextDouble();
//	}
//	
//	void GetDataB() {
//		b = sc.nextDouble();
//	}
//	
//	void GetDataC() {
//		c = sc.nextDouble();
//	}
//	
//	double getDiscriminant() {
//		return (b*b)-4*a*c;
//	}
//
//	double getRoot1() {
//		if( getDiscriminant() >= 0 )
//			return (-b + Math.pow(getDiscriminant(), 1/2))/2*a;
//		else
//			return 0;
//	}
//	
//	double getRoot2() {
//		if( getDiscriminant() >= 0 )
//			return (-b - Math.pow(getDiscriminant(), 1/2))/2*a;
//		else
//			return 0;
//	}
//	
//	public static void main(String[] args) {
//		
//
//	}
//
//}
import java.util.Scanner;
class QuadraticEquation{
	private double a, b, c;
	
	QuadraticEquation(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double getA(){
		return a;
	}
	
	public double getB(){
		return b;
	}
	
	public double getC(){
		return c;
	}
	
	public double getDiscriminant(){
		return Math.pow(b, 2) - 4 * a * c;
	}
	
	public double getRoot1(){
		if( getDiscriminant() < 0 )
			return 0;
			else
			return ((-b) + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
	}
	
	public double getRoot2(){
		  if(getDiscriminant() < 0)  
			  return 0;
		  else
			 return ((-b) - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
	}
}

public class A7Q3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a, b, c: ");
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
		System.out.print("The equation has ");
		
		if (quadraticEquation.getDiscriminant() < 0)
			System.out.println("no real roots");
		
		else if (quadraticEquation.getDiscriminant() > 0){
			System.out.println("two roots " + quadraticEquation.getRoot1() +
				" and " + quadraticEquation.getRoot2());
		}
		
		else{
			System.out.println("one root " + (quadraticEquation.getRoot1() > 0 ?
				quadraticEquation.getRoot1() : quadraticEquation.getRoot2()));
		}
		sc.close();
	}
}
