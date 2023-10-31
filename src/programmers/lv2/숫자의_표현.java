package programmers.lv2;

public class 숫자의_표현 {

    public static int solution(int n){
        int answer = 0;

        for (int i = 1; i <= n/2; i++) {
        int temp = i;

            for (int j = i+1; j < n; j++) {

                temp += j;

                if(n == temp){
                    answer ++;
                    break;
                } else if(temp >n){
                    break;
                }
            }
        }
        return answer+1;
    }
    public static void main(String[] args) {

        int n = 15;
        System.out.println(solution(n));

    }
}
