package org.zerock.myapp.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		Stack<Integer> st = new Stack<>();
		Queue<Integer> q = new LinkedList<>();
		
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i ++) {
			sb.append(Integer.parseInt(br.readLine()));
		}
					
		
//		System.out.println(sb);
		
	}

}
