package programmers.lv2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 영어_끝말잇기 {

    public static int[] solution(int n, String[] words){
        int[] answer = {0, 0};
        char temp = 0;
        Map<String, Integer> m = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            int a;
            if((i+1) % n == 0){
                a = n;
            } else{
                a = (i+1) % n;
            }
            int b = (int)Math.ceil((double)(i + 1) / n);

            if(!m.containsKey(words[i]) && (temp == 0 || words[i].charAt(0) == temp)){
                m.put(words[i], i);
                temp = words[i].charAt(words[i].length()-1);
            } else{
                answer = new int[]{a, b};
                break;
            }

        }

        return answer;
    }
    public static void main(String[] args) {

        int n = 3;
        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        //String[] words = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
        //String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};
        System.out.println(Arrays.toString(solution(n, words)));

    }
}
