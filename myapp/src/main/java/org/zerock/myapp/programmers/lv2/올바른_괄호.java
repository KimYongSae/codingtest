package org.zerock.myapp.programmers.lv2;
class Solution {
    boolean solution(String s) {
   
		if(s.charAt(s.length()-1) == '(') {
			return false;
		}
		
		if(s.charAt(0) == ')') {
			return false;
		}
		int �ް�ȣ = 0;
		int ������ȣ = 0;
		
		for(int i = 0; i < s.length(); i ++) {
			if(s.charAt(i) == '(') {
				�ް�ȣ ++;
			} else {
				������ȣ ++;
			}
			if(�ް�ȣ < ������ȣ) {
				return false;
			}
		}
		
		if(�ް�ȣ == ������ȣ) {
			return true;
		} else {
			return false;
		}
		
        
        
    }
}