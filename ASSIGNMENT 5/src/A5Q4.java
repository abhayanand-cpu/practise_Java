//import java.util.Scanner;
//public class A5Q4 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Number of students given exam: ");
//		byte n = sc.nextByte();
//		int j=0;
//		for(int i=1; i<=n; i++) {
//			System.out.print("Enter the marks of "+i);
//			if(i==1)
//				System.out.print("st student: ");
//			else if(i==2)
//				System.out.print("nd student: ");
//			else if(i==3)
//				System.out.print("rd student: ");
//			else
//				System.out.print("th student: ");
//			
//			int marks = 0+(byte)(Math.random()*(100-0+1));
//			if(marks>=40)
//				j++;
//		}
//		System.out.print("Number of Students pass the exam is: "+j);
//		sc.close();
//	}
//
//}
import java.util.Scanner;
public class A5Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of students given exam: ");
		byte n = sc.nextByte();
		int j=0;
		for(int i=1; i<=n; i++) {
			int marks = 0+(byte)(Math.random()*(100-0+1));
			if(marks>=40)
				j++;
		}
		System.out.print("Number of Students pass the exam is: "+j);
		sc.close();
	}

}
