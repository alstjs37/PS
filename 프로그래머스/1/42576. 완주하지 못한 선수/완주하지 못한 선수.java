import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Map<String, Integer> map = new HashMap<>();
        for(String partName: participant) {
            map.put(partName, map.getOrDefault(partName, 0) + 1);
        }
        
        for(String completeName: completion) {
            map.put(completeName, map.get(completeName) - 1);
        }

        for(String partName: participant) {
            if(map.get(partName) == 1) {
                answer += partName;
                break;
            }
        }
        
        return answer;
    }
}