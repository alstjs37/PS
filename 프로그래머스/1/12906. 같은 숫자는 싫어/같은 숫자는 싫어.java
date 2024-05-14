import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        
        for(int elem: arr) {
            if(!stack.isEmpty()) {
                if(stack.peek() != elem) {
                    stack.push(elem);
                }
            } else{
                stack.push(elem);
            }
        }
        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}