package org.zerock.myapp.baekjoon;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Solution2 {

	public static void main(String[] args) {

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
		
//		a26 b25 c24 d23 e22 f21  g20  h19 i18 j17 k16 l15 m14
//		n13 o12 p11 q10 r09 s08  t07  u06 v05 w04 x03 y02 z01
//		
//		a01 b02 c03 d04 e05 f06  g07  h08 i09 j10 k11 l12 m13
//		n14 o15 p16 q17 r18 s19  t20  u21 v22 w23 x24 y25 z26
		
		
		Deque<Integer[][]> dq = new LinkedList<>();		
		dq.add(arr);
		
		
		
		
	}

}
