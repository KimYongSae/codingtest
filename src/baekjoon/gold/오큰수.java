package baekjoon.gold;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 오큰수 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[Integer.parseInt(br.readLine())];		// 첫줄 수열크기

		StringTokenizer st = new StringTokenizer(br.readLine());	// 둘째줄 수열 토큰화

		StringBuilder sb = new StringBuilder();
		int[] answer = new int[arr.length];


		for(int i = 0; i < arr.length; i ++) {
			arr[i] = Integer.parseInt(st.nextToken());

		} // 수열을 배열로 저장

		answer[arr.length-1] = -1;

		// 배열의 뒤에서부터 순회하면서 오큰수 판별
		for(int i = arr.length-1; i >= 0; i --) {

			// 첫번째 for문의 카운터변수에서부터 정방향으로 순회하며
			// 카운터변수보다 큰 수를 찾음
			for(int j = i+1; j <arr.length; j ++) {
				if(arr[i] < arr[j]) {
					answer[i] = arr[j];
					break;
					// 찾을시 break로 탈출
				} else {
					answer[i] = -1;
				}	// 없으면 오큰수는 -1
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
