package org.zerock.myapp.programmers.lv2;

import java.util.Arrays;

public class 주식가격 {

	   public static int[] solution(int[] prices) {
	        int[] tmp = new int[prices.length];
	        
	        
	        for(int i = 0; i < prices.length; i ++) {
	        	for(int j = i+1; j < prices.length; j ++) {
	        		tmp[i] ++;
	        		if( prices[i] > prices[j]) {
	        			break;
	        		}
	        	}
	        }
	        
	        
	        return tmp;
	    }
	
	
	public static void main(String[] args) {
		
		int[] prices  =  {1,2,3,2,3};
		
		System.out.println(Arrays.toString(solution(prices)));
	}

}
