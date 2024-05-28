import java.util.*;
class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        String[] sArray = s.split("");
        
        int idx = 0;
        for(String elem: sArray) {
            if(elem.equals(" ")) {
                idx = 0;
                sb.append(elem);
                continue;
            }
            
            if(idx%2 == 0) {
                sb.append(elem.toUpperCase());
            } else {
                sb.append(elem.toLowerCase());
            }
            idx += 1;
        }    
        
        return sb.toString();
    }
}