package org.zerock.myapp.baekjoon.gold;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class 오큰수2 {

	public static void main(String[] args) throws IOException {

//		강의 전에 개인적으로 풀긴 풀었으나, 시간초과가 났던 문제
//		강의중 풀었던 문제이나 똑같은 풀이 방식을 가지는 문제가 여럿 존재하는 것 같아 중요하다 판단
//		그래서 강사님 코드는 보지 않고 알고리즘 설명 들었던 내용만 상기하며 
//		구현에 집중해서 공부하기로 결정.
		
//		------------------------------------
		
//		가장먼저 제한사항부터 확인
//		첫째 줄에 수열 A의 크기 N (1 ≤ N ≤ 1,000,000)이 주어진다.
//		둘째 줄에 수열 A의 원소 A1, A2, ..., AN (1 ≤ Ai ≤ 1,000,000)이 주어진다.
		
//		수열의 크기인 N이 시간복잡도와 직접적인 연관을 가지는 변수인 것 같다.
		
//		N이 최대 1,000,000인것으로 보아 강사님의 시간복잡도 기준표를 참고해
//		O(N)의 시간복잡도로 풀어야 한다.
//		즉, for문 한번으로 문제를 풀어야 한다.
		
//		------------------------------------
		
//		"입력받은 배열을 뒤에서부터 순회하면서 오큰수를 판단"
		
//		오큰수 판별 알고리즘
		
//		입력받은 수열을 뒤에서부터 판단(스택은 후입선출)
//			1. 스택이 비어있는 경우
//				해당 숫자의 오큰수는 -1
//			2. 스택의 가장 위의 숫자가 자신보다 큰 경우
//				가장 위의 숫자를 오큰수로 한다.
//			3. 스택의 가장 위의 숫자가 자신보다 작은 경우
//				가장 위의 숫자를 꺼내고 다시 판단한다.
//		판단한 수를 스택에 넣는다.
		
		
//		백준 국룰, 필요 자료구조들 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int[] arr = new int[Integer.parseInt(br.readLine())];		// 첫줄 수열크기
		StringTokenizer st = new StringTokenizer(br.readLine());	// 둘째줄 수열 토큰화
		
		Stack<Integer> stack = new Stack<>();						// 오큰수 판별용 스택
		int[] answer = new int[arr.length];							// 오큰수 기록용 배열
		
//		------------------------------------
//		입력받은 수열을 배열로 저장
		
		for(int i = 0; i < arr.length; i ++) {
			arr[i] =  Integer.parseInt(st.nextToken());
		}

//		------------------------------------
//		오큰수 판별
		
		for(int i = arr.length - 1; i >= 0; i--) {
//			if(stack.isEmpty()) {
//				answer[i] = -1;
//			} else if(stack.peek() > arr[i]) {
//				answer[i] = stack.pop();
//			} else {
//				
//			}
//			여기까지 코드작성을 했는데 3번조건을 먼저 수행해야하는것을 깨달음
			
//			while(stack.peek() <= arr[i]) {			EmptyStackException 스택에 아무것도 없는데 peek해서 나온 오류
//			while(stack.peek() <= arr[i] && !stack.isEmpty()) {		첫번째 조건을 먼저 판단해서 같은 오류 나오는듯
			while(!stack.isEmpty() && stack.peek() <= arr[i]) {
				stack.pop();
			}	// 3번
			
			
			if(stack.isEmpty()) {
				answer[i] = -1;
			}	// 1번
			else if(stack.peek() > arr[i]) {
				answer[i] = stack.peek();
			}	// 2번
			
			// 판단한 수를 스택에 넣는다.
			stack.push(arr[i]);
		}
		
		for(int i : answer) {
			sb.append(i);
			sb.append(" ");
		} // StringBuilder에 기록
		
		System.out.println(sb);	// 출력
		
	} // main
} // end class



// 키워드

// 현재의 값을 조건에 따라 업데이트하여 저장

// while(!stack.isEmpty())를 통해 꺼내면서 비교




