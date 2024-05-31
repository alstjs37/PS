import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < score.length; ++i) {
            if(i < k) {
                list.add(score[i]);
                answer[i] = list.stream().mapToInt(x->x).min().getAsInt();
            } else {
                int minValue = list.stream().mapToInt(x->x).min().getAsInt();
                if(score[i] > minValue) {
                    list.remove(Integer.valueOf(minValue));
                    list.add(score[i]);
                }
                answer[i] = list.stream().mapToInt(x->x).min().getAsInt();
            }
        }
        
        return answer;
    }
}