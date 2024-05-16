import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        
        int[] one = {1, 2, 3, 4, 5}; 
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] cnt = new int[3];
        for(int i = 0; i < answers.length; ++i) {
            if(one[i%5] == answers[i]) {
                cnt[0]++;
            }
            
            if(two[i%8] == answers[i]) {
                cnt[1]++;
            }
            
            if(three[i%10] == answers[i]) {
                cnt[2]++;
            }
        }
        
        int maxValue = Arrays.stream(cnt).max().getAsInt();
        
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < cnt.length; ++i) {
            if(cnt[i] == maxValue) {
                list.add(i+1);
            }      
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}