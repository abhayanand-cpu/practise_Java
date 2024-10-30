class A{
	int a1;
	void getdata() {
		a1 = 10;
	}
	void showdata() {
		System.out.println(a1);
	}
}
class B extends A{
	int b1;
	void getdata() {
		a1 = 30;
		b1 = 20;
	}
	void display() {
		System.out.println(a1);
		System.out.println(b1);
	}
}
public class Inheritance {

	public static void main(String[] args) {
		B obj = new B();
		obj.getdata();
		obj.showdata();
		obj.display();
	}

}
