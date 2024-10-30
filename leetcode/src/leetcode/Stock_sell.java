package leetcode;

import java.util.Arrays;

public class Stock_sell {

	public static void main(String[] args) {
		
		int prices[] = {7,1,5,3,6,4};
		int l = prices.length;
        int P_s[] = new int[l];
        int P_s_i = 0;

        for( int i = 0; i < l - 1; i++ ){
            int p[] = new int[l];
             int k = 0;
            for( int j = i+1; j < l; j++ ){
                if( prices[i] < prices[j] ){
                    p[k] = prices[j] - prices[i];
                    k++;
                }
            }
            if( k == 1 ){
                P_s[P_s_i] = p[0];
                P_s_i++;
            }
            else{
                Arrays.sort(p);
                 P_s[P_s_i] = p[k-1];
                 P_s_i++;
            }
        }
        Arrays.sort(P_s);
        System.out.println(P_s[P_s.length-1]);
	}

}
