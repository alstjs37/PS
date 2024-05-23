import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        Map<String, Integer> map = new HashMap<>();
        
        for(String[] clothe: clothes) {
            if(!map.containsKey(clothe[1])) {
                map.put(clothe[1], 1);
            } else {
                map.put(clothe[1], map.get(clothe[1])+1);
            }
        }
        
        Iterator<Integer> it = map.values().iterator();
        while(it.hasNext()) {
            answer *= it.next().intValue() + 1;
        }
        
        return answer-1;
    }
}