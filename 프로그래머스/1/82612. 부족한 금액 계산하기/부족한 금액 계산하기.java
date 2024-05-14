class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        
        long num = 0l;
        for(int i = 1; i <= count; ++i) {
            num += i;
        }
        answer = (num * price) - (long)money;
        if (answer <= 0) {
            answer = 0;
        }
        return answer;
    }
}