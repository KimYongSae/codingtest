package org.zerock.myapp.baekjoon.gold;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class ¿ÀÅ«¼ö2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int[] arr = new int[Integer.parseInt(br.readLine())];
		Stack<Integer> stack = new Stack<>();
		
		for(int i = 0; i < arr.length; i ++) {
			stack.add(Integer.parseInt(st.nextToken()));
		}
		
		
	}
}
