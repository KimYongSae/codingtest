package org.zerock.myapp.programmers.lv2;

import java.util.Collections;
import java.util.PriorityQueue;

public class µ∆ÊΩ∫_∞‘¿” {

	public static int solution(int n, int k, int[] enemy) {

		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
	        
		for(int i = 0; i < enemy.length; i ++) {
			pq.add(enemy[i]);
			if( n < enemy[i]) {
				if(k > 0 ){
					n = n + pq.poll();
					k --;
					n = n - enemy[i];
				} else {
	        		return i;
				}
			} else {
				n = n - enemy[i];
			}
		}
		return enemy.length;
	    }
	
	
	
	public static void main(String[] args) {

		int n = 2;
		int k = 4;
		int[] enemy = {3,3,3,3}	;
		
		System.out.println(solution(n,k,enemy));
		
	}

}
