class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        
        int t = bandage[0];
        int x = bandage[1];
        int y = bandage[2];
        
        int last = attacks[attacks.length-1][0];
        int max_health = health;
        int cnt = 0;
        int j = 0;
        
        int answer = 0;
        for(int i = 1; i <= last; ++i) {
            cnt++;
            
            if(attacks[j][0] == i) {
                cnt = 0;
                health -= attacks[j][1];
                if(health <= 0) {
                    break;
                }
                j++;
            } else if(cnt == t) {
                health = Math.min(max_health, health+y+x);
                cnt = 0;
            } else {
                health = Math.min(max_health, health+x);
            }
        }
        
        if(health <= 0) {
            answer = -1;
        } else answer = health;
        
        return answer;
    }
}