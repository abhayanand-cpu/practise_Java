package leetcode;
import java.util.Arrays;
class Longest_substring {
    public static int longestSubstring(String s, int k) {
    	
        char c[] = s.toCharArray();
        int l = c.length;
        for( int i = 0; i < l; i++ ) {
        	for( int j = i + 1; j < l; j++ ) {
        		if( c[i] > c[j] ) {
        			char temp = c[i];
        			c[i] = c[j];
        			c[j] = temp;
        		}
        	}
        }
        
        System.out.println(Arrays.toString(c));
        int count = 0;
        int temp = 0;
        
        for( int i = 0; i < l; i++ ) {
        	
        	for( int j = i; j < l; j++ ) {
        		if( c[i] == c[j] ) {
        			temp++;
        			if( j == (l - 1) ) {
        				if(  temp >= k ) {
        					count += temp;
        					return count;
        				}
        				else
        					return count;
        			}
        		}
        		else {
        			if( temp >= k ) {
        				count += temp;
        				temp = 0;
        			}
        			else {
        				temp = 0;
        			}
        			i = j - 1;
        			break;
        		}
        	}
        }
        return count;
    }
    public static void main(String []a ) {
    	String s = "aaabb";
    	
    	System.out.println(longestSubstring(s,3));
    }
}
