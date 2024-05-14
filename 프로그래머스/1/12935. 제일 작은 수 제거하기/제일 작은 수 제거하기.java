import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) {
            return new int[] {-1};
        }
        
        int[] answer = new int[arr.length-1];
        
        int minValue = arr[0];
        for(int n: arr) {
            if(minValue > n) {
                minValue = n;
            }
        }
        
        int idx = 0;
        for(int n: arr) {
            if(n != minValue) {
                answer[idx++] = n;
            }
        }
        return answer;
    }
}