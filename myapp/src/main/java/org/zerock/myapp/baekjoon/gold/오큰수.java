package org.zerock.myapp.baekjoon.gold;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ��ū�� {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[Integer.parseInt(br.readLine())];		// ù�� ����ũ��
		
		StringTokenizer st = new StringTokenizer(br.readLine());	// ��°�� ���� ��ūȭ

		StringBuilder sb = new StringBuilder();
		int[] answer = new int[arr.length];
		
		
		for(int i = 0; i < arr.length; i ++) {
			arr[i] = Integer.parseInt(st.nextToken());
				
		} // ������ �迭�� ����
		
		answer[arr.length-1] = -1;
		
		// �迭�� �ڿ������� ��ȸ�ϸ鼭 ��ū�� �Ǻ�
		for(int i = arr.length-1; i >= 0; i --) {
			
			// ù��° for���� ī���ͺ����������� ���������� ��ȸ�ϸ�
			// ī���ͺ������� ū ���� ã��
			for(int j = i+1; j <arr.length; j ++) {
				if(arr[i] < arr[j]) {
					answer[i] = arr[j];
					break;
					// ã���� break�� Ż��
				} else {
					answer[i] = -1;
				}	// ������ ��ū���� -1
			}
		}
		
		
		for(int i : answer) {
			sb.append(i);
			sb.append(" ");
		}

	    sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
	}

}
