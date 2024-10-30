//import java.util.Scanner;
//public interface A2Q71 {
//	
//	void display();
//	void count();	
//	
//}
//class A2 implements A2Q71{
//	
//	static int maxcount = 0;
//	String name;
//	
//	A2(){
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter name: ");
//		name = sc.nextLine();
//	}
//	
//	public void display() {
//		System.out.println("Name: "+name);
//	}
//	
//	public void count() {
//		int count = 0;
//		for(int i = 0; i < name.length(); i++ ) {
//			if( name.charAt(i) == ' ' )
//				continue;
//				count++;
//		}
//		System.out.println(count);
//	}
//}
//public class A2Q7 {
//	public static void main(String [] args) {
//		
//		A2 obj = new A2();
//		obj.display();
//		obj.count();
//		
//	}
//}
