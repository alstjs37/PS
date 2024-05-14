import java.util.*;
class Solution {
    public String solution(String s) {
        String[] answer = s.split("");
        Arrays.sort(answer, Collections.reverseOrder());
        
        StringBuilder sb = new StringBuilder();
        for(String str: answer) {
            sb.append(str);
        }
        return sb.toString();
    }
}