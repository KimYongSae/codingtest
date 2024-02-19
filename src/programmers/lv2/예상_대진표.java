package programmers.lv2;

public class 예상_대진표 {
    public static int solution(int n, int a, int b){
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if((a < b && a+1 == b && a%2 == 1) || (a > b && b+1 == a && b % 2 == 1)){
                // 작은쪽이 홀수면 조건이 추가되어야함
                answer = i;
                break;
            } else{
                a = (int) Math.round((double) a / 2);
                b = (int) Math.round((double) b / 2);
            }
        }


        return answer;
    }
    public static void main(String[] args) {

        int n = 8;
        int a = 4;
        int b = 7;
        int temp = 1;
        System.out.println(solution(n, a, b));
        //System.out.println((int) Math.round((double) temp / 2));
    }
}
