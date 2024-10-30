//FUNCTION AND METHODS
public class Class_Question8 {

	public static void main(String[] args) {
		int a = 2; int b = 4;
		int c = add( a, b);                                //actual argument
		System.out.print("The sum of a and b is: "+c);
	}
	public static int add(int a , int b) {                 //formal argument   
		int s = a+b;
		return s;
	}
}
