import java.util.Scanner;
import java.io.*;
class flower{
	
	String name;
	int petels;
	float price;
	
	Scanner sc = new Scanner(System.in);
	
	flower(){
		name = "Ghost orchid";
		petels = 3;
		price = 4_64_919.00f;
	}
	
	void setDataName() {
		name = sc.nextLine();
	}
	
	void setDatapetels() {
		petels = sc.nextInt();
	}
	
	void setDataprice() {
		price = sc.nextFloat();
	}
	
	String getDataname(){
		return name;
	}
	
	int getDatapetels(){
		return petels;
	}

	float getDataprice(){
		return price;
	}
	
	void display() {
		System.out.println("\nName of a flower is: "+getDataname());
		System.out.println("Number of petels in a flower is: "+getDatapetels());
		System.out.println("Price of a flower is: "+getDataprice());
	}
	
	void getDataFlower() {
		System.out.print("Enter name of a flower: ");
		setDataName();
		System.out.print("Enter no. of petels in flower: ");
		setDatapetels();
		System.out.print("Enter price of a flower: ");
		setDataprice();
	}
}
public class A1Q12 {

	public static void main(String[] args)throws IOException {
		flower f = new flower();
		f.getDataFlower();
		f.display();
		
	}

}
