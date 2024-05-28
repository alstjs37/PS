import java.util.*;
class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < s.length(); ++i) {
            char alpha = s.charAt(i);
            
            if(alpha == ' ') {
                sb.append(' ');
                continue;
            }
            
            if(Character.isUpperCase(alpha)) {
                char c = (char) ('A' + (alpha+n-'A')%26);
                sb.append(c);
            } else {
                char c = (char) ('a' + (alpha+n-'a')%26);
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}