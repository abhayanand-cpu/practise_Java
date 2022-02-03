/*Write a java program that reads a Celsius degree in a double value from the console, 
then converts it to Fahrenheit and displays the result.*/
import java.util.Scanner;
public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner Celsius = new Scanner(System.in);
        double temperature;
        System.out.print("Enter a degree in Celsius: ");
        temperature = Celsius.nextDouble();  
        double Fahrenheit = (9.0 / 5) *temperature + 32;
        System.out.println(temperature+" Celsius is "+Fahrenheit+" Fahrenheit");
        Celsius.close();
	}

}
