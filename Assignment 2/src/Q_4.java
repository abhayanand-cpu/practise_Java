import  java.util.Scanner;
public class Q_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       short n,m;
       System.out.print("Enter a number between 0 and 1000: ");
       n = sc.nextShort();
       m =(short)(n%10+(n/10)%10+n/100);//2+3+9
       
       System.out.print("The sum of the digit is "+(m));
       sc.close();
	}

}
