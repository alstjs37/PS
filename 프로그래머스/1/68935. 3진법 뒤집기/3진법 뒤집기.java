import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        StringBuilder sb = new StringBuilder();
        while(n >= 3) {
            sb.append(n % 3);
            n = n / 3;
        }
        sb.append(n);
        
        int i = sb.length();
        
        for(char num: sb.toString().toCharArray()) {
            answer += (num - '0') * Math.pow(3, i-1);
            i -= 1;
        }
        
        return answer;
    }
}