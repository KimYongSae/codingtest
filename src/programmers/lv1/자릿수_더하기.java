package programmers.lv1;

public class 자릿수_더하기 {

    public static void main(String[] args) {

        int answer = 0;
        int n = 987;
        String str = Integer.toString(n);

        for (int i = 0; i < str.length(); i++) {
            answer += Integer.parseInt(String.valueOf(str.charAt(i)));

        }
        System.out.println("answer = " + answer);
    }
}
