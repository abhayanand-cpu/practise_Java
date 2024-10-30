import java.util.Scanner;
class Commission{
	double sales;

	Commission( double sales ){
		this.sales = sales;
	}

	double getCommission(){
		if ( sales < 500 )
			return ((sales)*(2.0/100));
		else if ( (sales > 500) && (sales < 5000) ) 
			return ((sales)*(5.0/100));
		else if( sales >= 5000 )
			return ((sales)*(8.0/100));
		else
			return 0;
	}

}
public class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter sales in : ");
		double sales = sc.nextDouble();
		if ( sales >= 0 ) {
			Commission c = new Commission( sales );
			System.out.println("Commission is: "+c.getCommission());
		}
		else{
			System.out.print("Invalid Input");
		}
	}
}