import java.util.Scanner;
public class A3Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter weight in kg: ");
		float w = sc.nextFloat();
		System.out.print("Enter height in cm: ");
		float h = sc.nextFloat();
	    h = (h/100);
		float BMI = (float)(w/(Math.pow(h, 2)));
		System.out.println("BMI = "+BMI+" kg/m^2");
		if (BMI<18.5)
			System.out.println("underweight");
		else if (BMI>=18.5 && BMI<=24.9)
			System.out.println("normal weight");
		else if (BMI>=25.0 && BMI<=29.9)
			System.out.println("overweight");
		else 
			System.out.println("obese");
		sc.close();
	}

}
