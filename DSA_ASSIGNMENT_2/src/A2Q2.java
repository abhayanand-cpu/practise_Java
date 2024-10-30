import java.util.Scanner;
class complex{

	int real,img;

	void SetData(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter real and imaginary number: ");
		real = sc.nextInt();
		img = sc.nextInt();
	}

	void display(){
		System.out.println("real = "+real+"\nimaginary = "+img+"i\n");

	}

	public complex add( complex c, complex c2 ){
		complex c4 = new complex();
		c4.real = c.real+c2.real;
		c4.img = c.img+c2.img;
		return c4;
	}

}
public class A2Q2 {

	public static void main(String[] args) {
		complex c = new complex();
		c.SetData();
		c.display();

		complex c2 = new complex();
		c2.SetData();
		c2.display();

		complex c3 = new complex();
		complex c5 = c3.add( c, c2 );
		c5.display();
	}

}
