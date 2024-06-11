import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        
        int[] userStay = new int[N+2];
        for(int stage: stages) {
            userStay[stage]++;
        }
        
        int peopleNum = stages.length;
        Map<Integer, Double> failure = new HashMap<>();
        for(int i = 1; i < N+1; ++i) {
            if(peopleNum == 0) {
                failure.put(i, 0.0);
            } else {
                double temp = userStay[i] / (double)peopleNum;
                failure.put(i, temp);
            }
            peopleNum -= userStay[i];
        }
        System.out.println(failure);
        
        List<Integer> keySet = new ArrayList<>(failure.keySet());
        Collections.sort(keySet, (v1, v2) -> (failure.get(v2).compareTo(failure.get(v1))));
        
        int idx = 0;
        for(int elem: keySet) {
            answer[idx++] = elem;
        }
        
        return answer;
    }
}