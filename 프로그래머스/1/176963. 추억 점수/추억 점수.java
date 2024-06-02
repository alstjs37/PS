import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < name.length; ++i) {
            map.put(name[i], yearning[i]);
        }
        
        int idx = 0;
        for(String[] array: photo) {
            int score = 0;
            for(String elem: array) {
                if(map.containsKey(elem))
                    score += map.get(elem);
            }
            answer[idx++] = score;
        }
        
        return answer;
    }
}