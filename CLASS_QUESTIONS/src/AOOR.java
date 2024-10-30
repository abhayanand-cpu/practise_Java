//ARRAY OF OBJECT REFERENCE.

import java.util.Scanner;
class complex{
	int real, img;
	
	complex(){
		real = 0;
		img = 0;
	}
	
	complex( int real , int img ){
		this.real = real;
		this.img = img;
	}
	
	complex( complex c ){
		real = c.real;
		img = c.real;
	}
	
	void GetData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter real & imaginary: ");
		real = sc.nextInt();
		img = sc.nextInt();
	}
	
	void Display() {
		System.out.println(real+" + "+img+" ");
	}
	
}
public class AOOR {

	public static void main(String[] args) {
		complex obj[] = new complex[10];
		for( int i = 0; i < 10; i++ ) {
			obj[i] =  new complex();
			obj[i].GetData();
			obj[i].Display();
		}
	}

}
