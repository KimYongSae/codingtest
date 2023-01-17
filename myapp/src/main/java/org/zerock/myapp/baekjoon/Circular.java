package org.zerock.myapp.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Circular {

	public static void main(String[] args) throws IOException {

//		a26 b25 c24 d23 e22 f21  g20  h19 i18 j17 k16 l15 m14
//		n13 o12 p11 q10 r09 s08  t07  u06 v05 w04 x03 y02 z01
//		
//		a01 b02 c03 d04 e05 f06  g07  h08 i09 j10 k11 l12 m13
//		n14 o15 p16 q17 r18 s19  t20  u21 v22 w23 x24 y25 z26
		
//		c to e
//		+2 -24
//		+28 -50

//		e to c
//		-2 +24
//		-28 +50
		
		
		MyCircularDeque cd = new MyCircularDeque(52);
		
		
		for(int i = 26; i > 0; i --) {
			cd.insertLast(i);
		}
		for(int i = 1; i <= 26; i ++) {
			cd.insertLast(i);
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String abc = br.readLine();
		int answer = 0;
		int idx = abc.charAt(0) - 'a';
		int tmpans1 = 0;
		int tmpans2 = 0;
		int tmpans3 = 0;
		int tmpans4 = 0;
		
		for(int i = 1; i < abc.length(); i ++) {
			int a = abc.charAt(i) - abc.charAt(i-1);
			
			// 양수일때
			
			if( a >= 0) {
				int[][] arr = new int[4][2];
				{ // 1번
				int tmpidx = idx + 1;
				for(int j = 0; j < a; j ++) {
					tmpans1 += cd.get(tmpidx);
					arr[0][0] = tmpans1;
					arr[0][1] = tmpidx;
					tmpidx ++;
				} // for
				} // 1번
				
				{ // 2번
				int tmpidx = idx + 1;
				for(int j = 0; j < a+26; j ++) {
					tmpans2 += cd.get(tmpidx);
					arr[1][0] = tmpans2;
					arr[1][1] = tmpidx;
					tmpidx ++;
				} //for
				} // 2번
				
				{ // 3번
					int tmpidx = idx - 1;
					for(int j = 0; j > a-26; j --) {
						tmpans3 += cd.get(tmpidx);
						arr[2][0] = tmpans3;
						arr[2][1] = tmpidx;
						tmpidx --;
					} // for
				} // 3번
				
				{ // 4번
					int tmpidx = idx - 1;
					for(int j = 0; j > a-52; j --) {
						tmpans4 += cd.get(tmpidx);
						arr[3][0] = tmpans4;
						arr[3][1] = tmpidx;
						tmpidx --;
					} // for
				} // 4번
				
				Arrays.sort(arr, (o1, o2) -> {
					return o1[0]-o2[0];
				}); // 정렬
				System.out.println(Arrays.deepToString(arr));
				answer += arr[0][0];
				idx = arr[0][1];
				
				tmpans1 = 0;
				tmpans2 = 0;
				tmpans3 = 0;
				tmpans4 = 0;
			} // if
			
			// 음수일때
			
			if( a < 0) {
				int[][] arr = new int[4][2];
				{ // 1번
					int tmpidx = idx - 1;
					for(int j = 0; j > a; j --) {
						tmpans1 += cd.get(tmpidx);
						arr[0][0] = tmpans1;
						arr[0][1] = tmpidx;
						tmpidx --;
					} // for
				} // 1번
				
				{ // 2번
					int tmpidx = idx - 1;
					for(int j = 0; j > a - 26; j --) {
						tmpans2 += cd.get(tmpidx);
						arr[1][0] = tmpans2;
						arr[1][1] = tmpidx;
						tmpidx --;
					} // for
				} // 2번
				
				{ // 3번
					int tmpidx = idx + 1;
					for(int j = 0; j < 26+a; j ++) {
						tmpans3 += cd.get(tmpidx);
						arr[2][0] = tmpans3;
						arr[2][1] = tmpidx;
						tmpidx ++;
					} // for
				} // 3번
				
				{ // 4번
					int tmpidx = idx + 1;
					for(int j = 0; j < 52 + a; j ++) {
						tmpans4 += cd.get(tmpidx);
						arr[3][0] = tmpans4;
						arr[3][1] = tmpidx;
						tmpidx ++;
					}
				} // 4번
				
				Arrays.sort(arr, (o1, o2) -> {
					return o1[0]-o2[0];
				}); // 정렬
				System.out.println(Arrays.deepToString(arr));
				answer += arr[0][0];
				idx = arr[0][1];
				
				tmpans1 = 0;
				tmpans2 = 0;
				tmpans3 = 0;
				tmpans4 = 0;
			} // if
			
		} // for
		System.out.println("총이동거리 : " + answer);
		System.out.println("현재 인덱스 : " + idx);
		
		
	} // main

} // end class
