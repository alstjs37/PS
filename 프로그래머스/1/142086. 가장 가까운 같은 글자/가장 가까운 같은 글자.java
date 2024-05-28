import java.util.*;
class Solution {
    public int[] solution(String s) {
        String[] sArray = s.split("");
        Map<String, Integer> map = new HashMap<>();
        
        int[] answer = new int[sArray.length];
        for(int i = 0; i < sArray.length; ++i) {
            if(!map.containsKey(sArray[i])) {
                map.put(sArray[i], i);
                answer[i] = -1;
            } else {
                answer[i] = i - map.get(sArray[i]);
                map.put(sArray[i], i);
            }
        }
        return answer;
    }
}