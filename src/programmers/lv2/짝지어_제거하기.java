package programmers.lv2;

import java.util.Stack;

public class 짝지어_제거하기 {

    public static int solution(String s){
        int answer = -1;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if(stack.isEmpty() || stack.peek() != s.charAt(i)) {
                stack.push(s.charAt(i));
            } else if(stack.peek() == s.charAt(i)){
                stack.pop();
            }
        }

        answer = stack.isEmpty()? 1 : 0;


        return answer;
    }
    public static void main(String[] args) {

        String s = "cdcd";
        System.out.println(solution(s));

    }
}
