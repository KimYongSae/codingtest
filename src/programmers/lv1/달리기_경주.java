package programmers.lv1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class 달리기_경주 {

    public static String[] solution(String[] players, String[] callings) {

        Map<String, Integer> piMap = new HashMap();
        for (int i = 0; i < players.length; i++) {
            piMap.put(players[i], i);
        }

        for (String call :
                callings) {
            int idx = piMap.get(call);

            String temp = players[idx];
            players[idx] = players[idx-1];
            players[idx-1] = temp;

            piMap.put(players[idx], idx);
            piMap.put(players[idx - 1], idx - 1);


        }




        /*for (int i = 0; i < callings.length; i++) {

            for (int j = 0; j < players.length; j++) {
                if (Objects.equals(callings[i], players[j])){
                    String temp = players[j];
                    players[j] = players[j-1];
                    players[j-1] = temp;
                    break;
                }
            }

        }*/

        return players;
    }

    public static void main(String[] args) {

        String[] players = {"mumu", "soe", "poe", "kai", "mine"};

        String[] callings = {"kai", "kai", "mine", "mine"};

        System.out.println(Arrays.toString(solution(players, callings)));

    }




}
