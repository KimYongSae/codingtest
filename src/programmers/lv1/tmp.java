package programmers.lv1;

import java.util.Stack;

public class tmp {

    public static void main(String[] args) {

        int[] arr = {1, 1, 3, 3, 0, 1, 1};

        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if(st.peek() == null || st.peek() != arr[i] ){
                st.push(arr[i]);
            }
        }

        Integer[] answer = st.toArray(new Integer[st.size()]);

        st.toar
        System.out.println(st);
    }

}
