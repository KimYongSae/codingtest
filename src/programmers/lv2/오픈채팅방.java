package programmers.lv2;

import java.util.ArrayList;
import java.util.HashMap;

public class 오픈채팅방 {
    public static ArrayList<String> solution(String[] record) {

        ArrayList<String> answer = new ArrayList<>();
//        String[] answer = new String[record.length];
        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < record.length; i++) {
            String[] tmparr = record[i].split(" ");
            if (tmparr[0].equals("Enter") || tmparr[0].equals("Change")){
                map.put(tmparr[1], tmparr[2]);
            }

        }

        for (int i = 0; i < record.length; i++) {
            String[] tmparr = record[i].split(" ");
            if (tmparr[0].equals("Enter")){
                answer.add(map.get(tmparr[1])+"님이 들어왔습니다.");
            } else if (tmparr[0].equals("Leave")) {
                answer.add(map.get(tmparr[1])+"님이 나갔습니다.");
            }

        }

        return answer;
    }


    public static void main(String[] args) {


        String[] record = { "Enter uid1234 Muzi",
                            "Enter uid4567 Prodo",
                            "Leave uid1234",
                            "Enter uid1234 Prodo",
                            "Change uid4567 Ryan"};
        System.out.println(solution(record));
    }

}
