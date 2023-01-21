package org.zerock.myapp.programmers.lv2;
class Solution {
    boolean solution(String s) {
   
		if(s.charAt(s.length()-1) == '(') {
			return false;
		}
		
		if(s.charAt(0) == ')') {
			return false;
		}
		int ¿Þ°ýÈ£ = 0;
		int ¿À¸¥°ýÈ£ = 0;
		
		for(int i = 0; i < s.length(); i ++) {
			if(s.charAt(i) == '(') {
				¿Þ°ýÈ£ ++;
			} else {
				¿À¸¥°ýÈ£ ++;
			}
			if(¿Þ°ýÈ£ < ¿À¸¥°ýÈ£) {
				return false;
			}
		}
		
		if(¿Þ°ýÈ£ == ¿À¸¥°ýÈ£) {
			return true;
		} else {
			return false;
		}
		
        
        
    }
}