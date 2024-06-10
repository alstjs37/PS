class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        int cnt = 0;
        for(int i = 1; i <= number; ++i) {
            double temp = Math.sqrt(i);
            for(int j = 1; j <= temp; ++j) {
                if(i % j == 0) {
                    cnt++;
                }
            }
            cnt = temp%1 == 0 ? cnt*2-1 : cnt*2;
            
            if(cnt > limit) {
                answer += power;
            } else {
                answer += cnt;
            }
            cnt = 0;
        }
        
        return answer;
    }
}