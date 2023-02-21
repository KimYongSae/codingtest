package programmers.lv2;

import java.util.Arrays;
import java.util.HashSet;

public class 롤케이크_자르기 {

    public static int Solution(int[] topping){
        HashSet<Integer> hs = new HashSet<>();

        int[] tmp1 = new int[topping.length];
        int[] tmp2 = new int[topping.length];

        for (int i = 0; i < topping.length; i++) {
            hs.add(topping[i]);
            tmp1[i] = hs.size();

        }
        hs.clear();
        for (int i = topping.length-1; i >= 0; i--) {
            hs.add(topping[i]);
            tmp2[i] = hs.size();

        }

        int answer = 0;

        for (int i = 0; i < topping.length-1; i++) {
            if (tmp1[i] == tmp2[i+1]) {
                answer ++;
            }
        }




    return answer;
    }

    public static void main(String[] args) {

        int[] topping = {1, 2, 1, 3, 1, 4, 1, 2};

        System.out.println(Solution(topping));

    }
}
