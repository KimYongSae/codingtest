package org.zerock.myapp.baekjoon.gold;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class ��ū��2 {

	public static void main(String[] args) throws IOException {

//		���� ���� ���������� Ǯ�� Ǯ������, �ð��ʰ��� ���� ����
//		������ Ǯ���� �����̳� �Ȱ��� Ǯ�� ����� ������ ������ ���� �����ϴ� �� ���� �߿��ϴ� �Ǵ�
//		�׷��� ����� �ڵ�� ���� �ʰ� �˰��� ���� ����� ���븸 ����ϸ� 
//		������ �����ؼ� �����ϱ�� ����.
		
//		------------------------------------
		
//		������� ���ѻ��׺��� Ȯ��
//		ù° �ٿ� ���� A�� ũ�� N (1 �� N �� 1,000,000)�� �־�����.
//		��° �ٿ� ���� A�� ���� A1, A2, ..., AN (1 �� Ai �� 1,000,000)�� �־�����.
		
//		������ ũ���� N�� �ð����⵵�� �������� ������ ������ ������ �� ����.
		
//		N�� �ִ� 1,000,000�ΰ����� ���� ������� �ð����⵵ ����ǥ�� ������
//		O(N)�� �ð����⵵�� Ǯ��� �Ѵ�.
//		��, for�� �ѹ����� ������ Ǯ��� �Ѵ�.
		
//		------------------------------------
		
//		"�Է¹��� �迭�� �ڿ������� ��ȸ�ϸ鼭 ��ū���� �Ǵ�"
		
//		��ū�� �Ǻ� �˰���
		
//		�Է¹��� ������ �ڿ������� �Ǵ�(������ ���Լ���)
//			1. ������ ����ִ� ���
//				�ش� ������ ��ū���� -1
//			2. ������ ���� ���� ���ڰ� �ڽź��� ū ���
//				���� ���� ���ڸ� ��ū���� �Ѵ�.
//			3. ������ ���� ���� ���ڰ� �ڽź��� ���� ���
//				���� ���� ���ڸ� ������ �ٽ� �Ǵ��Ѵ�.
//		�Ǵ��� ���� ���ÿ� �ִ´�.
		
		
//		���� ����, �ʿ� �ڷᱸ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int[] arr = new int[Integer.parseInt(br.readLine())];		// ù�� ����ũ��
		StringTokenizer st = new StringTokenizer(br.readLine());	// ��°�� ���� ��ūȭ
		
		Stack<Integer> stack = new Stack<>();						// ��ū�� �Ǻ��� ����
		int[] answer = new int[arr.length];							// ��ū�� ��Ͽ� �迭
		
//		------------------------------------
//		�Է¹��� ������ �迭�� ����
		
		for(int i = 0; i < arr.length; i ++) {
			arr[i] =  Integer.parseInt(st.nextToken());
		}

//		------------------------------------
//		��ū�� �Ǻ�
		
		for(int i = arr.length - 1; i >= 0; i--) {
//			if(stack.isEmpty()) {
//				answer[i] = -1;
//			} else if(stack.peek() > arr[i]) {
//				answer[i] = stack.pop();
//			} else {
//				
//			}
//			������� �ڵ��ۼ��� �ߴµ� 3�������� ���� �����ؾ��ϴ°��� ������
			
//			while(stack.peek() <= arr[i]) {			EmptyStackException ���ÿ� �ƹ��͵� ���µ� peek�ؼ� ���� ����
//			while(stack.peek() <= arr[i] && !stack.isEmpty()) {		ù��° ������ ���� �Ǵ��ؼ� ���� ���� �����µ�
			while(!stack.isEmpty() && stack.peek() <= arr[i]) {
				stack.pop();
			}	// 3��
			
			
			if(stack.isEmpty()) {
				answer[i] = -1;
			}	// 1��
			else if(stack.peek() > arr[i]) {
				answer[i] = stack.peek();
			}	// 2��
			
			// �Ǵ��� ���� ���ÿ� �ִ´�.
			stack.push(arr[i]);
		}
		
		for(int i : answer) {
			sb.append(i);
			sb.append(" ");
		} // StringBuilder�� ���
		
		System.out.println(sb);	// ���
		
	} // main
} // end class



// Ű����

// ������ ���� ���ǿ� ���� ������Ʈ�Ͽ� ����

// while(!stack.isEmpty())�� ���� �����鼭 ��




