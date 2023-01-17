package org.zerock.myapp.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;


public class Solution {
	public static void main(String[] args) throws IOException {


//		a b c d e f  g  h i j k l m
//		n o p q r s  t  u v w x y z
//	
//		1  2  3  4  5  6   7   8  9  10 11 12 13
//		14 15 16 17 18 19  20  21 22 23 24 25 26
//		
		
//		if( ( (b - a < 13) && (b - a > 0) ) || b - a < -13 ) {
//			System.out.println("정방향");
//		} else {
//			System.out.println("역방향");
//		}
//		
//		
//		
//		0 < b-a < 13 = 정주행
//		b-a > 13 = 역주행
//		0 > b-a > -13 = 역주행
//		b-a < -13 = 정주행
		
//		b-a 절대값이 13보다작으면 정주행
//		b-a 절대값이 13보다 크면 역주행
		
		
//		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String abc = br.readLine();
//		int answer = 0;
//		
//		
//		
//		
//		for(int i = 1; i < abc.length(); i ++) {
//		
//			if( Math.abs(abc.charAt(i-1) - abc.charAt(i)) <= 13) {
//				
//				answer += Math.abs(abc.charAt(i-1) - abc.charAt(i));
//				System.out.println(Math.abs(abc.charAt(i-1) - abc.charAt(i)));
//				
//			} else if(Math.abs(abc.charAt(i-1) - abc.charAt(i)) > 13) {
//				
//				answer += Math.abs(Math.abs(abc.charAt(i-1) - abc.charAt(i))-26);
//				System.out.println(Math.abs(Math.abs(abc.charAt(i-1) - abc.charAt(i))-26));
//			}
//			
//		}
//		
//		
//		System.out.println(answer + "총거리");
//		
		
		
		
//		a26 b25 c24 d23 e22 f21  g20  h19 i18 j17 k16 l15 m14
//		n13 o12 p11 q10 r09 s08  t07  u06 v05 w04 x03 y02 z01
//		
//		a01 b02 c03 d04 e05 f06  g07  h08 i09 j10 k11 l12 m13
//		n14 o15 p16 q17 r18 s19  t20  u21 v22 w23 x24 y25 z26
		
		
//		a to c
//		+2 -24
//		+28 -50
		
//		c to e
//		+2 -24
//		+28 -50
		
//		List<Integer[][]> ls = new ArrayList<>();
//		for(int i = 0; i < 26; i ++) {
//			ls.add(i);
//		}
//		for(int i = 0; i < 26; i ++) {
//			ls.add(i);
//		}
		
		Integer[][] arr = new Integer[52][2];
		
		int a = 97;
		int b = 26;
		
		for(int i = 0; i < 26; i ++) {
			arr[i][0] = a;
			arr[i][1] = b;
			a++;
			b--;
		}
		a = 97;
		b = 1;
		for(int i = 26; i < 52; i ++) {
			arr[i][0] = a; 
			arr[i][1] = b;
			a++;
			b++;
		}
		System.out.println(Arrays.deepToString(arr));
		
		int tmp1 = 0;
		int tmp2 = 0;
		int tmp3 = 0;
		int tmp4 = 0;
		
		
		int c = arr[4][0] - arr[2][0]; 
		
//		if(a >= 0 ) {
//			for(int i = arr[2][0]+1 ; i <= arr[4][0]; i ++) {
//				tmp1 += i; 
//			}
//			
//			for(int i = ls.get(2)+1; i <= ls.get(4)+26; i ++) {
//				tmp2 += i;
//			}
//			
////			for(int i = ls.get(2)-1; i >= ls.get(0); i --) {
////				tmp3 += i;
////			}	// a일때 성립안됨
//			
//			for(int i = ls.get(ls.size()-1); i >= 52-26-a-(ls.get(2)-1)-ls.get(0); i --) {
//				tmp3 += i;
//				
//			}
//			
//			
//		}
		
		
		
	
		System.out.println(tmp1);
		System.out.println(tmp2);
		System.out.println(tmp3);
		
		
		
		
		
		
	} // main
	
	
} // end class