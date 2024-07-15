package base;

import java.util.HashMap;
import java.util.Map;

public class running_race {
    public String[] solution(String[] players, String[] callings) {

        String[] answer = players;

        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i<players.length; i++) map.put(players[i],i);
        //["mumu", "soe", "poe", "kai", "mine"]

        for(int j = 0; j<callings.length; j++) {
            //["kai", "kai", "mine", "mine"]

            int rank = map.get(callings[j]);
            // 방금 불린 사람의 순위
            String name = answer[rank-1];
            // 방금 불린 사람의 앞에 있던 사람의 이름

            answer[rank-1] = answer[rank];
            answer[rank] = name;
            map.put(answer[rank-1], rank-1);
            map.put(answer[rank], rank);

        }

        return answer;
    }
}
