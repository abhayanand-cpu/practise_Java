package leetcode;

import java.util.Arrays;

public class Longest_Common_Prefix {
	
	 public static String longestCommonPrefix(String[] strs) {
		 
		 Arrays.sort(strs);
		 String s = strs[0];
		 String e = strs[strs.length - 1];
		 int i = 0;
		 
		 String result = "";
		 
		 while( i < s.length() && i < e.length() ) {
			 if( s.charAt(i) == e.charAt(i) )
				 result += s.charAt(i);
			 else
				 return result;
		 }
		 
	     return result;
	 }
	
	public static void main(String[] args) {
		
		
		
	}

}
