import java.util.Scanner;
public class A4Q_11_4 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = 1;
		for (int i = 1; i<=n; i++) {
			for ( int j = 1;  j<=n-i; j++ ) {
				System.out.print(" ");
				   
			}
			for ( int j = 1;  j<=i; j++) {
				System.out.print(k+" ");
			    k++;
			}
			System.out.println();
			
		}
		
	sc.close();
	}

}
//package assignmentIV;
// import java.util.Scanner; 
//public class A4Q_11_4 {
//public static void main(String[] args) { 
//Scanner sc = new Scanner(System.in); System.out.print("N is :"); 
//int n = sc.nextInt(); 
//int i,j,k;  
//for(i = 1; i<=n;i++){ 
//for(j = n;j>=i;j--){ 
//System.out.print(" "); 
//} 
//for(k = 1;k<=i;k++){ 
//if(k>10)System.out.print(j++ +" "); 
//else System.out.print(j++ +" "); 
//} 
//System.out.println(""); 
//  }
// }
//}
		
	


