import java.util.Scanner;
public class Q_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      double weight,height,BMI;
      System.out.print("Enter weight in pounds: ");
      weight = sc.nextDouble();
      System.out.print("Enter height in inches: ");
      height = sc.nextDouble();
      weight = weight*0.45359237;
      height = height*0.0254;
      BMI = weight/(height*height);
      System.out.print("BMI is "+(float)BMI);
     
      sc.close();
	}

}
