package programmers.lv2;
class Solution {
	boolean solution(String s) {

		if(s.charAt(s.length()-1) == '(') {
			return false;
		}

		if(s.charAt(0) == ')') {
			return false;
		}
		int 왼괄호 = 0;
		int 오른괄호 = 0;

		for(int i = 0; i < s.length(); i ++) {
			if(s.charAt(i) == '(') {
				왼괄호 ++;
			} else {
				오른괄호 ++;
			}
			if(왼괄호 < 오른괄호) {
				return false;
			}
		}

		if(왼괄호 == 오른괄호) {
			return true;
		} else {
			return false;
		}



	}
}