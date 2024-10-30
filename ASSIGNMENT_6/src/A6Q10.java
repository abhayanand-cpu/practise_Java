public class A6Q10 {
	
	public static void printChars(char ch1, char ch2, int numberPerLine) {
		
		System.out.print(ch1+" ");
		if( numberPerLine % 10 == 0 )
			System.out.println();
	}
	
	public static void main(String[] args) {
		int numberPerLine = 0;
		char ch2 = 'Z';
		for( char ch1 = '1'; ch1 <= ch2; ch1++ ) {
			numberPerLine++;
			printChars(ch1,ch2,numberPerLine);
		}
	}
}
