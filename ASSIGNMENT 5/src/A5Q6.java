import java.util.Scanner;
public class A5Q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter an integer, the input ends if it is 0: ");
		int n;float sum=0;
		int p=0;int ne=0;
		while((n = sc.nextInt())!=0) {
			sum = sum+n;
			
			if(n>0)
				p++;
			else if(n<0)
				ne++;
			
		}
		if(p==0 && ne==0)
			System.out.println("No numbers are entered except 0");
		else {
		System.out.println("The number of positives is: "+p);
		System.out.println("The number of negatives is: "+ne);
		System.out.println("The total is: "+sum);
		System.out.println("The average is "+sum/(p+ne));
		sc.close();
		}
		
		
	}
}


//import java.util.Scanner;
//public class A5Q6 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter an integer, the input ends if it is 0: ");
//		int p=0;int ne=0;
//		int n = 0;double sum=0;
//		do {
//			n = sc.nextInt();
//			sum = sum+n;
//			if(n>0)
//				p++;
//			else if(n<0)
//				ne++;
//
//			
//		}while(n!=0);
//		
//		System.out.println("The number of positives is: "+p);
//		System.out.println("The number of negatives is: "+ne);
//		System.out.println("The total is: "+sum);
//		System.out.println("The average is "+(float)(sum/(p+ne)));
//		
//		
//		sc.close();
//	}
//
//}
//import java.util.Scanner;
//public class A5Q6 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		for(int i=)
//		
//		sc.close();
//	}
//
//}