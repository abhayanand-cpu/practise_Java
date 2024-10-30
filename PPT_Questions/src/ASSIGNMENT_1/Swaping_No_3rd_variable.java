package ASSIGNMENT_1;

public class Swaping_No_3rd_variable {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		System.out.println("Before Swaping: A="+a+" B="+b);
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("After Swaping: A="+a+" B="+b);

	}

}
