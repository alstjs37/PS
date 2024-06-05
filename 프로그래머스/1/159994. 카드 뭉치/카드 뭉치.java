class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        
        int idx1 = 0;
        int idx2 = 0;
        boolean canMake = true;
        
        for(int i = 0; i < goal.length; ++i) {
            if(idx1 < cards1.length && cards1[idx1].equals(goal[i])) {
                idx1++;
                continue;
            }
            
            if(idx2 < cards2.length && cards2[idx2].equals(goal[i])) {
                idx2++;
                continue;
            }
            
            canMake = false;
            break;
        }
        
        if(canMake) answer = "Yes";
        else answer = "No";
        
        return answer;
    }
}