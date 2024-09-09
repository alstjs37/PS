import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        Deque<Character> stack = new ArrayDeque<>();
        char[] ch = s.toCharArray();
        for(int i = 0; i < ch.length; ++i) {
            if(!stack.isEmpty() && stack.peekLast() == ch[i]) {
                stack.removeLast();
            } else {
                stack.offerLast(ch[i]);
            }
        }
        if(stack.isEmpty()) answer = 1;

        return answer;
    }
}