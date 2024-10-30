
//public class Inheritance {
//	int i = 0;
//	
//	Inheritance(){
//		i++;
//	}
//	
//	void display() {
//		System.out.print(i+" ");
//	}
//	
//	public static void main(String[] args) {
//		Inheritance o = new Inheritance();
//		o.display();
//		Inheritance o1 = new Inheritance();
//		o1.display();
//		Inheritance o2 = new Inheritance();
//		o2.display();
//	}
//
//}
public class Inheritance {
	static int i = 0;
	
	Inheritance(){
		i++;
	}
	
	void display() {
		System.out.print(i+" ");
	}
	
	public static void main(String[] args) {
		Inheritance o = new Inheritance();
		o.display();
		Inheritance o1 = new Inheritance();
		o1.display();
		Inheritance o2 = new Inheritance();
		o2.display();
	}

}