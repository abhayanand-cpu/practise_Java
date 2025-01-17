import java.util.Scanner;
public class Q_4_formatting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        Scanner sc=new Scanner(System.in);
	        System.out.println("================================");
	        for(int i=0;i<3;i++)
	        {
	            String s1=sc.next();
	            int x=sc.nextInt();
	            System.out.printf("%-15s%03d%n", s1, x);
	        }
	        System.out.println("================================");
	        sc.close();
	}
}


//("%-15s%03d%n", s1, x) % : used as a formatter.
//'-' : minus sign used for left indentation of the string.
//15s : here 15 denotes the string's minimum field width 15.
//'0' : pads the extra 0s in the integer.
//3d : here 3 denotes integer's minimum field width 3.
//%n : prints the new line.

 //printf means printing with formatiing.
//While println means printing something in a specific line.
//Printing with printf will end in same line,
//while println will take you to next line after the printing is done.


