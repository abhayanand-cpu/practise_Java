package leetcode;

import java.util.Arrays;

public class Moves_zero {

	public static void main(String[] args) {
		int nums[] = {4,2,4,0,0,3,0,5,1,0}; 
		int l = nums.length;
        int i = 0;
        int j = 0;
        if( l != 1 ) {
        	for( ; i < l; i++ ){
        		if( nums[i] == 0 ){
        			j = i + 1;
        			while( j < l && nums[j] == 0 ){
        				j++;
        			}
        			if( j < l ) {
        				int temp = nums[i];
        				nums[i] = nums[j];
        				nums[j] = temp;
        			}
        		}
        	}
        }
        System.out.println(Arrays.toString(nums));

	}

}
