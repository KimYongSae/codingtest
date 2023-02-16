package baekjoon.silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 구간_합_구하기4 {

	public static void main(String... args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int arr[] = new int[Integer.parseInt(st.nextToken())+1];
		int tmp = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());

//		for(int i = 1; i < arr.length; i++) {
//			arr[i] = Integer.parseInt(st.nextToken());
//		}

//		for(int j = 0; j < tmp; j ++) {
//			st = new StringTokenizer(br.readLine());
//			int start = Integer.parseInt(st.nextToken());
//			int end = Integer.parseInt(st.nextToken());
//			
//			for(int i = start; i <= end; i ++) {
//				answer += arr[i];
//			}
//			System.out.println(answer);
//			answer = 0;
//		}

		for(int i = 1; i < arr.length; i ++) {
			arr[i] = arr[i-1] + Integer.parseInt(st.nextToken());
		}

		int answer = 0;

		for(int i = 0; i < tmp; i ++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());

			answer = arr[end] - arr[start-1];

			System.out.println(answer);
		}



	}
}
