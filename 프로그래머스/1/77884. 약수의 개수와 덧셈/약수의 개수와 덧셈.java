import java.util.*;
class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        
        for(int i = left; i <= right; ++i) {
            for(int j = 1; j <= i; ++j) {
                if(i % j == 0) {
                    list.add(j);
                }
            }
            if(list.size() % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
            list.clear();
        }
        return answer;
    }
}