import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        char[] ch = s.toCharArray();
        int n = ch.length;
        Deque<Character> stack = new ArrayDeque<>();
        
        for(int i = 0; i < n; ++i) {
            for(int j = i; j < i+n; ++j) {
                char temp = ch[j%n];
                
                if(temp == '[' || temp == '(' || temp == '{') {
                    stack.offerLast(temp);
                } else {
                    if(temp == ']') {
                        if(!stack.isEmpty() && stack.peekLast() == '[') {
                            stack.removeLast();
                        } else {
                            stack.offerLast(temp);
                        }
                    } else if(temp == ')') {
                        if(!stack.isEmpty() && stack.peekLast() == '(') {
                            stack.removeLast();
                        } else {
                            stack.offerLast(temp);
                        }
                    } else if(temp == '}') {
                        if(!stack.isEmpty() && stack.peekLast() == '{') {
                            stack.removeLast();
                        } else {
                            stack.offerLast(temp);
                        }
                    }
                }
            }
            
            if(stack.isEmpty()) {
                answer++;
            }
            stack.clear();
        }
        
        return answer;
    }
}