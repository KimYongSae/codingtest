package programmers.lv1;

public class 크기가_작은_부분문자열 {

    public static void main(String[] args) {
        String t = "500220839878";
        String p = "7";
        int result = 0;


        for (int i = 0; i < t.length()-p.length(); i++) {
            int substring = Integer.parseInt(t.substring(i, i+p.length()));

            if( substring <= Integer.parseInt(p)){
                result++;
            }
        }


        System.out.println(result);
    }
}
