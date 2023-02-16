package org.zerock.myapp.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class ÃÖ¼Ò_Èü {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		
		int cnt = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
//		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());		ÃÖ´ë Èü
		
		
		for(int i = 0 ; i < cnt ; i ++) {
			int a = Integer.parseInt(br.readLine());
			if( a == 0) {
				if(pq.peek() == null) {
					System.out.println(0);
				} else {
					System.out.println(pq.poll());
				}
			} else {
				pq.add(a);
			}
			
			
			
		}
		
		
			
	}

}
