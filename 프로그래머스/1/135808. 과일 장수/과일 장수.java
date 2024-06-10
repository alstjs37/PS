import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {       
        if(score.length < m) {
            return 0;
        }
        
        List<Integer> list = new ArrayList<>();
        for(int elem: score) {
            list.add(elem);
        }
        
        int answer = 0;
        int n = score.length / m;
        
        Collections.sort(list, Collections.reverseOrder());
        
        int idx = 0;
        for(int i = 0; i < n; ++i) {
            answer += list.get(idx+(m-1)) * m;
            idx += m;
        }
        
        return answer;
    }
}