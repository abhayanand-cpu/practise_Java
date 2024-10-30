
public class Details implements Factorial_2,Factorial_5{
	
	public int Fact(int a) {
		if( a == 0 )
			return 1;
		return (a * Fact( a - 1 ));
	}
	
	public int Factorial5(int b) {
		if( b == 0 )
			return 1;
		return (b * Fact( b - 1 ));
	}
	
	public static void main(String[] args) {
		Details i = new Details();
		System.out.println(i.Fact(a));
		System.out.println(i.Factorial5(b));
		
	}

}
