
//public class Q_16 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		double a = Math.random();
//		double b = Math.random();
//		
//		int sum = min+(int)(a+b);
//		System.out.println(sum);
//	}
//
//}
public class Q_16 {
public static void main(String[] args) {
int a,b,res1,res2;
a=Integer.parseInt(args[0]);
b=Integer.parseInt(args[1]);
res1=a+(int)(Math.random()*(a-b+1));
res2=a+(int)(Math.random()*(a-b+1));
int sum=res1+res2;
System.out.println(sum);
}}