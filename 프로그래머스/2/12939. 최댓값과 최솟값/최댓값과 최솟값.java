import java.util.*;

class Solution {
    public String solution(String s) {
        
        String[] sArray = s.split(" ");
        int[] arr = new int[sArray.length];
        int idx = 0;
        for(String elem: sArray) {
            if(" ".equals(elem)) continue;
            arr[idx++] = Integer.parseInt(elem);
        }
        StringBuilder answer = new StringBuilder();
        
        answer.append(Arrays.stream(arr).min().orElse(0));
        answer.append(" ");
        answer.append(Arrays.stream(arr).max().orElse(0));
        
        return answer.toString();
    }
}