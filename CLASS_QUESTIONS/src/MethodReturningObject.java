import java.util.Scanner;
class Complex_2{
	int real, img;
	
	Complex_2(){
		real = 0;
		img = 0;
	}
	
	Complex_2( int real, int img ){
		this.real = real;
		this.img = img;
	}
	
	Complex_2( complex c ){
		real = c.real;
		img = c.img;
	}
	
	void GetData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter real & imaginary: ");
		real = sc.nextInt();
		img = sc.nextInt();
		sc.close();
	}
	
	void Display() {
		System.out.println(real+" + "+img+"i");
	}
	
	Complex_2 add( Complex_2 c1, Complex_2 c2 ) {
		Complex_2 c3 = new Complex_2();
		c3.real = c1.real + c2.real;
		c3.img = c1.img + c2.img;
		return c3;
	}
	
}
public class MethodReturningObject {

	public static void main(String[] args) {
		Complex_2 c1 = new Complex_2( 2 , -5 );
		Complex_2 c2 = new Complex_2();
		c2.GetData();
		Complex_2 c3 = new Complex_2();  
		c3 = c3.add(c1,c2);
		c1.Display();
		c2.Display();
		c3.Display();
	}

}
