package programmers.lv2;

import java.util.*;

public class 괄호_회전하기 {

    public static int solution(String s){
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            s = s.substring(1) + s.charAt(0);
            if(abc(s)) answer++;
        }
        return answer;
    }

    public static boolean abc(String s){
        int answer = 0;
        Stack<Character> q = new Stack<>();
        Map<Character, Character> m = new HashMap<>();
        m.put('}', '{');
        m.put(']', '[');
        m.put(')', '(');
        boolean result = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                q.push(s.charAt(i));

            } else if (s.charAt(i) == '}' || s.charAt(i) == ']' || s.charAt(i) == ')') {
                if(q.isEmpty()){
                    return false;
                } else {
                    if(q.peek() == m.get(s.charAt(i))){
                        q.pop();
                    } else{
                        return false;
                    }
                }
            }
        }



        return q.isEmpty();
    }
    public static void main(String[] args) {

        String s = "[)(]";
        System.out.println(solution(s));

    }
}
