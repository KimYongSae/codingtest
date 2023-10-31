package programmers.lv1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 추억_점수 {

    public static int[] solution(String[] name, int[] yearning, String[][] photo){
        int[] answer = new int[photo.length];

        Map<String, Integer> mapping = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            mapping.put(name[i], yearning[i]);
        }

        for (int i = 0; i < photo.length; i++) {
            int temp = 0;

            for (int j = 0; j < photo[i].length; j++) {

                if (mapping.get(photo[i][j]) != null) {
                    temp += mapping.get(photo[i][j]);
                }

            }
            answer[i] = temp;
            temp = 0;
        }

        return answer;
    }


    public static void main(String[] args) {

        String[] name = {"may", "kein", "kain", "radi"};

        int[] yearning = {5, 10, 1, 3};

        String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};

        System.out.println(Arrays.toString(solution(name, yearning, photo)));

    }
}
