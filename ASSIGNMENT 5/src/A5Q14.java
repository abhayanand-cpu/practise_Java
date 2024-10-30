import java.util.Scanner;
public class A5Q14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int a = 1,b = 1;
		int i = 1,bValue=0;
		do {
			b = bValue; //b=
			int c = a+b; // 
			System.out.print(c+" "); // 
			bValue = c; // 
			a = b; // a=
			i++;
		}while(i<=m);
		sc.close();
	}

}
