package org.zerock.myapp.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		Stack<Integer> st = new Stack<>();
		Queue<Integer> q = new LinkedList<>();
		
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i ++) {
			q.add(Integer.parseInt(br.readLine()));
		}
				
		for(int i = 1; i <= n; i ++) {
			st.push(i);
			sb.append('+').append('\n');
			while(!st.empty() && st.peek().equals(q.peek())) {
				st.pop();
				q.poll();
				sb.append('-').append('\n');
			}
		}
		
		while(!st.isEmpty()) {
			st.pop();
			sb.append('-').append('\n');
		}
		System.out.println(q.isEmpty() ? sb : "NO"); 
	}

}
