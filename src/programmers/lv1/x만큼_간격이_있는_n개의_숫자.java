package programmers.lv1;

import java.util.Arrays;

public class x만큼_간격이_있는_n개의_숫자 {

    public static void main(String[] args) {

        int x = 2;
        int n = 5;

        long[] answer = new long[n];

        answer[0] = x;

        for (int i = 1; i < n; i++) {
            answer[i] = answer[i-1] + x;
        }


        System.out.println(Arrays.toString(answer));

    }
}
