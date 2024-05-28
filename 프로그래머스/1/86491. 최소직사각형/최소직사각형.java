import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int min, max;
        int[] minArray = new int[sizes.length];
        int[] maxArray = new int[sizes.length];
        
        int idx = 0;
        for(int[] size: sizes) {
            min = Math.min(size[0], size[1]);
            max = Math.max(size[0], size[1]);
            
            minArray[idx] = min;
            maxArray[idx] = max;
            
            idx++;
        }
        
        int totalMin = Arrays.stream(minArray).max().getAsInt();
        int totalMax = Arrays.stream(maxArray).max().getAsInt();
        return totalMin * totalMax;
    }
}