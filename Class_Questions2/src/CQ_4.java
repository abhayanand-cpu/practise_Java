class B<T,N>{
	T a;
	N b;
	
	void display( T a, N b ) {
		System.out.println(a+" "+b);
	}
	
	static <T,N> void Display( T a,N b ){
		System.out.println(a+" "+b);
	}
	
	static <T,N> T display2( T a ){
		return a;
	}
}
class A<T>{
	
	T a;
	
	A( T a ){
		this.a = a;
	}
	void display() {
		System.out.println(a);
	}
}
public class CQ_4 {

	public static void main(String[] args) {
		
		A<Integer> obj = new A<Integer>(1000);
		obj.display();
		
		A<Double> obj2 = new A<>(54.1545);
		obj2.display();
		
		A<String> obj3 = new A<>("Abhayanand");
		obj3.display();
		
		A<Float> obj4 = new A<Float>(125.54f);
		obj4.display();
		
		A<Byte> obj5 = new A<Byte>((byte)12);
		obj5.display();
		
		A<Boolean> obj6 = new A<>(10%2==3);
		obj6.display();
		
		B<String,Integer> obj7 = new B<>();
		obj7.display("Abhayanand",57);
		
		B.Display(57,10%2==3);
		
		System.out.println(B.display2(57.5f));
		
	}

}
