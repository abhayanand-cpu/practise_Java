package oneMonthPrep;

import java.util.Arrays;

public class timeConversion {
				
	public static void main(String[] args) {
		
		String newString = "";
		String a = "07:05:45PM";
		
		int add = 0;
		int length = a.length();
		
		String know = a.charAt(0) +""+ a.charAt(1);
//		System.out.println(know);
		
		char b[] = a.toCharArray();
//		System.out.println(Arrays.toString(b));
		
		if( a.charAt( length - 2 ) == 'P' && !know.equals("12")) {
			add = (Integer.parseInt(know) + 12);
			newString = ""+add+b[2]+b[3]+b[4]+b[5]+b[6]+b[7];
			System.out.println(newString);
		}
		else if( a.charAt( length - 2 ) == 'A' && know.equals("12")) {
			newString = ""+'0'+'0'+b[2]+b[3]+b[4]+b[5]+b[6]+b[7];
			System.out.println(newString);
		}
		else {
			newString = ""+b[0]+b[1]+b[2]+b[3]+b[4]+b[5]+b[6]+b[7];
			System.out.println(newString);
		}
	}

}
