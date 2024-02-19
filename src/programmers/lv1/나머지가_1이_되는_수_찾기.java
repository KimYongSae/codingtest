package programmers.lv1;

public class 나머지가_1이_되는_수_찾기 {

    public static void main(String[] args) {
        int answer = 0;
        int n = 10;

        for (int i = 1; i < n; i++) {
            if(n%i==1){
                answer = i;
                break;
            }

        }

        System.out.println("answer = " + answer);

    }
}
