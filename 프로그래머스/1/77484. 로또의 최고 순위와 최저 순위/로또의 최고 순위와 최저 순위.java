import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        List<Integer> lottoList = new ArrayList<>();
        List<Integer> winNumsList = new ArrayList<>();
        
        int zeroCnt = 0;
        for(int lotto: lottos) {
            if(lotto == 0) {
                zeroCnt++;
                continue;
            }
            lottoList.add(lotto);
        }
        
        for(int num: win_nums) {
            winNumsList.add(num);
        }
        
        int bSize = lottoList.size();
        lottoList.removeAll(winNumsList);
        int aSize = lottoList.size();
        
        int correct = bSize - aSize;
        
        answer[0] = (7 - correct - zeroCnt > 6) ? 6 : 7-correct-zeroCnt;
        answer[1] = (answer[0] + zeroCnt > 6) ? 6 : answer[0] + zeroCnt;
        
        return answer;
    }
}