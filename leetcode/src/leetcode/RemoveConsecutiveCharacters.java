package leetcode;

public class RemoveConsecutiveCharacters {
	
	 public static String removeConsecutiveCharacter(String S){
	        String newStr = S.charAt(0)+"";
	        
	        for( int i = 1; i < S.length(); i++ ){
	            if( S.charAt(i) == S.charAt(i-1) ){
	                continue;
	            }
	            else{
	                newStr += S.charAt(i)+"";
	            }
	        }
	        return newStr;
	    }
	
	public static void main(String[] args) {
		
		String newStr = removeConsecutiveCharacter("aabaa");
		System.out.println(newStr);
	}

}
