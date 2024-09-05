import java.util.*;

class Solution {
    boolean solution(String s) {
        
        Deque<Character> stack = new ArrayDeque<>();
        
        char[] ch = s.toCharArray();
        for(char c: ch) {
            if(!stack.isEmpty() && c == ')' && stack.peekLast() == '(') {
                stack.pop();
            } else stack.push(c);
        }

        return stack.isEmpty();
    }
}